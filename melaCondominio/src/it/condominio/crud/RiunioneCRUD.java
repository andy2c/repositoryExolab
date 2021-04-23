package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.RiunioneMapper;
import it.condominio.model.Riunione;
import it.condominio.util.SqlMapFactory;

public class RiunioneCRUD {
	private RiunioneMapper mapper;
	private Riunione ret = null;
	private List<Riunione> list = new ArrayList<Riunione>();

	public void insert(Riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Riunione find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Riunione> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
