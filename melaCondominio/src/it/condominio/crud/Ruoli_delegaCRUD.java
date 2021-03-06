package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.Ruoli_delegaMapper;
import it.condominio.model.Ruoli_delega;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class Ruoli_delegaCRUD {
	private Ruoli_delegaMapper mapper;
	private Ruoli_delega ret = null;
	private List<Ruoli_delega> list = new ArrayList<Ruoli_delega>();
    private Validator validator = new Validator();

    private void validateInsertOrUpdate(Ruoli_delega model) throws RequiredFieldError, MaxLengthError {
    	validator.required("nome", model.getNome());
    	validator.maxLength("nome", model.getNome(), 20);
    	
    }
    private void validateInsert(Ruoli_delega model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
    	validateInsertOrUpdate(model);
    	ret = findForInsert(model);
    	if(ret != null)
    		throw new UniqueFieldError("nome ruolo delega");
    }
    private void validateUpdate(Ruoli_delega model) throws RequiredFieldError, MaxLengthError {
    	validateInsertOrUpdate(model);
    	
    }
    
	public void insert(Ruoli_delega model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Ruoli_delega model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Ruoli_delega find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Ruoli_delega> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}
	public Ruoli_delega findForInsert(Ruoli_delega model)  {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Ruoli_delegaMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();
		
		return ret;

	}
	
	
}
