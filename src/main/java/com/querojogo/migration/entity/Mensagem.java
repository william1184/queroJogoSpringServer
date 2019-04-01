package com.querojogo.migration.entity;


import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Frank on 27/07/2018.
 */

@Document
public class Mensagem {

    private String id;
    private String uidOperador;
    private String nomeOperador;
    private String imagemOperador;
    private String mensagem;

    private String hora;
    private Date timestamp;
    private TipoMensagem tipoMensagem;
    private String idConversa;

    public Mensagem() {
    }

    public enum  TipoMensagem {
        Unknown, Text, Image, Location
    }

    public String getId() {
		return id;
	}

	public Mensagem setId(String id) {
		this.id = id;
		return this;
	}

	public String getUidOperador() {
		return uidOperador;
	}

	public Mensagem setUidOperador(String uidOperador) {
		this.uidOperador = uidOperador;
		return this;
	}

	public String getNomeOperador() {
		return nomeOperador;
	}

	public Mensagem setNomeOperador(String nomeOperador) {
		this.nomeOperador = nomeOperador;
		return this;
	}

	public String getImagemOperador() {
		return imagemOperador;
	}

	public Mensagem setImagemOperador(String imagemOperador) {
		this.imagemOperador = imagemOperador;
		return this;
	}

	public String getMensagem() {
		return mensagem;
	}

	public Mensagem setMensagem(String mensagem) {
		this.mensagem = mensagem;
		return this;
	}

	public String getHora() {
		return hora;
	}

	public Mensagem setHora(String hora) {
		this.hora = hora;
		return this;
	}

	public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

	public String getIdConversa() {
		return idConversa;
	}

	public Mensagem setIdConversa(String idConversa) {
		this.idConversa = idConversa;
		return this;
	}
}
