package it.condominio.test;

import java.util.List;

import it.condominio.crud.UtenteCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.model.Utente;

public class UtenteTest {

	public static void main(String[] args) {
		UtenteCRUD crud = new UtenteCRUD();
		
		Utente model = new Utente();
		model.setId(4);
		model.setPassword("temp");
		model.setEmail("fprotano@");
	//	Utente utente = crud.find(3);
//		utente = crud.find(4);
	//	crud.insert(model);
		
	//	crud.update(utente);
	//	crud.delete(5);
		
	//	System.out.println(utente.toString());
		
//		List<Utente>  lista = crud.findAll();
//		
//		
//		for(Utente u : lista)
//			System.out.println(u.toString());
		
//		Utente test = crud.findByEmailAndPassword(model);
//		
//		System.out.println(test.toString());
		
//		crud.updatePassword(model);
		
//		try {
//			Utente test = crud.findByEmailAndPassword(model);
//			System.out.println(test.toString());
//		} catch (EntityNotFoundError e) {
//			
//		}
//		
		
//		List<Utente>  lista = crud.findRappresentantiAttivi();
//		for(Utente u : lista)
//			System.out.println(u.toString());
		
		
//		List<Utente>  lista = crud.findProprietarioAttivo();
//		for(Utente u : lista)
//			System.out.println(u.toString());
		
	}

}
