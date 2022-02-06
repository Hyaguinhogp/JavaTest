package com.hgp.sigabem.dtos;

import java.io.Serializable;

public class EntregaInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Double peso;
	private String cepOrigem;
	private String cepDestino;
	private String nomeDestinatario;
	
	public EntregaInsertDTO() {
	}

	public EntregaInsertDTO(Double peso, String cepOrigem, String cepDestino, String nomeDestinatario) {
		this.peso = peso;
		this.cepOrigem = cepOrigem;
		this.cepDestino = cepDestino;
		this.nomeDestinatario = nomeDestinatario;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getCepOrigem() {
		return cepOrigem;
	}

	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
}
