package com.querojogo.migration.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.querojogo.migration.entity.Anuncio;
import com.querojogo.migration.repository.AnuncioRepository;
import com.querojogo.migration.service.AnuncioService;

@Service
public class AnuncioServiceImpl implements AnuncioService{

	@Autowired
	private AnuncioRepository anuncioRepository;

	@Override
	public Anuncio encontrarAnuncioPeloNome(String nome) {
		return this.anuncioRepository.findByNome( nome );
	}

	@Override
	public Anuncio criarOrAtualizarAnuncio(Anuncio anuncio) {
		return this.anuncioRepository.save( anuncio );
	}

	@Override
	public Optional<Anuncio> encontrarPeloId(String id) {
		return this.anuncioRepository.findById( id );
	}

	@Override
	public void excluirAnuncio(String id) {
		this.anuncioRepository.deleteById( id );
		
	}

	@Override
	public Page<Anuncio> encontrarTodosAnuncios(int pagina, int count) {
		return this.anuncioRepository.findAll( PageRequest.of( pagina, count) );
	}
	

}
