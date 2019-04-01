package com.querojogo.migration.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.repository.UsuarioRepository;
import com.querojogo.migration.service.UsuarioService;

@Service
public class MensagemServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario encontrarUsuarioPeloEmail(String email) {
		return this.usuarioRepository.findByEmail( email );
	}

	@Override
	public Usuario criarOrAtualizarUsuario(Usuario usuario) {
		return this.usuarioRepository.save( usuario );
	}

	@Override
	public Optional<Usuario> encontrarPeloId(String id) {
		return this.usuarioRepository.findById( id );
	}

	@Override
	public void excluirUsuario(String id) {
		this.usuarioRepository.deleteById( id  );	
	}

	@Override
	public Page<Usuario> encontrarTodosUsuarios(int pagina, int count) {
		
//		Pageable pages = new PageRequest( pagina, count );
		return this.usuarioRepository.findAll( PageRequest.of( pagina, count) );
	}

}
