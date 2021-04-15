package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Tipo_problematica;

public interface Tipo_problematicaMapper {
	public void insert(Tipo_problematica tipo_problematica);

	public void update(Tipo_problematica tipo_problematica);

	public void delete(int id);

	public Tipo_problematica find(int id);

	public List<Tipo_problematica> findAll();
}
