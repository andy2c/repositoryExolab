package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Voto;

public interface VotoMapper {
	public void insert(Voto voto);

	public void update(Voto voto);

	public void delete(int id);

	public Voto find(int id);

	public List<Voto> findAll();
}
