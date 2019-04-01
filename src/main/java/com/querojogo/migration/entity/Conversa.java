package com.querojogo.migration.entity;


import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * Created by Familia on 27/07/2018.
 */
public class Conversa {
	
	@Id
    private String id;
    private List<String> idUsuariosConversa;
    private String fotoUsuarioSender;
    private String fotoUsuarioReceiver;
    private String nomeUsuarioSender;
    private String nomeUsuarioReceiver;
    private String idUsuarioSender;
    private String idUsuarioReceiver;
    private String horaUltimaMensagemRecebida;
    private String ultimaMensagemRecebida;
    private String idUsuarioUltimaMensagem;

    private boolean usuarioOnline;

	public String getId() {
		return id;
	}

	public Conversa setId(String id) {
		this.id = id;
		return this;
	}

	public List<String> getIdUsuariosConversa() {
		return idUsuariosConversa;
	}

	public Conversa setIdUsuariosConversa(List<String> idUsuariosConversa) {
		this.idUsuariosConversa = idUsuariosConversa;
		return this;
	}

	public String getFotoUsuarioSender() {
		return fotoUsuarioSender;
	}

	public Conversa setFotoUsuarioSender(String fotoUsuarioSender) {
		this.fotoUsuarioSender = fotoUsuarioSender;
		return this;
	}

	public String getFotoUsuarioReceiver() {
		return fotoUsuarioReceiver;
	}

	public Conversa setFotoUsuarioReceiver(String fotoUsuarioReceiver) {
		this.fotoUsuarioReceiver = fotoUsuarioReceiver;
		return this;
	}

	public String getNomeUsuarioSender() {
		return nomeUsuarioSender;
	}

	public Conversa setNomeUsuarioSender(String nomeUsuarioSender) {
		this.nomeUsuarioSender = nomeUsuarioSender;
		return this;
	}

	public String getNomeUsuarioReceiver() {
		return nomeUsuarioReceiver;
	}

	public Conversa setNomeUsuarioReceiver(String nomeUsuarioReceiver) {
		this.nomeUsuarioReceiver = nomeUsuarioReceiver;
		return this;
	}

	public String getIdUsuarioSender() {
		return idUsuarioSender;
	}

	public Conversa setIdUsuarioSender(String idUsuarioSender) {
		this.idUsuarioSender = idUsuarioSender;
		return this;
	}

	public String getIdUsuarioReceiver() {
		return idUsuarioReceiver;
	}

	public Conversa setIdUsuarioReceiver(String idUsuarioReceiver) {
		this.idUsuarioReceiver = idUsuarioReceiver;
		return this;
	}

	public String getHoraUltimaMensagemRecebida() {
		return horaUltimaMensagemRecebida;
	}

	public Conversa setHoraUltimaMensagemRecebida(String horaUltimaMensagemRecebida) {
		this.horaUltimaMensagemRecebida = horaUltimaMensagemRecebida;
		return this;
	}

	public String getUltimaMensagemRecebida() {
		return ultimaMensagemRecebida;
	}

	public Conversa setUltimaMensagemRecebida(String ultimaMensagemRecebida) {
		this.ultimaMensagemRecebida = ultimaMensagemRecebida;
		return this;
	}

	public String getIdUsuarioUltimaMensagem() {
		return idUsuarioUltimaMensagem;
	}

	public Conversa setIdUsuarioUltimaMensagem(String idUsuarioUltimaMensagem) {
		this.idUsuarioUltimaMensagem = idUsuarioUltimaMensagem;
		return this;
	}

	public boolean isUsuarioOnline() {
		return usuarioOnline;
	}

	public Conversa setUsuarioOnline(boolean usuarioOnline) {
		this.usuarioOnline = usuarioOnline;
		return this;
	}

}