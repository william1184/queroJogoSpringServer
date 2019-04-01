package com.querojogo.migration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.querojogo.migration.entity.Jogo;

public interface JogoRepository extends MongoRepository<Jogo, String> {

}
