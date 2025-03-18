package com.revisao.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revisao.ecommerce.dto.ProdutoDTO;
import com.revisao.ecommerce.services.ProdutoService;

@RestController
@RequestMapping
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping	
	public List<ProdutoDTO>findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/pagina")
	public Page<ProdutoDTO> findAll(Pageable pagina){
		return service.findPagina(pagina);
	}
	

	@PostMapping(value = "/produto")
	public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO dto){
		dto = service.insert(dto);
		return ResponseEntity.ok(dto);
	}
}
