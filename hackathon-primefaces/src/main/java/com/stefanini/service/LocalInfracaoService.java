package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.repository.LocalInfracaoRepository;

@Stateless
public class LocalInfracaoService {
	
	@Inject
	LocalInfracaoRepository localInfracaoRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Localinfracao localinfracao){
		localInfracaoRepository.incluir(localinfracao);
	}

}
