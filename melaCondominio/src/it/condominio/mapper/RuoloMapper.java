package it.condominio.mapper;

import java.util.List;
import it.condominio.model.Ruolo;

public interface RuoloMapper {
	public void insert(Ruolo ruolo);

	public void update(Ruolo ruolo);

	public void delete(int id);

	public Ruolo find(int id);

	public List<Ruolo> findAll();
	
	public Ruolo findForInsert(Ruolo ruolo); // fatto
}
