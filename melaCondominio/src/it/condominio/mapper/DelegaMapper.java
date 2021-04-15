package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Delega;

public interface DelegaMapper {
	public void insert(Delega delega);

	public void update(Delega delega);

	public void delete(int id);

	public Delega find(int id);

	public List<Delega> findAll();
}
