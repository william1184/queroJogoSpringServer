package com.querojogo.migration.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.querojogo.migration.entity.Mensagem;

public interface MensagemService {
	
	Mensagem enviarMensagem(Mensagem mensagem);
	
	Optional<Mensagem> encontrarPeloId(String id);
	
	void excluirMensagem(String id);
	
	Page<Mensagem> encontrarTodasMensagens(int pagina, int count);

}
