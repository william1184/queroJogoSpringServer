package com.querojogo.migration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.querojogo.migration.entity.Usuario;
import com.querojogo.migration.enums.TipoUsuarioEnum;
import com.querojogo.migration.repository.UsuarioRepository;

@SpringBootApplication
public class QueroJogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueroJogoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		return args ->{
			initUsers( usuarioRepository, passwordEncoder );
		};
	}
	
	
	private void initUsers(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		Usuario usuario = new Usuario();
		usuario.setEmail("williamsp1184@gmail.com");
		usuario.setSenha( passwordEncoder.encode( "123456" ) );
		usuario.setTipo( TipoUsuarioEnum.ROLE_ADMIN );
		
		Usuario usuarioBanco = usuarioRepository.findByEmail( usuario.getEmail() );
		if( usuarioBanco == null) {
			usuarioRepository.save( usuario );
		}
	}

}

