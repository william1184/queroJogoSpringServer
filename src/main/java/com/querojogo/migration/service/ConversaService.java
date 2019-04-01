package com.querojogo.migration.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.querojogo.migration.entity.Conversa;

public interface ConversaService {
	
	Conversa encontrarConversaPorUsuario(String idUsuario);
	
	Conversa iniciarConversa(Conversa conversa);
	
	Optional<Conversa> encontrarPeloId(String id);
	
	void excluirConversa(String id);
	
	Page<Conversa> encontrarTodasConversas(int pagina, int count);

}
