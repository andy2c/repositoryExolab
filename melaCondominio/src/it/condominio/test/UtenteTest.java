package it.condominio.test;

import java.util.List;

import it.condominio.crud.UtenteCRUD;
import it.condominio.model.Utente;

public class UtenteTest {

	public static void main(String[] args) {
		UtenteCRUD crud = new UtenteCRUD();
		
		Utente model = new Utente();
		model.setId(4);
		model.setPassword("passCambiata");

		System.out.println("Stampa qui");
		
		
		
		
	}

}
