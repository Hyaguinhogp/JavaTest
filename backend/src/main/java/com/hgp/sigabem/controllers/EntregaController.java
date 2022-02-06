package com.hgp.sigabem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		return ResponseEntity.ok().body(entregaGet);
	}
}
