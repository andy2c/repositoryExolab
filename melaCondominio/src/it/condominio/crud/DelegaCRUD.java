package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.DelegaMapper;
import it.condominio.model.Delega;
import it.condominio.util.SqlMapFactory;

public class DelegaCRUD {
	public void insert(Delega model) {

		SqlMapFactory.instance().openSession();

		DelegaMapper mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Delega model) {

		SqlMapFactory.instance().openSession();

		DelegaMapper mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		DelegaMapper mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Delega find(int id) {
		SqlMapFactory.instance().openSession();

		DelegaMapper mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		Delega ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Delega> findAll() {

		SqlMapFactory.instance().openSession();

		DelegaMapper mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		List<Delega> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
