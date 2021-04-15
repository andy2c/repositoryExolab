package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Ruoli_delegaMapper;
import it.condominio.model.Ruoli_delega;
import it.condominio.util.SqlMapFactory;

public class Ruoli_delegaCRUD {
	public void insert(Ruoli_delega model) {

		SqlMapFactory.instance().openSession();

		Ruoli_delegaMapper mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Ruoli_delega model) {

		SqlMapFactory.instance().openSession();

		Ruoli_delegaMapper mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Ruoli_delegaMapper mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Ruoli_delega find(int id) {
		SqlMapFactory.instance().openSession();

		Ruoli_delegaMapper mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);
		Ruoli_delega ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Ruoli_delega> findAll() {

		SqlMapFactory.instance().openSession();

		Ruoli_delegaMapper mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);
		List<Ruoli_delega> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
