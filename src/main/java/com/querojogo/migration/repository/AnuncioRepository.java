package com.querojogo.migration.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.querojogo.migration.entity.Anuncio;

@Repository
public interface AnuncioRepository extends MongoRepository<Anuncio, String> {
	
	Optional<Anuncio> findById(String id);
//	Page<Anuncio> getAnunciosOrdernadoPorDataASC( Pageable page, String data );
//	
//	Page<Anuncio> getAnunciosOrdernadoPorDataDESC( Pageable page, String data );
//	
//	Page<Anuncio> getAnunciosPeloTituloIgnoreCase( Pageable page, String titulo );
//	
//	Page<Anuncio> getAnunciosDoUsuario( Pageable page, Usuario usuario );

	Anuncio findByNome(String nome);
	
}
