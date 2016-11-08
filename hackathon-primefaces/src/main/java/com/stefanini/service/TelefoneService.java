package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Telefones;
import com.stefanini.repository.TelefonesRepository;

@Stateless
public class TelefoneService {
	
	@Inject
	private TelefonesRepository telefonesRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Telefones telefones){
		telefonesRepository.incluir(telefones);
	}

}
