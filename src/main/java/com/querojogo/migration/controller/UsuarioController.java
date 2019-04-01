package com.querojogo.migration.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.DuplicateKeyException;
import com.querojogo.migration.api.Response;
import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.enums.PadraoEnum;
import com.querojogo.migration.service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@PostMapping
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<Response<Usuario>> criar( HttpServletRequest request, @RequestBody Usuario usuario, BindingResult result ){
		Response<Usuario> response = new Response<Usuario>();
		
		try {
			validarCriarUsuario( usuario, result );
			if( result.hasErrors() ) {
				result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
				return ResponseEntity.badRequest().body( response );
				
			}
			
			usuario.setSenha( passwordEncoder.encode( usuario.getSenha() ) );
			Usuario usuarioBanco = (Usuario) usuarioService.criarOrAtualizarUsuario( usuario );
			response.setData( usuarioBanco );
			
		}catch( DuplicateKeyException de ) {
			response.getErros().add( "Email já registrado." );
			return ResponseEntity.badRequest().body( response );
 		}catch( Exception e ) {
			response.getErros().add( e.getMessage() );
			return ResponseEntity.badRequest().body( response );
 		}
		
		return ResponseEntity.ok( response );
	}

	@PutMapping
	@PreAuthorize("hasAnyRole('ADMIN')") 
	public ResponseEntity<Response<Usuario>> atualizar( HttpServletRequest request, @RequestBody Usuario usuario, BindingResult result ) {
		Response<Usuario> response = new Response<Usuario>();
		
		try {
			validarAtualizarUsuario( usuario, result );
			if( result.hasErrors() ) {
				result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
				return ResponseEntity.badRequest().body( response );
				
			}
			
			usuario.setSenha( passwordEncoder.encode( usuario.getSenha() ) );
			Usuario usuarioBanco = (Usuario) usuarioService.criarOrAtualizarUsuario( usuario );
			response.setData( usuarioBanco );
			
		}catch( Exception e ) {
			response.getErros().add( e.getMessage() );
			return ResponseEntity.badRequest().body( response );
 		}
		
		return ResponseEntity.ok( response );
	}
	
	private void validarCriarUsuario( Usuario usuario, BindingResult result ) {
		if(  usuario.getEmail() == null || PadraoEnum.VAZIO.equals( usuario.getEmail() )) {
			result.addError( new ObjectError( "Usuario", "Nenhum email informado." ) );
		}
	}
	
	private void validarAtualizarUsuario( Usuario usuario, BindingResult result ) {
		if(  usuario.getEmail() == null || usuario.getId() == null  ) {
			result.addError( new ObjectError( "Usuario", "Nenhum usuário existente." ) );
		}
	}
	
	@GetMapping( value = "{id}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<Response<Usuario>> encontrarUsuarioPorId( @PathVariable("id") String id){
		Response<Usuario> response = new Response<Usuario>();
		Optional<Usuario> usuario = usuarioService.encontrarPeloId(id);
		

		if( !usuario.isPresent() ) {
			response.getErros().add("Usuario não encontrado.");
			return ResponseEntity.badRequest().body( response );
			
		}
		
		response.setData( usuario.get() );
		return ResponseEntity.ok( response );
		
		
	}
	
	@DeleteMapping( value = "{id}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<Response<String>> deleteUsuario( @PathVariable("id") String id){
		Response<String> response = new Response<String>();
		Optional<Usuario> usuario = usuarioService.encontrarPeloId(id);
		
		if( !usuario.isPresent() ) {
			response.getErros().add("Usuario não encontrado." + id);
			return ResponseEntity.badRequest().body( response );
			
		}
		
		usuarioService.excluirUsuario(id);
		return ResponseEntity.ok( new Response<String>() );
	}
	
	@GetMapping( value = "{page}/{count}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public ResponseEntity<Response<Page<Usuario>>> deleteUsuario( @PathVariable int page, @PathVariable int count){
		Response<Page<Usuario>> response = new Response<Page<Usuario>>();
		
		Page<Usuario> usuarios = usuarioService.encontrarTodosUsuarios( page, count );
		response.setData( usuarios );
		return ResponseEntity.ok( response );
	}
	
}
