package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.MinLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.mapper.ProblematicaMapper;
import it.condominio.model.Problematica;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class ProblematicaCRUD {
	private ProblematicaMapper mapper;
	private Problematica ret = null;
	private List<Problematica> list = new ArrayList<Problematica>();
    private Validator validator = new Validator();
    private void validateInsertOrUpdate(Problematica model) throws RequiredFieldError, MaxLengthError, MinLengthError {
    	validator.required("descrizione problematica", model.getDescrizione_problematica());
    	validator.maxLength("descrizione problematica", model.getDescrizione_problematica(), 500);
    	validator.minLength("descrizione problematica", model.getDescrizione_problematica(), 10);
    }
    private void validateInsert(Problematica model) throws RequiredFieldError, MaxLengthError, MinLengthError {
    	validateInsertOrUpdate(model);
    }
    private void validateUpdate(Problematica model) throws RequiredFieldError, MaxLengthError, MinLengthError{
    	validateInsertOrUpdate(model);
    }
    
	public void insert(Problematica model) throws RequiredFieldError, MaxLengthError, MinLengthError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Problematica model) throws RequiredFieldError, MaxLengthError, MinLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Problematica find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Problematica> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(ProblematicaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
