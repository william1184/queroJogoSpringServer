package com.querojogo.migration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.querojogo.migration.entity.Mensagem;
import com.querojogo.migration.entity.Usuario;

public interface MensagemRepository extends MongoRepository<Mensagem, String> {

	Mensagem findByIdConversa(String idConversa);

}
