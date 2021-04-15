package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Palazzina;

public interface PalazzinaMapper {
	public void insert(Palazzina palazzina);

	public void update(Palazzina palazzina);

	public void delete(int id);

	public Palazzina find(int id);

	public List<Palazzina> findAll();
}
