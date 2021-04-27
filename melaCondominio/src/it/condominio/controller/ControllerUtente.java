package it.condominio.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.condominio.crud.PalazzinaCRUD;
import it.condominio.crud.UtenteCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.MinLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.model.Palazzina;
import it.condominio.model.Storico_utente;
import it.condominio.model.Utente;

public class ControllerUtente{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String action;
	
	private Utente utente=new Utente();
	private UtenteCRUD utenteCRUD= new UtenteCRUD();
	private String err=null;
	//
	 
	public ControllerUtente() {
		
	}
	public ControllerUtente(HttpServletRequest request, HttpServletResponse response) {

		this.request = request;
		this.response = response;
		
	}
	
	
	
	
	public ControllerUtente(HttpServletRequest request, HttpServletResponse response, String action) {
		super();
		this.request = request;
		this.response = response;
		this.action = action;
	}
	public void insertProprietario() {
		
		
		utente.setEmail(request.getParameter("email"));
		
		//utente = utenteCRUD.findByEmail
		
		utente.setCognome(request.getParameter("cognome"));
		utente.setNome(request.getParameter("nome"));
		utente.setCambia_password(1);
		
		try {
			utenteCRUD.insert(utente);
			Storico_utente storico = new Storico_utente();
			
			PalazzinaCRUD palCRUD=new PalazzinaCRUD();
			
			//Palazzina pal= palCRUD.fin
			
			
		} catch (RequiredFieldError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MaxLengthError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MinLengthError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UniqueFieldError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void login() throws IOException, ServletException {
		
		utente.setEmail(request.getParameter("email"));
		utente.setPassword(request.getParameter("password"));
		
		
			try {
				utente=utenteCRUD.findByEmailAndPassword(utente);
				request.getSession().setAttribute("user", utente);
				response.sendRedirect("home.jsp");
//				request.getRequestDispatcher("Login.jsp");
				return;
			} catch (EntityNotFoundError e) {
				err="password e email non trovati";
			}
		
		request.setAttribute("errore", err);
		request.getRequestDispatcher("logIn.jsp").include(request, response);
		return;
	}

}
