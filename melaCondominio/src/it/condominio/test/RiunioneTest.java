package it.condominio.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.RiunioneCRUD;
import it.condominio.model.Riunione;

public class RiunioneTest {

	public static void main(String[] args) {
	     Riunione test = new Riunione();
		List<Riunione> list = new ArrayList<Riunione>();
		
		RiunioneCRUD crud = new RiunioneCRUD();
		
		
		Riunione model = new Riunione(LocalDate.of(2018, 2, 7), "Io so io e tu non sei nessuno", "Capra! capra!", "non percorri nulla senza di me");
		model.setId(3);
//		crud.insert(model);
//		crud.update(model);
		
//		test= crud.find(2);
//		 System.out.println(test.toString());
//		
//		list= crud.findAll();
//		for (Riunione r : list)
//			System.out.println(r.toString());
		
		crud.delete(3);
		
		
		
		
		
		
		
		
	}

}
