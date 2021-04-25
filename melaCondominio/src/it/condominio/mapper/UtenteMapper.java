package it.condominio.mapper;

import java.util.List;


import it.condominio.model.Utente;


public interface UtenteMapper {
	public void insert(Utente utente);   // fatto

	public void update(Utente utente);  // fatto

	public void delete(int id);         // fatto

	public Utente find(int id);         // fatto

	public List<Utente> findAll();      // fatto
	
	public Utente findByEmailAndPassword(Utente utente); // fatto   , se non trova nulla (quindi non combaciano) dà errore NullPointException 
	
	public void updatePassword(Utente utente);   // fatto
	
	public List<Utente> findRappresentantiAttivi();      // fatto
	
	public List<Utente> findProprietarioAttivo();      // fatto
	
}
