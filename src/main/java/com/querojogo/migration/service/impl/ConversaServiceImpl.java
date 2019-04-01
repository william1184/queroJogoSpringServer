package com.querojogo.migration.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.querojogo.migration.entity.Conversa;
import com.querojogo.migration.repository.ConversaRepository;
import com.querojogo.migration.service.ConversaService;

@Service
public class ConversaServiceImpl implements ConversaService{

	@Autowired
	private ConversaRepository conversaRepository;

	@Override
	public Conversa encontrarConversaPorUsuario(String idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conversa iniciarConversa(Conversa conversa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Conversa> encontrarPeloId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirConversa(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Conversa> encontrarTodasConversas(int pagina, int count) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
