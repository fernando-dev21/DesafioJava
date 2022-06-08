package com.mercado.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mercado.demo.models.Lancamentos;

 @Repository
public interface LancamentosRepositorie extends JpaRepository<Lancamentos,Long>{
	

}
