package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Storico_utente;

public interface Storico_utenteMapper {
	public void insert(Storico_utente storico_utente); // fatto

	public void update(Storico_utente storico_utente); // fatto

	public void delete(int id); // fatto

	public Storico_utente find(int id); // fatto

	public List<Storico_utente> findAll(); // fatto
}
