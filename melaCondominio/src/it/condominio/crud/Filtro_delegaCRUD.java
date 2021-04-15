package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Filtro_delegaMapper;
import it.condominio.model.Filtro_delega;
import it.condominio.util.SqlMapFactory;

public class Filtro_delegaCRUD {
	public void insert(Filtro_delega model) {

		SqlMapFactory.instance().openSession();

		Filtro_delegaMapper mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Filtro_delega model) {

		SqlMapFactory.instance().openSession();

		Filtro_delegaMapper mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Filtro_delegaMapper mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Filtro_delega find(int id) {
		SqlMapFactory.instance().openSession();

		Filtro_delegaMapper mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);
		Filtro_delega ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Filtro_delega> findAll() {

		SqlMapFactory.instance().openSession();

		Filtro_delegaMapper mapper = SqlMapFactory.instance().getMapper(Filtro_delegaMapper.class);
		List<Filtro_delega> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
