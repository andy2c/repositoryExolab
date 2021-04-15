package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Presenza_riunione;

public interface Presenza_riunioneMapper {
	public void insert(Presenza_riunione presenza_riunione);

	public void update(Presenza_riunione presenza_riunione);

	public void delete(int id);

	public Presenza_riunione find(int id);

	public List<Presenza_riunione> findAll();
}
