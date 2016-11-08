package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipotelefone;
import com.stefanini.service.TipotelefoneService;

@Named("tipotelefoneMB")
@SessionScoped
public class TipotelefoneBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Tipotelefone tipotelefone;
	
	public TipotelefoneBean(){
		this.tipotelefone = new Tipotelefone();
	}
	
	@Inject
	private TipotelefoneService tipotelefoneService;
	
	public String incluir(){
		tipotelefoneService.incluir(tipotelefone);
		return "pages/index";
	}
	
	
	// Get e Sets
	

	public Tipotelefone getTipotelefone() {
		return tipotelefone;
	}

	public void setTipotelefone(Tipotelefone tipotelefone) {
		this.tipotelefone = tipotelefone;
	}

	public TipotelefoneService getTipotelefoneService() {
		return tipotelefoneService;
	}

	public void setTipotelefoneService(TipotelefoneService tipotelefoneService) {
		this.tipotelefoneService = tipotelefoneService;
	}

}
