package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.mapper.SoluzioneMapper;
import it.condominio.model.Soluzione;
import it.condominio.util.SqlMapFactory;

public class SoluzioneCRUD {
	private SoluzioneMapper mapper;
	private Soluzione ret = null;
	private List<Soluzione> list = new ArrayList<Soluzione>();

	public void insert(Soluzione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Soluzione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Soluzione find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Soluzione> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
