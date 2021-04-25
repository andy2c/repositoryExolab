package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.RuoloMapper;
import it.condominio.model.Ruolo;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class RuoloCRUD {
	private RuoloMapper mapper;
	private Ruolo ret = null;
	private List<Ruolo> list = new ArrayList<Ruolo>();
    private Validator validator = new Validator();
    private void validateInsertOrUpdate(Ruolo model) throws RequiredFieldError, MaxLengthError {
    	validator.required("nome", model.getNome());
    	validator.maxLength("nome", model.getNome(), 30);
    	
    }
    private void validateInsert(Ruolo model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
    	validateInsertOrUpdate(model);
    	ret = findForInsert(model);
    	if(ret != null)
    		throw new UniqueFieldError("nome ruolo ");
    }
    private void validateUpdate(Ruolo model) throws RequiredFieldError, MaxLengthError {
    	validateInsertOrUpdate(model);
    	
    }
    
    
	public void insert(Ruolo model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Ruolo model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Ruolo find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Ruolo> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}
	public Ruolo findForInsert(Ruolo model)  {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RuoloMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();
		
		return ret;

	}
}
