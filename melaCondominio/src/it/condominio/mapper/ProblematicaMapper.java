package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Problematica;

public interface ProblematicaMapper {
	public void insert(Problematica problematica);

	public void update(Problematica problematica);

	public void delete(int id);

	public Problematica find(int id);

	public List<Problematica> findAll();
}
