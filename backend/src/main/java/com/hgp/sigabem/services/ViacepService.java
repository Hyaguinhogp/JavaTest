package com.hgp.sigabem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.hgp.sigabem.dtos.EnderecoCompletoDTO;

@Service
public class ViacepService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Transactional
	public EnderecoCompletoDTO getEndereco(String cep) {
		String path = "https://viacep.com.br/ws/" + cep + "/json/";
		EnderecoCompletoDTO endereco = restTemplate.getForObject(path, EnderecoCompletoDTO.class);
		return endereco;
	}
}
