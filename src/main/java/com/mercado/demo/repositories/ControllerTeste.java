package com.mercado.demo.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercado.demo.models.Lancamentos;
@RestController
@RequestMapping("/lancamentos")
public class ControllerTeste {
	@Autowired 
	private LancamentosRepositorie repository;
	
	@GetMapping
	public List<Lancamentos> retornar() {
		return repository.findAll();
	}
}


