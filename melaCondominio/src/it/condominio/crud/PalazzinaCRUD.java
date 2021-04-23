package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.PalazzinaMapper;
import it.condominio.model.Palazzina;
import it.condominio.util.SqlMapFactory;

public class PalazzinaCRUD {
	private PalazzinaMapper mapper;
	private Palazzina ret = new Palazzina();
	private List<Palazzina> list = new ArrayList<Palazzina>();

	public void insert(Palazzina model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Palazzina model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Palazzina find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Palazzina> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
