package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.DelegaMapper;
import it.condominio.model.Delega;
import it.condominio.util.SqlMapFactory;

public class DelegaCRUD {
	private DelegaMapper mapper;
	private Delega ret = new Delega();
	private List<Delega> list = new ArrayList<Delega>();
	public void insert(Delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Delega find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Delega> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
