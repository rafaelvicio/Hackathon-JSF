package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Modelo;

public class ModeloRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Modelo modelo) {
		this.manager.persist(modelo);
	}


}
