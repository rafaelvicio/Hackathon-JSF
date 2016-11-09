package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipoinfracao;
import com.stefanini.service.TipoinfracaoService;

@Named("tipoInfracaoMB")
@SessionScoped
public class TipoInfracaoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	Tipoinfracao tipoinfracao;
	
	public TipoInfracaoBean() {
		this.tipoinfracao = new Tipoinfracao();
	}
	
	@Inject
	private TipoinfracaoService tipoinfracaoService;
	
	public String incluir(){
		tipoinfracaoService.incluir(tipoinfracao);
		return "pages/sucessoTipoInfracao.faces?faces-redirect=true";
	}
	
	// Gets e Sets

	public Tipoinfracao getTipoinfracao() {
		return tipoinfracao;
	}

	public void setTipoinfracao(Tipoinfracao tipoinfracao) {
		this.tipoinfracao = tipoinfracao;
	}

	public TipoinfracaoService getTipoinfracaoService() {
		return tipoinfracaoService;
	}

	public void setTipoinfracaoService(TipoinfracaoService tipoinfracaoService) {
		this.tipoinfracaoService = tipoinfracaoService;
	}

}
