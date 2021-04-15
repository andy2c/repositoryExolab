package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Stato;

public interface StatoMapper {
	public void insert(Stato stato);

	public void update(Stato stato);

	public void delete(int id);

	public Stato find(int id);

	public List<Stato> findAll();
}
