package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Soluzione;

public interface SoluzioneMapper {
	public void insert(Soluzione soluzione);  // fatto 

	public void update(Soluzione soluzione);  // fatto

	public void delete(int id);  // fatto

	public Soluzione find(int id);  // fatto

	public List<Soluzione> findAll();  // fatto
}
