package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.StatoMapper;
import it.condominio.model.Stato;
import it.condominio.util.SqlMapFactory;

public class StatoCRUD {
	public void insert(Stato model) {

		SqlMapFactory.instance().openSession();

		StatoMapper mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Stato model) {

		SqlMapFactory.instance().openSession();

		StatoMapper mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		StatoMapper mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Stato find(int id) {
		SqlMapFactory.instance().openSession();

		StatoMapper mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);
		Stato ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Stato> findAll() {

		SqlMapFactory.instance().openSession();

		StatoMapper mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);
		List<Stato> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
