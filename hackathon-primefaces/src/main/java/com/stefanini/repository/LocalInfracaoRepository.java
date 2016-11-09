package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Localinfracao;

public class LocalInfracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Localinfracao localinfracao) {
		this.manager.persist(localinfracao);
	}

}
