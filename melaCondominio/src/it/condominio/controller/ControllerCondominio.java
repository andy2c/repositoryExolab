package it.condominio.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.condominio.crud.AppartamentoCRUD;
import it.condominio.crud.PalazzinaCRUD;
import it.condominio.model.Appartamento;
import it.condominio.model.Palazzina;

public class ControllerCondominio {
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String action;
	
	private Appartamento appartamento=new Appartamento();
	private AppartamentoCRUD appartamentoCRUD= new AppartamentoCRUD();
	
	private Palazzina palazzina=new Palazzina();
	private PalazzinaCRUD palazzinaCRUD= new PalazzinaCRUD();
	
	private String err=null;
	
	public ControllerCondominio() {
		super();
	}
	
	
	
	public ControllerCondominio(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;
	}
	
	



	public ControllerCondominio(HttpServletRequest request, HttpServletResponse response, String action) {
		super();
		this.request = request;
		this.response = response;
		this.action = action;
	}



	public void getPalazzine() throws ServletException, IOException {
		
		List <Palazzina> listaPalazzine = new ArrayList<Palazzina>();
		
		listaPalazzine= palazzinaCRUD.findAll();
		
		
		request.setAttribute("listaPalazzine", listaPalazzine);
        request.getRequestDispatcher(action+".jsp").include(request, response);
        return;
		
	}
	

}
