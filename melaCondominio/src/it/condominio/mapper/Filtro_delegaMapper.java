package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Filtro_delega;

public interface Filtro_delegaMapper {
	public void insert(Filtro_delega filtro_delega);  // fatto , mi è stato detto di fare solo la insert

	public void update(Filtro_delega filtro_delega);

	public void delete(int id);

	public Filtro_delega find(int id);

	public List<Filtro_delega> findAll();
}
