package com.stefanini.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Tipoinfracao;

public class TipoInfracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Tipoinfracao tipoinfracao) {
		this.manager.persist(tipoinfracao);
	}

}
