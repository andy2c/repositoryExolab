package it.condominio.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerBase {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String err=null;
	


	public ControllerBase(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	
	
	


}
