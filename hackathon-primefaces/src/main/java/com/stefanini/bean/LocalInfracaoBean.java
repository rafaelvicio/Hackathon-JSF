package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Localinfracao;
import com.stefanini.service.LocalInfracaoService;

@Named("localInfracaooMB")
@SessionScoped
public class LocalInfracaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	Localinfracao localinfracao;
	
	public LocalInfracaoBean(){
		this.localinfracao = new Localinfracao();
	}
	
	@Inject
	private LocalInfracaoService localInfracaoService;
	
	public String incluir(){
		localInfracaoService.incluir(localinfracao);
		return "pages/sucessoLocalInfracao.faces?faces-redirect=true";
	}
	
	// Gets e Sets

	public Localinfracao getLocalinfracao() {
		return localinfracao;
	}

	public void setLocalinfracao(Localinfracao localinfracao) {
		this.localinfracao = localinfracao;
	}

	public LocalInfracaoService getLocalInfracaoService() {
		return localInfracaoService;
	}

	public void setLocalInfracaoService(LocalInfracaoService localInfracaoService) {
		this.localInfracaoService = localInfracaoService;
	}

}
