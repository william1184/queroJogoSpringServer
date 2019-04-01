package com.querojogo.migration.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.querojogo.migration.enums.TipoUsuarioEnum;

/**
 * Created by tcc2018 on 07/03/2018.
 */

@Document
public class Usuario {
	
	@Id
    private String id;
    private String nome;
    
    @Indexed(unique = true) 
    @NotBlank(message="Email é obrigatório")
    @Email(message="Email invalido")
    private String email;
    @NotBlank(message="Senha é obrigatória")
    @Size(min = 6)
    private String senha;
    private String dataNascimento;
    private String cep;
    private String endereco;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private Double latitude;
    private Double longitude;
    private String foto;
    
    private TipoUsuarioEnum tipo;

	public String getId() {
		return id;
	}

	public Usuario setId(String id) {
		this.id = id;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Usuario setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getSenha() {
		return senha;
	}

	public Usuario setSenha(String senha) {
		this.senha = senha;
		return this;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Usuario setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public String getCep() {
		return cep;
	}

	public Usuario setCep(String cep) {
		this.cep = cep;
		return this;
	}

	public String getEndereco() {
		return endereco;
	}

	public Usuario setEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}

	public String getRua() {
		return rua;
	}

	public Usuario setRua(String rua) {
		this.rua = rua;
		return this;
	}

	public String getBairro() {
		return bairro;
	}

	public Usuario setBairro(String bairro) {
		this.bairro = bairro;
		return this;
	}

	public String getCidade() {
		return cidade;
	}

	public Usuario setCidade(String cidade) {
		this.cidade = cidade;
		return this;
	}

	public String getEstado() {
		return estado;
	}

	public Usuario setEstado(String estado) {
		this.estado = estado;
		return this;
	}

	public String getPais() {
		return pais;
	}

	public Usuario setPais(String pais) {
		this.pais = pais;
		return this;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Usuario setLatitude(Double latitude) {
		this.latitude = latitude;
		return this;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Usuario setLongitude(Double longitude) {
		this.longitude = longitude;
		return this;
	}

	public String getFoto() {
		return foto;
	}

	public Usuario setFoto(String foto) {
		this.foto = foto;
		return this;
	}

	public TipoUsuarioEnum getTipo() {
		return tipo;
	}

	public Usuario setTipo(TipoUsuarioEnum tipo) {
		this.tipo = tipo;
		return this;
	}
    
    
    
}
