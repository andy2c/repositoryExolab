package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.RiunioneMapper;
import it.condominio.model.Riunione;
import it.condominio.util.SqlMapFactory;

public class RiunioneCRUD {
	public void insert(Riunione model) {

		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Riunione model) {

		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Riunione find(int id) {
		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		Riunione ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Riunione> findAll() {

		SqlMapFactory.instance().openSession();

		RiunioneMapper mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		List<Riunione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
