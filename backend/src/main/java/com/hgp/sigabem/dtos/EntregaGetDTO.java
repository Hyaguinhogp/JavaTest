package com.hgp.sigabem.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.hgp.sigabem.entities.Entrega;

public class EntregaGetDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Double vlTotalFrete;
	private LocalDate dataPrevistaEntrega;
	private String cepOrigem;
	private String cepDestino;
	
	public EntregaGetDTO() {
	}

	public EntregaGetDTO(Entrega entrega) {
		this.vlTotalFrete = entrega.getVlTotalFrete();
		this.dataPrevistaEntrega = entrega.getDataPrevistaEntrega();
		this.cepOrigem = entrega.getCepOrigem();
		this.cepDestino = entrega.getCepDestino();
	}

	public Double getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(Double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	public LocalDate getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(LocalDate dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
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
}
