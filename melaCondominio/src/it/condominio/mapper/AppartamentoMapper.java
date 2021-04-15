package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Appartamento;


public interface AppartamentoMapper {
	public void insert(Appartamento appartamento);

	public void update(Appartamento appartamento);

	public void delete(int id);

	public Appartamento find(int id);

	public List<Appartamento> findAll();
}
