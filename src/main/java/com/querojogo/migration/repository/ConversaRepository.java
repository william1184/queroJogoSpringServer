package com.querojogo.migration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.querojogo.migration.entity.Conversa;
import com.querojogo.migration.entity.Usuario;

public interface ConversaRepository extends MongoRepository<Conversa, String>{
	
	Usuario findByIdUsuariosConversa(String idUsuarioConversa);

}
