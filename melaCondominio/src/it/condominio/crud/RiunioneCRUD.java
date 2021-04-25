package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.RiunioneMapper;
import it.condominio.model.Riunione;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class RiunioneCRUD {
	private RiunioneMapper mapper;
	private Riunione ret = null;
	private List<Riunione> list = new ArrayList<Riunione>();
    private Validator validator = new Validator();
    private void validareInsertOrUpdate(Riunione model) throws RequiredFieldError, MaxLengthError {
    	validator.required("data riunione", model.getData_riunione());
    	validator.required("nome verbale", model.getNome_verbale());
    	validator.required("verbale contenuto", model.getVerbale_contenuto());
    	validator.required("verbale percorso", model.getVerbale_percorso());
    	validator.maxLength("nome verbale", model.getNome_verbale(),50);
    	validator.maxLength("verbale contenuto", model.getVerbale_contenuto(),1000);
    	validator.maxLength("verbale percorso", model.getVerbale_percorso(),50);
    	
    }
    private void validateInsert(Riunione model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
    	validareInsertOrUpdate(model);
    	ret = findForInsert(model);
    	if(ret != null)
    		throw new UniqueFieldError("riunione gìa esiste - ");
    	
    }
    private void validateUpdate(Riunione model) throws RequiredFieldError, MaxLengthError {
    	validareInsertOrUpdate(model);
    }
    
	public void insert(Riunione model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Riunione model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Riunione find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Riunione> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}
	
	public Riunione findForInsert(Riunione model) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(RiunioneMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();
		
		return ret;

	}
	
	
	
	
	
	
}
