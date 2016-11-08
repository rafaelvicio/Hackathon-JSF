package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Tipotelefone;

public class TipotelefoneRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Tipotelefone tipotelefone){
		this.manager.persist(tipotelefone);
	}

}
