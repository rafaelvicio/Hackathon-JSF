package com.stefanini.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.model.Infracoes;
import com.stefanini.service.InfracoesService;

@Named("infracaoMB")
@SessionScoped
public class InfracaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Infracoes infracoe;
	
	private List<Infracoes> infracoes;
	
	public InfracaoBean() {
		this.infracoe = new Infracoes();
	}
	
	@Inject
	InfracoesService infracoesService;
	
	public String incluir() {
		infracoesService.incluir(infracoe);
		this.infracoe = new Infracoes();
		return "pages/infracoes.faces?faces-redirect=true";
	}
	
	public void excluir(Integer idInfracao) {
		infracoesService.excluir(idInfracao);
	}

	public Infracoes getInfracoe() {
		return infracoe;
	}

	public void setInfracoe(Infracoes infracoe) {
		this.infracoe = infracoe;
	}

	public List<Infracoes> getInfracoes() {
		return infracoesService.listar();
	}

	public void setInfracoes(List<Infracoes> infracoes) {
		this.infracoes = infracoes;
	}

	public InfracoesService getInfracoesService() {
		return infracoesService;
	}

	public void setInfracoesService(InfracoesService infracoesService) {
		this.infracoesService = infracoesService;
	}

}
