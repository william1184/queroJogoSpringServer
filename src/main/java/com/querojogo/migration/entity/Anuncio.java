package com.querojogo.migration.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by tcc2018 on 07/03/2018.
 */
@Document
public class Anuncio {
	
	@Id
    private String id;
    @DBRef(lazy = true)
    private Usuario donoJogo;
    private String idJogo;
    private String nome;
    private String idImagem;
    private String descricao;
    private int idPlataforma;
    private String criadoEm;
    private String idConversa;
    private String distanciaDoUsuario;
    private String nomeMinusculo;


    public String getImagemThumb(){
        return "https://images.igdb.com/igdb/image/upload/t_thumb/"+getIdImagem()+".jpg";
    }

    public String getImagemMedia(){
        return "https://images.igdb.com/igdb/image/upload/t_logo_med/"+getIdImagem()+".jpg";
    }

    public String getImagemGrande(){
        return "https://images.igdb.com/igdb/image/upload/t_cover_big/"+getIdImagem()+".jpg";
    }

    @Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getDonoJogo() {
		return donoJogo;
	}

	public void setDonoJogo(Usuario donoJogo) {
		this.donoJogo = donoJogo;
	}

	public String getIdJogo() {
		return idJogo;
	}

	public void setIdJogo(String idJogo) {
		this.idJogo = idJogo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(String idImagem) {
		this.idImagem = idImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdPlataforma() {
		return idPlataforma;
	}

	public void setIdPlataforma(int idPlataforma) {
		this.idPlataforma = idPlataforma;
	}

	public String getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(String criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getIdConversa() {
		return idConversa;
	}

	public void setIdConversa(String idConversa) {
		this.idConversa = idConversa;
	}

	public String getDistanciaDoUsuario() {
		return distanciaDoUsuario;
	}

	public void setDistanciaDoUsuario(String distanciaDoUsuario) {
		this.distanciaDoUsuario = distanciaDoUsuario;
	}

	public String getNomeMinusculo() {
		return nomeMinusculo;
	}

	public void setNomeMinusculo(String nomeMinusculo) {
		this.nomeMinusculo = nomeMinusculo;
	}

}