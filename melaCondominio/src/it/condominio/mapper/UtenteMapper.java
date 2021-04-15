package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Utente;

public interface UtenteMapper {
	public void insert(Utente utente);

	public void update(Utente utente);

	public void delete(int id);

	public Utente find(int id);

	public List<Utente> findAll();
}
