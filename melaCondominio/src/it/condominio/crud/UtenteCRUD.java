package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.UtenteMapper;
import it.condominio.model.Utente;
import it.condominio.util.BaseUtil;
import it.condominio.util.SqlMapFactory;

public class UtenteCRUD extends BaseUtil {
	private UtenteMapper mapper;
	private Utente ret = new Utente();
	private List<Utente> list = new ArrayList<Utente>();

	public void insert(Utente model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Utente model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Utente find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Utente> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public Utente findByEmailAndPassword(Utente model) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		ret = mapper.findByEmailAndPassword(model);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}

		return ret;

	}

	public void updatePassword(Utente model) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.updatePassword(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Utente> findRappresentantiAttivi() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findRappresentantiAttivi();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public List<Utente> findProprietarioAttivo() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findProprietarioAttivo();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
