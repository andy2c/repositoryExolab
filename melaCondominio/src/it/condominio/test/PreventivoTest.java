package it.condominio.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.PreventivoCRUD;
import it.condominio.model.Preventivo;

public class PreventivoTest {
	public static void main(String[] args ) {
		PreventivoCRUD crud = new PreventivoCRUD();
		Preventivo test = new Preventivo(3, "Cocco Co&Company", "+39 35732872", "Cocco@cocco.it", "Via Miami", "Ma che ne so &go", "Bo non so", 1000.0,
				                          17, LocalDate.of(2021,2,11));
//		Preventivo model = new Preventivo("RenzoCo", 2000.0);
//		crud.insert(model);
//		List<Preventivo> list = new ArrayList<Preventivo>();
//		
//		list = crud.findAll();
//		for(Preventivo p : list )
//			System.out.println(p.toString());
//		
//		System.out.println(test.getPreventivo_inizio_lavori());
		
//		crud.update(test);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
