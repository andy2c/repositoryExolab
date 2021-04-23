package it.condominio.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.condominio.crud.UtenteCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.model.Utente;

public class ControllerUtente{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
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
	
	
	
	

	
	public void login() throws IOException, ServletException {
		
		String err = null;
		
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
