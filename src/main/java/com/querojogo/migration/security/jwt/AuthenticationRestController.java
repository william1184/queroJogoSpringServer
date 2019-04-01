package com.querojogo.migration.security.jwt;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.security.model.CurrentUser;
import com.querojogo.migration.service.UsuarioService;

@RestController
@CrossOrigin( origins = "*" )
public class AuthenticationRestController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping( value="/api/auth" )
	public ResponseEntity<?> createAuthenticationToken( @RequestBody JwtAuthenticationRequest authenticationRequest ) {
		final Authentication authentication = authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							authenticationRequest.getEmail(),
							authenticationRequest.getPassword()
							)
					);
		SecurityContextHolder.getContext().setAuthentication( authentication );
		final UserDetails userDetails = userDetailsService.loadUserByUsername( authenticationRequest.getEmail() );
		final String token = jwtTokenUtil.generateToken( userDetails );
		final Usuario usuario = usuarioService.encontrarUsuarioPeloEmail( authenticationRequest.getEmail() );
		usuario.setSenha( null );
		
		return ResponseEntity.ok( new CurrentUser( token, usuario ) );
		
	}
	
	@PostMapping( value="/api/refresh" )
	public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request){
		String token = request.getHeader( "Authorization" );
		String username = jwtTokenUtil.getUsernameFromToken( token );
		final Usuario usuario = usuarioService.encontrarUsuarioPeloEmail( username );
		
		if( jwtTokenUtil.canTokenBeRefreshed( token ) ) {
			String refreshedToken = jwtTokenUtil.refreshToken( token );
			return ResponseEntity.ok( new CurrentUser( refreshedToken, usuario ) );
		}
		
		return ResponseEntity.badRequest().body( null );
		
	}
	
	
}
