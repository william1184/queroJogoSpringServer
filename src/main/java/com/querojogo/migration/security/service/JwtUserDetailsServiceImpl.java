package com.querojogo.migration.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.security.jwt.JwtUserFactory;
import com.querojogo.migration.service.UsuarioService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Usuario usuario = usuarioService.encontrarUsuarioPeloEmail( email );
		if( usuario == null ) {
			throw new UsernameNotFoundException( String.format( "Nenhum usuário encontrado com o email '%s'", email ) );
		}
		
		return JwtUserFactory.create( usuario );
	}
	
	
}
