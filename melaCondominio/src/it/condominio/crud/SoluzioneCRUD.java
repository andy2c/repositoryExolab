package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.SoluzioneMapper;
import it.condominio.model.Soluzione;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class SoluzioneCRUD {
	private SoluzioneMapper mapper;
	private Soluzione ret = null;
	private List<Soluzione> list = new ArrayList<Soluzione>();
    private Validator validator = new Validator();
    
    private void validateInsertOrUpdate(Soluzione model) throws RequiredFieldError, MaxLengthError {
    	validator.required("nome", model.getNome());
    	validator.maxLength("nome", model.getNome(),50);
    	validator.required("descrizione", model.getDescrizione());
    	validator.maxLength("descrizione", model.getDescrizione(),500);
    }
    private void validateInsert(Soluzione model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
    	validateInsertOrUpdate(model);
    	ret = findForInsert(model);
    	if(ret != null)
    		throw new UniqueFieldError("nome  e descrizione ");
    	
    }
    private void validateUpdate(Soluzione model) throws RequiredFieldError, MaxLengthError {
    	validateInsertOrUpdate(model);	
    }
	public void insert(Soluzione model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Soluzione model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
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
	
	public Soluzione findForInsert(Soluzione model)  {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(SoluzioneMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();
		
		return ret;

	}

}
