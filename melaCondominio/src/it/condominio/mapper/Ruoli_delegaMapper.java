package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Ruoli_delega;

public interface Ruoli_delegaMapper {
	public void insert(Ruoli_delega ruoli_delega); // fatto

	public void update(Ruoli_delega ruoli_delega); // fatto

	public void delete(int id); // fatto

	public Ruoli_delega find(int id); // fatto

	public List<Ruoli_delega> findAll(); // fatto
}
