package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.RuoloMapper;
import it.condominio.model.Ruolo;
import it.condominio.util.SqlMapFactory;

public class RuoloCRUD {
	private RuoloMapper mapper;
	private Ruolo ret = new Ruolo();
	private List<Ruolo> list = new ArrayList<Ruolo>();

	public void insert(Ruolo model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Ruolo model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Ruolo find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Ruolo> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
