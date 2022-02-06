package com.hgp.sigabem.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hgp.sigabem.dtos.EntregaGetDTO;
import com.hgp.sigabem.dtos.EntregaInsertDTO;
import com.hgp.sigabem.services.EntregaService;

@Controller
@ResponseBody
@RequestMapping(path = "/entregas")
public class EntregaController {

	@Autowired
	private EntregaService entregaService;
	
	@PostMapping
	public ResponseEntity<EntregaGetDTO> newEntrega(@RequestBody EntregaInsertDTO entregaInsert){
		EntregaGetDTO entregaGet = entregaService.newEntrega(entregaInsert);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(entregaGet.getId()).toUri();
		return ResponseEntity.created(uri).body(entregaGet);
	}
}
