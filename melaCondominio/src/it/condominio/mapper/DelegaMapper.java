package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Delega;

public interface DelegaMapper {
	public void insert(Delega delega);  // fatto ma vedere percorso delega che nel db ha un limite di poche lettere

	public void update(Delega delega);  // fatto

	public void delete(int id);  // fatto

	public Delega find(int id);  // fatto

	public List<Delega> findAll();  // fatto
}
