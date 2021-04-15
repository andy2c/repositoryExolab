package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Storico_utente;

public interface Storico_utenteMapper {
	public void insert(Storico_utente storico_utente);

	public void update(Storico_utente storico_utente);

	public void delete(int id);

	public Storico_utente find(int id);

	public List<Storico_utente> findAll();
}
