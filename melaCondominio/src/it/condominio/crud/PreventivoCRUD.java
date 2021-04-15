package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.PreventivoMapper;
import it.condominio.model.Preventivo;
import it.condominio.util.SqlMapFactory;

public class PreventivoCRUD {
	public void insert(Preventivo model) {

		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Preventivo model) {

		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Preventivo find(int id) {
		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		Preventivo ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Preventivo> findAll() {

		SqlMapFactory.instance().openSession();

		PreventivoMapper mapper = SqlMapFactory.instance().getMapper(PreventivoMapper.class);
		List<Preventivo> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
