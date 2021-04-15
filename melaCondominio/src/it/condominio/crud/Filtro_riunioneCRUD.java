package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Filtro_riunioneMapper;
import it.condominio.model.Filtro_riunione;
import it.condominio.util.SqlMapFactory;

public class Filtro_riunioneCRUD {
	public void insert(Filtro_riunione model) {

		SqlMapFactory.instance().openSession();

		Filtro_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Filtro_riunione model) {

		SqlMapFactory.instance().openSession();

		Filtro_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Filtro_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Filtro_riunione find(int id) {
		SqlMapFactory.instance().openSession();

		Filtro_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);
		Filtro_riunione ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Filtro_riunione> findAll() {

		SqlMapFactory.instance().openSession();

		Filtro_riunioneMapper mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);
		List<Filtro_riunione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
