package com.querojogo.migration.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.querojogo.migration.entity.Usuario;

public interface UsuarioService {
	
	Usuario encontrarUsuarioPeloEmail(String email);
	
	Usuario criarOrAtualizarUsuario(Usuario usuario);
	
	Optional<Usuario> encontrarPeloId(String id);
	
	void excluirUsuario(String id);
	
	Page<Usuario> encontrarTodosUsuarios(int pagina, int count);

}
