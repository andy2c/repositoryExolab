package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.ProblematicaMapper;
import it.condominio.model.Problematica;
import it.condominio.util.SqlMapFactory;

public class ProblematicaCRUD {
	public void insert(Problematica model) {

		SqlMapFactory.instance().openSession();

		ProblematicaMapper mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Problematica model) {

		SqlMapFactory.instance().openSession();

		ProblematicaMapper mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		ProblematicaMapper mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Problematica find(int id) {
		SqlMapFactory.instance().openSession();

		ProblematicaMapper mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		Problematica ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Problematica> findAll() {

		SqlMapFactory.instance().openSession();

		ProblematicaMapper mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		List<Problematica> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
