package it.condominio.test;

import java.time.LocalDate;

import it.condominio.model.Storico_utente;
import it.condominio.util.BaseUtil;

public class Storico_utenteTest extends BaseUtil {

	public static void main(String[] args) {
		
		
		Storico_utente model = new Storico_utente(LocalDate.of(2018, 2, 7), 4, 3, 2, 1);
        model.setData_fine(LocalDate.of(2021, 1, 1));
        model.setId(8);
	//	storico_utente_crud.insert(model);
		
	//	storico_utente_crud.update(model);
		
    //    storico_utente_crud.delete(8);
		
//		storico_utente = storico_utente_crud.find(7);
//		
//		System.out.println(storico_utente.toString());
		
		
//        storico_utente_list = storico_utente_crud.findAll();
//		
//		
//		for(Storico_utente s : storico_utente_list)
//			System.out.println(s.toString());
		
		
		
		
		
		
	}

}
