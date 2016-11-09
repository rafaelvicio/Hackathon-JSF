package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Modelo;
import com.stefanini.service.ModeloService;

@Named("modeloMB")
@SessionScoped
public class ModeloBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	Modelo modelo;
	
	public ModeloBean() {
		this.modelo = new Modelo();
	}
	
	@Inject
	ModeloService modeloService;
	
	public String incluir(){
		modeloService.incluir(modelo);
		return "pages/sucessoModelo.faces?faces-redirect=true";
	}
	
	// Gets e Sets

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public ModeloService getModeloService() {
		return modeloService;
	}

	public void setModeloService(ModeloService modeloService) {
		this.modeloService = modeloService;
	}

}
