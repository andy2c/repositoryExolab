package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Riunione;

public interface RiunioneMapper {
	public void insert(Riunione riunione);

	public void update(Riunione riunione);

	public void delete(int id);

	public Riunione find(int id);

	public List<Riunione> findAll();
}
