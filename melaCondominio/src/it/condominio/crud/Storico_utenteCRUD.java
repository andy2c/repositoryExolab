package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.mapper.Storico_utenteMapper;
import it.condominio.model.Appartamento;
import it.condominio.model.Ruolo;
import it.condominio.model.Stato;
import it.condominio.model.Storico_utente;
import it.condominio.model.Utente;
import it.condominio.util.SqlMapFactory;

public class Storico_utenteCRUD {
	private Storico_utenteMapper mapper;
	private Storico_utente ret = new Storico_utente();
	private List<Storico_utente> list = new ArrayList<Storico_utente>();
	private Utente utente = new Utente();
	private UtenteCRUD utente_crud = new UtenteCRUD();
	private Ruolo ruolo = new Ruolo();
	private RuoloCRUD ruolo_crud = new RuoloCRUD();
	private Appartamento appartamento = new Appartamento();
	private AppartamentoCRUD appartamento_crud = new AppartamentoCRUD();
	private Stato stato = new Stato();
	private StatoCRUD stato_crud = new StatoCRUD();

	public void insert(Storico_utente model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Storico_utente model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Storico_utente find(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);
		ret = mapper.find(id);
		SqlMapFactory.instance().closeSession();

		utente = utente_crud.find(ret.getId_utente());
		ruolo = ruolo_crud.find(ret.getId_ruolo());
		appartamento = appartamento_crud.find(ret.getId_appartamento());
		stato = stato_crud.find(ret.getId_stato());

		ret.setUtente(utente);
		ret.setRuolo(ruolo);
		ret.setAppartamento(appartamento);
		ret.setStato(stato);

		return ret;

	}

	public List<Storico_utente> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);
		list = mapper.findAll();
		SqlMapFactory.instance().closeSession();
		for (Storico_utente s : list) {
			utente = utente_crud.find(s.getId_utente());
			ruolo = ruolo_crud.find(s.getId_ruolo());
			appartamento = appartamento_crud.find(s.getId_appartamento());
			stato = stato_crud.find(s.getId_stato());

			s.setUtente(utente);
			s.setRuolo(ruolo);
			s.setAppartamento(appartamento);
			s.setStato(stato);

		}

		return list;

	}

}
