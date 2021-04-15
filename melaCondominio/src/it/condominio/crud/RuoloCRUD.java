package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.RuoloMapper;
import it.condominio.model.Ruolo;
import it.condominio.util.SqlMapFactory;

public class RuoloCRUD {
	public void insert(Ruolo model) {

		SqlMapFactory.instance().openSession();

		RuoloMapper mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Ruolo model) {

		SqlMapFactory.instance().openSession();

		RuoloMapper mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		RuoloMapper mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Ruolo find(int id) {
		SqlMapFactory.instance().openSession();

		RuoloMapper mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		Ruolo ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Ruolo> findAll() {

		SqlMapFactory.instance().openSession();

		RuoloMapper mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		List<Ruolo> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
