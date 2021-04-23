package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.AppartamentoMapper;
import it.condominio.model.Appartamento;
import it.condominio.util.SqlMapFactory;

public class AppartamentoCRUD {
	private AppartamentoMapper mapper;
	private Appartamento ret = new Appartamento();
	private List<Appartamento> list = new ArrayList<Appartamento>();
	public void insert(Appartamento model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Appartamento model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Appartamento find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Appartamento> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
