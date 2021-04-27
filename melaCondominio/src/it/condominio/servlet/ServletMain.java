package it.condominio.servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.condominio.controller.*;
import it.condominio.crud.*;
import it.condominio.exception.*;
import it.condominio.model.*;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class ServletMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getParameter("action");
		String err=null;
		
		switch (action) {
		
		case "addProprietario" : {
			
			ControllerCondominio cc = new ControllerCondominio(request, response, action);
			
			cc.getPalazzine();
			
			
		}
			break;
			
		default :
			
			
			
		}
		

		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		String err;
		String action = request.getParameter("action");
		
		switch (action) {
		
		case "logIn" : {
			
			ControllerUtente uc = new ControllerUtente(request, response);
			
			uc.login();
			
			
		}
			break;
			
		case "addProprietario" : {
			
			ControllerUtente cu = new ControllerUtente(request, response, action);
			
			
			
		}
			break;
			
		default :
			
			
			
		}
		
	}
}
