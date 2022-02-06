package com.hgp.sigabem.dtos;

import java.time.LocalDate;

import com.hgp.sigabem.entities.Entrega;

public class EntregaGetDTO extends EntregaInsertDTO{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Double vlTotalFrete;
	private LocalDate dataPrevistaEntrega;
	private LocalDate dataConsulta;
	
	public EntregaGetDTO() {
	}
	
	public EntregaGetDTO(Entrega entrega) {
		this.setId(entrega.getId());
		this.setPeso(entrega.getPeso());
		this.setCepOrigem(entrega.getCepOrigem());
		this.setCepDestino(entrega.getCepDestino());
		this.setNomeDestinatario(entrega.getNomeDestinatario());
		this.setVlTotalFrete(entrega.getVlTotalFrete());
		this.setDataPrevistaEntrega(entrega.getDataPrevistaEntrega());
		this.setDataConsulta(entrega.getDataConsulta());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
}
