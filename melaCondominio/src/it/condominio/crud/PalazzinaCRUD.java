package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.PalazzinaMapper;
import it.condominio.model.Palazzina;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class PalazzinaCRUD {
	private PalazzinaMapper mapper;
	private Palazzina ret = null;
	private List<Palazzina> list = new ArrayList<Palazzina>();
    private Validator validator = new Validator();
    
    private void validateInsertOrUpdate(Palazzina model) throws RequiredFieldError, MaxLengthError {
    	validator.required("nome", model.getNome());
    	validator.required("via", model.getVia());
    	validator.required("città", model.getCitta());
    	validator.required("regione", model.getRegione());
    	
    	validator.maxLength("nome", model.getNome(),10);
    	validator.maxLength("via", model.getVia(),30);
    	validator.maxLength("città", model.getCitta(),30);
    	validator.maxLength("regione", model.getRegione(),30);
    }
    
    
    
    private void validateInsert(Palazzina model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
    	validateInsertOrUpdate(model);
    	ret = findForInsert(model);
    	if(ret != null)
    		throw new UniqueFieldError("nome");
    		 
    }
    
	public void insert(Palazzina model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
        validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	private void valdiateUpdate(Palazzina model) throws RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
	}
	public void update(Palazzina model) throws RequiredFieldError, MaxLengthError {
		valdiateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Palazzina find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Palazzina> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}
	public Palazzina findForInsert(Palazzina model)  {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(PalazzinaMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
