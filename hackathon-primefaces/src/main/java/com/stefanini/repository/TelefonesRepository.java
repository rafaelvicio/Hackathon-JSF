package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.stefanini.model.Agente;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Telefones;

public class TelefonesRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Telefones telefones) {
		this.manager.persist(telefones);
	}

}
