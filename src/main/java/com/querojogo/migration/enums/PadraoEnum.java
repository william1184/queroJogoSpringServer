package com.querojogo.migration.enums;

public enum PadraoEnum {
	VAZIO(" ");
	
	private String valor;
	
	public String getValor() {
		return valor;
	}

	public PadraoEnum setValor(String valor) {
		this.valor = valor;
		return this;
	}

	PadraoEnum(String valor) {
		this.valor = valor;
	}
	
}
