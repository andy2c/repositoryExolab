package it.condominio.test;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.AppartamentoCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.model.Appartamento;

public class AppartamentoTest {

	public static void main(String[] args) {
		Appartamento test = new Appartamento("1", 1);
		AppartamentoCRUD crud = new AppartamentoCRUD();
		Appartamento model = new Appartamento(3,"3", 1);
		List<Appartamento> list = new ArrayList<Appartamento>();
		
		try {
			test = crud.findByInternoAndPalazzina(model);
			System.out.println("trovato:");
			System.out.println(test.toString());
		} catch (EntityNotFoundError e) {
			System.out.println("non trovato");
		}
		
//		list= crud.findAll();
//		for(Appartamento a : list)
//			System.out.println(a.toString());
//		
//		
//		
		
//		test = crud.find(2);
//		System.out.println(test.toString());
		
		
//		try {
//	//		model = crud.findForInsert(test);
//			model = crud.find(2);
//			System.out.println(model.toString());
//		} catch (EntityNotFoundError e) {
//			System.out.println("non trovato");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
