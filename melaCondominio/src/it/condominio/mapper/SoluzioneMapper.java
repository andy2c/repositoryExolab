package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Soluzione;

public interface SoluzioneMapper {
	public void insert(Soluzione soluzione);

	public void update(Soluzione soluzione);

	public void delete(int id);

	public Soluzione find(int id);

	public List<Soluzione> findAll();
}
