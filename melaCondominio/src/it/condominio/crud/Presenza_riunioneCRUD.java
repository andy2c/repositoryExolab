package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.Presenza_riunioneMapper;
import it.condominio.model.Presenza_riunione;
import it.condominio.model.Riunione;
import it.condominio.model.Storico_utente;
import it.condominio.util.SqlMapFactory;

public class Presenza_riunioneCRUD {
	private Presenza_riunioneMapper mapper;
	private Presenza_riunione ret = new Presenza_riunione();
	private List<Presenza_riunione> list = new ArrayList<Presenza_riunione>();
	private Storico_utente storico_utente = new Storico_utente();
	private Storico_utenteCRUD storico_utente_crud = new Storico_utenteCRUD();
	private Riunione riunione = new Riunione();
	private RiunioneCRUD riunione_crud = new RiunioneCRUD();

	public void insert(Presenza_riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Presenza_riunione model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Presenza_riunione find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);
		ret = mapper.find(id);
		SqlMapFactory.instance().closeSession();

		storico_utente = storico_utente_crud.find(ret.getId_storico_utente());
		riunione = riunione_crud.find(ret.getId_riunione());

		ret.setStorico_utente(storico_utente);
		ret.setRiunione(riunione);

		return ret;

	}

	public List<Presenza_riunione> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Presenza_riunioneMapper.class);
		list = mapper.findAll();
		SqlMapFactory.instance().closeSession();

		for (Presenza_riunione p : list) {
			storico_utente = storico_utente_crud.find(p.getId_storico_utente());
			riunione = riunione_crud.find(p.getId_riunione());

			p.setStorico_utente(storico_utente);
			p.setRiunione(riunione);

		}

		return list;

	}

}
