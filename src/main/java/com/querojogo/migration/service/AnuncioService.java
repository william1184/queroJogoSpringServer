package com.querojogo.migration.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.querojogo.migration.entity.Anuncio;

public interface AnuncioService {
	
	Anuncio encontrarAnuncioPeloNome(String nome);
	
	Anuncio criarOrAtualizarAnuncio(Anuncio anuncio);
	
	Optional<Anuncio> encontrarPeloId(String id);
	
	void excluirAnuncio(String id);
	
	Page<Anuncio> encontrarTodosAnuncios(int pagina, int count);

}
