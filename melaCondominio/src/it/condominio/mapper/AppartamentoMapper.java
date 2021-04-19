package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Appartamento;


public interface AppartamentoMapper {
	public void insert(Appartamento appartamento);   // fatta

	public void update(Appartamento appartamento);    // fatta

	public void delete(int id);  // fatta

	public Appartamento find(int id); // fatta  con mappa

	public List<Appartamento> findAll();  // fatta con mappa
}
