package it.condominio.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.RiunioneCRUD;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.model.Riunione;

public class RiunioneTest {

	public static void main(String[] args) {
	     Riunione test = new Riunione();
		List<Riunione> list = new ArrayList<Riunione>();
		
		RiunioneCRUD crud = new RiunioneCRUD();
		
		
		Riunione model = new Riunione(LocalDate.of(2021, 4, 6), "Io so io e tu non sei nessuno", "Capra! capra!", "non percorri nulla senza di me");
		model.setId(3);
//		System.out.println(model.getData_riunione());
//		crud.insert(model);
//		crud.update(model);
		
//		test= crud.find(2);
//		 System.out.println(test.toString());
////		
//		list= crud.findAll();
//		for (Riunione r : list)
//			System.out.println(r.toString());
//		
//		crud.delete(3);
		
		
		try {
			crud.insert(model);
		} catch (RequiredFieldError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MaxLengthError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UniqueFieldError e) {
			System.out.println(e.getDescription(e));
		}
		
		
		
		
		
	}

}
