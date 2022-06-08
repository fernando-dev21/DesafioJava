package com.mercado.demo.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Lancamentos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
//	@OneToOne(mappedBy= "lancamentos")
//	private Referencia referencia;
	private String tipo;
	private double valor;
	private LocalDate data;
	
	
	
}
