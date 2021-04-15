package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.SoluzioneMapper;
import it.condominio.model.Soluzione;
import it.condominio.util.SqlMapFactory;

public class SoluzioneCRUD {
	public void insert(Soluzione model) {

		SqlMapFactory.instance().openSession();

		SoluzioneMapper mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Soluzione model) {

		SqlMapFactory.instance().openSession();

		SoluzioneMapper mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		SoluzioneMapper mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Soluzione find(int id) {
		SqlMapFactory.instance().openSession();

		SoluzioneMapper mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);
		Soluzione ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

	public List<Soluzione> findAll() {

		SqlMapFactory.instance().openSession();

		SoluzioneMapper mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);
		List<Soluzione> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
