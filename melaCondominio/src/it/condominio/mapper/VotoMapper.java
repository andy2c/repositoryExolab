package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Voto;

public interface VotoMapper {
	public void insert(Voto voto);   // fatto 

	public void update(Voto voto);

	public void delete(int id);

	public Voto find(int id);   // fatto ma manca solo riempire l'attributo presenza_riunione 

	public List<Voto> findAll();
}
