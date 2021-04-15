package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Tipo_problematicaMapper;
import it.condominio.model.Tipo_problematica;
import it.condominio.util.SqlMapFactory;

public class Tipo_problematicaCRUD {
	public void insert(Tipo_problematica model) {

		SqlMapFactory.instance().openSession();

		Tipo_problematicaMapper mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Tipo_problematica model) {

		SqlMapFactory.instance().openSession();

		Tipo_problematicaMapper mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Tipo_problematicaMapper mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Tipo_problematica find(int id) {
		SqlMapFactory.instance().openSession();

		Tipo_problematicaMapper mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);
		Tipo_problematica ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Tipo_problematica> findAll() {

		SqlMapFactory.instance().openSession();

		Tipo_problematicaMapper mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);
		List<Tipo_problematica> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
