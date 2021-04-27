package it.condominio.test;

import java.util.List;

import it.condominio.crud.UtenteCRUD;
import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.MinLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.model.Utente;
import it.condominio.util.BaseUtil;

public class UtenteTest extends BaseUtil {

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
		
//		model = crud.find(4);
//		if(model != null)
//			System.out.println(model.toString());
//		else
//			System.out.println("Non trovato");
//		
//		
//		System.out.println(utente.toString());
		
//		try {
//			model = crud.findByEmailAndPassword(model);
//			System.out.println(model.toString());
//		} catch (EntityNotFoundError e) {
//			System.out.println("non trovato");
//		}
		Utente cappero = new Utente("francesco", "protano", "fprotano@aaa", "temp");
		
		
		try {
			crud.insert(cappero);
			System.out.println("inserito correttamente");
		} catch (RequiredFieldError e) {
			System.out.println(e.getDescription(e));
		} catch (MaxLengthError e) {
			System.out.println(e.getDescription(e));
		} catch (MinLengthError e) {
			System.out.println(e.getDescription(e));
		} catch (UniqueFieldError e) {
			System.out.println(e.getDescription(e));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
