package it.condominio.test;

import java.util.List;

import it.condominio.crud.UtenteCRUD;
import it.condominio.model.Utente;

public class UtenteTest {

	public static void main(String[] args) {
		UtenteCRUD crud = new UtenteCRUD();
		
		Utente model = new Utente("Paolo", "Rossi", "paoletto@hotmail.com", "paoloR98123");
	//	Utente utente = crud.find(3);
//		utente = crud.find(4);
	//	crud.insert(model);
		
	//	crud.update(utente);
	//	crud.delete(5);
		
	//	System.out.println(utente.toString());
		
		List<Utente>  lista = crud.findAll();
		
		
		for(Utente u : lista)
			System.out.println(u.toString());
		
		
		
		
		
	}

}