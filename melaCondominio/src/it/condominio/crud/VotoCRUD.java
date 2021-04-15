package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.VotoMapper;
import it.condominio.model.Voto;
import it.condominio.util.SqlMapFactory;

public class VotoCRUD {
	public void insert(Voto model) {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Voto model) {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Voto find(int id) {
		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		Voto ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Voto> findAll() {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		List<Voto> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
