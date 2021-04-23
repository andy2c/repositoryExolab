package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.ProblematicaMapper;
import it.condominio.model.Problematica;
import it.condominio.util.SqlMapFactory;

public class ProblematicaCRUD {
	private ProblematicaMapper mapper;
	private Problematica ret = new Problematica();
	private List<Problematica> list = new ArrayList<Problematica>();

	public void insert(Problematica model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Problematica model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Problematica find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Problematica> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
