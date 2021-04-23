package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Filtro_riunione;

public interface Filtro_riunioneMapper {
	public void insert(Filtro_riunione filtro_riunione); // fatto , come accordato solo l'insert

	public void update(Filtro_riunione filtro_riunione);

	public void delete(int id);

	public Filtro_riunione find(int id);

	public List<Filtro_riunione> findAll();
}
