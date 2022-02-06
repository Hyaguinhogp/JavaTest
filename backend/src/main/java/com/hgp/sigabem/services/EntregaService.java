package com.hgp.sigabem.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hgp.sigabem.dtos.EnderecoCompletoDTO;
import com.hgp.sigabem.dtos.EntregaGetDTO;
import com.hgp.sigabem.dtos.EntregaInsertDTO;
import com.hgp.sigabem.entities.Entrega;
import com.hgp.sigabem.repositories.EntregaRepository;

@Service
public class EntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	@Autowired
	private ViacepService viacepService;
	
	@Transactional
	public EntregaGetDTO newEntrega(EntregaInsertDTO entregaInsert) {
		Entrega entrega = completeEntrega(entregaInsert);
		entregaRepository.save(entrega);
		return new EntregaGetDTO(entrega);
	}
	
	private Entrega completeEntrega(EntregaInsertDTO entregaInsert) {
		Entrega entrega = new Entrega();
		dtoToEntity(entregaInsert, entrega);
		
		entrega.setDataConsulta(LocalDate.now());
		
		EnderecoCompletoDTO enderecoOrigem = viacepService.getEndereco(entrega.getCepOrigem());
		EnderecoCompletoDTO enderecoDestino = viacepService.getEndereco(entrega.getCepDestino());
		
		if(enderecoOrigem.getDdd().equals(enderecoDestino.getDdd())) {
			entrega.setVlTotalFrete(entrega.getPeso() * 0.5);
			entrega.setDataPrevistaEntrega(LocalDate.now().plusDays(1));
		} 
		else if(enderecoOrigem.getUf().equals(enderecoDestino.getUf())) {
			entrega.setVlTotalFrete(entrega.getPeso() * 0.75);
			entrega.setDataPrevistaEntrega(LocalDate.now().plusDays(3));
		}
		else {
			entrega.setVlTotalFrete(entrega.getPeso());
			entrega.setDataPrevistaEntrega(LocalDate.now().plusDays(10));
		}
		
		return entrega;
	}
	
	private void dtoToEntity(EntregaInsertDTO entregaInsert, Entrega entrega) {
		entrega.setPeso(entregaInsert.getPeso());
		entrega.setCepOrigem(entregaInsert.getCepOrigem());
		entrega.setCepDestino(entregaInsert.getCepDestino());
		entrega.setNomeDestinatario(entregaInsert.getNomeDestinatario());
	}
}
