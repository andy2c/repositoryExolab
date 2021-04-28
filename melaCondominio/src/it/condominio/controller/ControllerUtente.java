package it.condominio.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.condominio.crud.UtenteCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.model.Utente;
import it.condominio.util.Utils;

public class ControllerUtente extends ControllerBase {

	public ControllerUtente(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);

	}

	private Utente utente = new Utente();
	private UtenteCRUD utenteCRUD = new UtenteCRUD();


	public void login() throws IOException, ServletException {

		
		utente.setEmail(request.getParameter("email"));
		utente.setPassword(request.getParameter("password"));

		try {
			utente = utenteCRUD.findByEmailAndPassword(utente);
			request.getSession().setAttribute("user", utente);

			if (Utils.findValueIntoList(utente, "amministratore sito"))
				// response.sendRedirect("homeAmministratore.jsp");
			if (Utils.findValueIntoList(utente, "amministratore condominio"))
					// response.sendRedirect("homeAmministratore.jsp");
			if (Utils.findValueIntoList(utente, "proprietario appartamento"))
						// response.sendRedirect("homeRappresentante.jsp");
			if (Utils.findValueIntoList(utente, "delegato temporaneo"))
							// response.sendRedirect("homeRappresentate.jsp");

			response.sendRedirect("logIn.jsp");
			// request.getRequestDispatcher("Login.jsp");
			return;
		} catch (EntityNotFoundError e) {
			err = "Errore: password e email non trovati.";
		}
        
		request.setAttribute("err", err); // qui errore
		request.getRequestDispatcher("logIn.jsp").include(request, response);
		return;
	}

}
