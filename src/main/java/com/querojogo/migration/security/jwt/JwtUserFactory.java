package com.querojogo.migration.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.enums.TipoUsuarioEnum;

public class JwtUserFactory {
	
	private JwtUserFactory() {
		
	}
	
	public static JwtUser create(Usuario usuario) {
		return new JwtUser(
				usuario.getId(),
				usuario.getEmail(),
				usuario.getSenha(),
				mapToGrantedAuthorities( usuario.getTipo() )
				);
	}
	
	private static List<GrantedAuthority> mapToGrantedAuthorities(TipoUsuarioEnum tipoUsuario) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add( new SimpleGrantedAuthority( tipoUsuario.toString() )  );
		return authorities;
	}
	
	
}
