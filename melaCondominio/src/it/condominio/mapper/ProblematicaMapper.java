package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Problematica;

public interface ProblematicaMapper {
	public void insert(Problematica problematica);   // fatto

	public void update(Problematica problematica);   // fatto 

	public void delete(int id);   // fatto 

	public Problematica find(int id);  // fatto

	public List<Problematica> findAll();  // fatto
}
