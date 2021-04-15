package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Presenza_riunioneMapper;
import it.condominio.model.Presenza_riunione;
import it.condominio.util.SqlMapFactory;

public class Presenza_riunioneCRUD {
	public void insert(Presenza_riunione model) {

		SqlMapFactory.instance().openSession();

		Presenza_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Presenza_riunione model) {

		SqlMapFactory.instance().openSession();

		Presenza_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Presenza_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Presenza_riunione find(int id) {
		SqlMapFactory.instance().openSession();

		Presenza_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);
		Presenza_riunione ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Presenza_riunione> findAll() {

		SqlMapFactory.instance().openSession();

		Presenza_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);
		List<Presenza_riunione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
