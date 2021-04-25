package it.condominio.test;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.DelegaCRUD;
import it.condominio.model.Delega;

public class DelegaTest {

	public static void main(String[] args) {
		Delega test = new Delega();
		DelegaCRUD crud = new DelegaCRUD();
		Delega model = new Delega(3,"bobbami", 2);
        List<Delega> list = new ArrayList<Delega>();
		
//		
//		test = crud.find(2);
//		System.out.println(test.toString());
		
		
		
//		list = crud.findAll();
//		
//		for(Delega d : list)
//			System.out.println(d.toString());
//		
////		
//		Delega canc = null;
//		
//		System.out.println(canc.getPercorso_delega());
		
		
		
		
		
		
	}

}
