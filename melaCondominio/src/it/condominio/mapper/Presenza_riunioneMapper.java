package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Presenza_riunione;

public interface Presenza_riunioneMapper {
	public void insert(Presenza_riunione presenza_riunione);  // fatto

	public void update(Presenza_riunione presenza_riunione);  // fatto

	public void delete(int id);  // fatto

	public Presenza_riunione find(int id);  // fatto

	public List<Presenza_riunione> findAll();  // fatto
}
