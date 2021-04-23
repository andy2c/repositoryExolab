package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.Filtro_riunioneMapper;
import it.condominio.model.Filtro_riunione;
import it.condominio.util.SqlMapFactory;

public class Filtro_riunioneCRUD {
	Filtro_riunioneMapper mapper;
	Filtro_riunione ret = null;
	List<Filtro_riunione> list = new ArrayList<Filtro_riunione>();

	public void insert(Filtro_riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Filtro_riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Filtro_riunione find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Filtro_riunione> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_riunioneMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
