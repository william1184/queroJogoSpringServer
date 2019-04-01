package com.querojogo.migration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.querojogo.migration.entity.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	
	Usuario findByEmail(String email);

	
}
