package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.AppartamentoMapper;
import it.condominio.model.Appartamento;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class AppartamentoCRUD {
	private AppartamentoMapper mapper;
	private Appartamento ret = null;
	private List<Appartamento> list = new ArrayList<Appartamento>();
	private Validator validator = new Validator();
	
	
	private void validateInsertOrUpdate(Appartamento model) throws RequiredFieldError, MaxLengthError {
		validator.required("interno", model.getInterno());
		validator.maxLength("interno", model.getInterno(), 5);
        // id_palazzina non va controllata perchè nella pagina jsp si mostrerà una lista di palazzina e sarà obbligatorio sceglierne sono una	
	}
	private void validateInsert(Appartamento model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsertOrUpdate(model);
		ret = findForInsert(model);
		if(ret != null)
			throw new UniqueFieldError("interno");
	}
	
	public void insert(Appartamento model) throws RequiredFieldError, MaxLengthError, UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}
	
	private void validateUpdate(Appartamento model) throws RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
	}
	public void update(Appartamento model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Appartamento find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Appartamento> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}
	
	public Appartamento findForInsert(Appartamento model)  {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(AppartamentoMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();

		
		return ret;

	}
}
