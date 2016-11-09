package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Modelo;
import com.stefanini.repository.ModeloRepository;

@Stateless
public class ModeloService {
	
	@Inject
	ModeloRepository modeloRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Modelo modelo){
		modeloRepository.incluir(modelo);
	}

}
