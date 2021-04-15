package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.UtenteMapper;
import it.condominio.model.Utente;
import it.condominio.util.SqlMapFactory;

public class UtenteCRUD {
	public void insert(Utente model) {

		SqlMapFactory.instance().openSession();

		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Utente model) {

		SqlMapFactory.instance().openSession();

		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Utente find(int id) {
		SqlMapFactory.instance().openSession();

		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		Utente ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Utente> findAll() {

		SqlMapFactory.instance().openSession();

		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		List<Utente> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
