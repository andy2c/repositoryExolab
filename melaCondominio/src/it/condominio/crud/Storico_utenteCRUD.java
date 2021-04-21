package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.Storico_utenteMapper;
import it.condominio.model.Storico_utente;
import it.condominio.util.BaseUtil;
import it.condominio.util.SqlMapFactory;

public class Storico_utenteCRUD extends BaseUtil{
	public void insert(Storico_utente model) {

		SqlMapFactory.instance().openSession();

		Storico_utenteMapper mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Storico_utente model) {

		SqlMapFactory.instance().openSession();

		Storico_utenteMapper mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		Storico_utenteMapper mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	

	
	public Storico_utente find(int id) {
		SqlMapFactory.instance().openSession();

		Storico_utenteMapper mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);
		Storico_utente ret = mapper.find(id);
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

		Storico_utenteMapper mapper = SqlMapFactory.instance().getMapper(Storico_utenteMapper.class);
		List<Storico_utente> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();
		
		return ret;
		
	}
	
	
	
	
	
	
	
	
	
	
}
