package it.condominio.test;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.model.Presenza_riunione;
import it.condominio.util.BaseUtil;

public class Presenza_riunioneTest extends BaseUtil{

	public static void main(String[] args) {
		
		Presenza_riunione model = new Presenza_riunione(3, 1, 2, 2);
		
	//	presenza_riunione_crud.update(model);
		
		
	//	presenza_riunione_crud.delete(3);
		
		
//		presenza_riunione = presenza_riunione_crud.find(2);
//		System.out.println(presenza_riunione.toString());
		
//		presenza_riunione_list = presenza_riunione_crud.findAll();
//		for(Presenza_riunione p : presenza_riunione_list)
//			System.out.println(p.toString());
//		
//		try {
//			System.out.println(presenza_riunione_crud.find(10).toString());
//		} catch (EntityNotFoundError e) {
//			System.out.println("non trovato");
//		}
		
		
	}

}
