package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.PreventivoMapper;
import it.condominio.model.Preventivo;
import it.condominio.util.SqlMapFactory;

public class PreventivoCRUD {
	private PreventivoMapper mapper;
	private Preventivo ret = null;
	private List<Preventivo> list = new ArrayList<Preventivo>();

	public void insert(Preventivo model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Preventivo model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Preventivo find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Preventivo> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
