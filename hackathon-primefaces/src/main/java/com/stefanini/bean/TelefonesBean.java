package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Telefones;
import com.stefanini.service.TelefoneService;

@Named("telefonesMB")
@SessionScoped
public class TelefonesBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Telefones telefones;
	
	public TelefonesBean() {
		this.telefones = new Telefones();
	}
	
	@Inject
	private TelefoneService telefoneService;
	
	public String incluir(){
		telefoneService.incluir(telefones);
		return "pages/sucessoTelefones.faces?faces-redirect=true";
	}	
	
	// Gets e Sets
	
	public Telefones getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefones telefones) {
		this.telefones = telefones;
	}

	public TelefoneService getTelefoneService() {
		return telefoneService;
	}

	public void setTelefoneService(TelefoneService telefoneService) {
		this.telefoneService = telefoneService;
	}

}
