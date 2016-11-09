package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Tipoinfracao;
import com.stefanini.repository.TipoInfracaoRepository;

@Stateless
public class TipoinfracaoService {
	
	@Inject
	TipoInfracaoRepository tipoInfracaoRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir(Tipoinfracao tipoinfracao){
		tipoInfracaoRepository.incluir(tipoinfracao);
	}

}
