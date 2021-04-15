package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.PalazzinaMapper;
import it.condominio.model.Palazzina;
import it.condominio.util.SqlMapFactory;

public class PalazzinaCRUD {
	public void insert(Palazzina model) {

		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Palazzina model) {

		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Palazzina find(int id) {
		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		Palazzina ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Palazzina> findAll() {

		SqlMapFactory.instance().openSession();

		PalazzinaMapper mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		List<Palazzina> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
