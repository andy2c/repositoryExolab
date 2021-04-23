package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.MinLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.mapper.UtenteMapper;
import it.condominio.model.Utente;
import it.condominio.util.BaseUtil;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;
import it.condominio.exception.UniqueFieldError;

public class UtenteCRUD extends BaseUtil {
	private UtenteMapper mapper;
	private Utente ret = null;
	private List<Utente> list = new ArrayList<Utente>();
    private Validator validator = new Validator();
    
    private void validateInsertOrUpdate(it.condominio.model.Utente utente) throws RequiredFieldError, MaxLengthError, MinLengthError {
    	validator.required("name", utente.getNome());
    	validator.required("cognome", utente.getCognome());
    	validator.required("email", utente.getEmail());
    	validator.required("password", utente.getPassword());
    	validator.maxLength("name", utente.getNome(), 30);
    	validator.maxLength("cognome", utente.getCognome(), 30);
    	validator.maxLength("email", utente.getEmail(), 30);
    	validator.maxLength("password", utente.getPassword(), 30);
    	validator.minLength("email", utente.getEmail(), 1);  // da aumentare : da 1 a 5 tipo
    	validator.minLength("password", utente.getPassword(), 1);
//    	validator.validateEmail("email", utente.getEmail());              da scommentare a fine progetto
//    	validator.validatePassword("password", utente.getPassword());
    }
    
   private void validateInsert(Utente model) throws RequiredFieldError, MaxLengthError, MinLengthError, UniqueFieldError {
	   validateInsertOrUpdate(model);
	   try {
		   findByEmailAndPassword(model);
		      throw new UniqueFieldError("email");
	   }catch(EntityNotFoundError e) {
		   
	   }
   }
	public void insert(Utente model) throws RequiredFieldError, MaxLengthError, MinLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
	}
	private void validateUpdate(Utente model) throws RequiredFieldError, MaxLengthError, MinLengthError {
		validateInsertOrUpdate(model);
	}
	
	public void update(Utente model) throws RequiredFieldError, MaxLengthError, MinLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Utente find(int id) throws EntityNotFoundError {		
		SqlMapFactory.instance().openSession();
		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		ret = mapper.find(id);
		SqlMapFactory.instance().closeSession();
		if(ret==null)
			throw new EntityNotFoundError();
		return ret;

	}

	public List<Utente> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public Utente findByEmailAndPassword(Utente model) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		ret = mapper.findByEmailAndPassword(model);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}

		return ret;

	}

	public void updatePassword(Utente model) throws RequiredFieldError, MaxLengthError, MinLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);

		mapper.updatePassword(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public List<Utente> findRappresentantiAttivi() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findRappresentantiAttivi();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public List<Utente> findProprietarioAttivo() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		list = mapper.findProprietarioAttivo();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
