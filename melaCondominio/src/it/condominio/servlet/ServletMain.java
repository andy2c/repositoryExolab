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
		
//		if(action.equals("CatalogoProdotti") || action.equals("modificaCatalogo")
//				|| action.equals("eliminaDalCatalogo") 
//				|| action.equals("modificaProdottoDelCatalogo")) {
//			
//			ProdottoCRUD prodottoCRUD = new ProdottoCRUD();
//			try {
//				List<Prodotto> listaProdotto = prodottoCRUD.findAll();
//				
////				request.getSession().setAttribute("listaProdotto",listaProdotto);
////				response.sendRedirect("CatalogoProdotti.jsp");
//
//				request.setAttribute("listaProdotto", listaProdotto);
//		        request.getRequestDispatcher(action+".jsp").include(request, response);
//		        return;
//		        
//			} catch (RecordNotFoundException e) {
//				err="nessun prodotto in catalogo";
//			}
//
//			request.setAttribute("err", err);
//			request.getRequestDispatcher(action+".jsp").include(request, response);
//			return;
//			
//			
//		}
//		
//		
//		if(action.equals("setProdottiInCarrello")) {
//			
//			ProdottoCRUD prodottoCRUD = new ProdottoCRUD();
//			Prodotto prodotto= new Prodotto();
//			
//			if(null != (HashMap<Integer, Riga_ordine>) request.getSession().getAttribute("carrello")) {
//
//				
//				HashMap<Integer, Prodotto> nomiProdottiInCarrello =  new HashMap<Integer, Prodotto>();
//				HashMap<Integer, Riga_ordine> carrello = (HashMap<Integer, Riga_ordine>) request.getSession().getAttribute("carrello");
//				Integer id_prodotto=0;
//				
//				for (Riga_ordine i : carrello.values()) {
//					id_prodotto=i.getId_prodotto();
//					try {
//						prodotto=prodottoCRUD.find(id_prodotto);
//						nomiProdottiInCarrello.put(id_prodotto, prodotto);
//					} catch (RequiredFieldException e) {
//						err="errore, campo "+e.getField()+" necessario";
//					} catch (MaxLengthException e) {
//						err="errore, campo "+e.getField()+" troppo grande";
//					} catch (RecordNotFoundException e) {
//						err="errore, prodotto non trovato";
//					}
//					
//				}
//				
//				if(err==null) {
//
//				request.getSession().setAttribute("nomiProdottiInCarrello", nomiProdottiInCarrello);
//				request.getRequestDispatcher("carrello.jsp").include(request, response);
//				return;
//				}
//				
//				else {
//					
//				request.setAttribute("err", err);
//				request.getRequestDispatcher("carrello.jsp").include(request, response);
//				return;
//					
//					
//				}
//			}
//			
//			
//			request.getRequestDispatcher("carrello.jsp").include(request, response);
//		}
		
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
			
		default :
			
			
			
		}
		
	}
}
