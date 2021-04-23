package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.Filtro_delegaMapper;
import it.condominio.model.Filtro_delega;
import it.condominio.util.SqlMapFactory;

public class Filtro_delegaCRUD {
	private Filtro_delegaMapper mapper;
	private Filtro_delega ret = null;
	private List<Filtro_delega> list = new ArrayList<Filtro_delega>();

	public void insert(Filtro_delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Filtro_delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Filtro_delega find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;
		
	}

	public List<Filtro_delega> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
