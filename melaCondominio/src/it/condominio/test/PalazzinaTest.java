package it.condominio.test;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.PalazzinaCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.model.Palazzina;

public class PalazzinaTest {

	public static void main(String[] args) {
		PalazzinaCRUD crud = new PalazzinaCRUD();
		Palazzina test = new Palazzina();
		Palazzina model = new Palazzina(4, "ttt", "via roma perpendicolare 30", "roma", "lazio");
		List<Palazzina> list = new ArrayList<Palazzina>();
		
//		test = crud.find(3);
//	//	System.out.println(test.toString());
//		list = crud.findAll();
//		for(Palazzina p : list)
//			System.out.println(p.toString());
//		
		
		
		
		
//		try {
//			test=crud.findForInsert(model);
//			System.out.println(test.toString());
//		} catch (EntityNotFoundError e) {
//			System.out.println("non trovato");
//		}
//		
//		
		
//		try {
//			crud.insert(model);
//		} catch (RequiredFieldError e) {
//			System.out.println(e.getDescription(e));
//		} catch (MaxLengthError e) {
//			System.out.println(e.getDescription(e));
//		} catch (UniqueFieldError e) {
//			System.out.println(e.getDescription(e));
//		}
//		
//		
//		
		
		
		
		
		
		
		

	}

}
