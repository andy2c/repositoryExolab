package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Ruoli_delega;

public interface Ruoli_delegaMapper {
	public void insert(Ruoli_delega ruoli_delega);

	public void update(Ruoli_delega ruoli_delega);

	public void delete(int id);

	public Ruoli_delega find(int id);

	public List<Ruoli_delega> findAll();
}
