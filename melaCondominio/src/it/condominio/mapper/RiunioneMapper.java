package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Riunione;

public interface RiunioneMapper {
	public void insert(Riunione riunione);  // fatto

	public void update(Riunione riunione);  // fatto

	public void delete(int id);             // fatto

	public Riunione find(int id);           // fatto

	public List<Riunione> findAll();        // fatto
	
	public Riunione findForInsert(Riunione riunione);           // fatto
}
