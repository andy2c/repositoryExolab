package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.StatoMapper;
import it.condominio.model.Stato;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class StatoCRUD {
	private StatoMapper mapper;
	private Stato ret = null;
	private List<Stato> list = new ArrayList<Stato>();
	private Validator validator = new Validator();

	private void validateInsertOrUpdate(Stato model) throws RequiredFieldError, MaxLengthError {
		validator.required("nome", model.getNome());
		validator.maxLength("nome", model.getNome(), 20);
	}

	private void validateInsert(Stato model) throws UniqueFieldError, RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
		ret = findForInsert(model);
		if (ret != null)
			throw new UniqueFieldError("nome stato ");

	}

	private void validateUpdate(Stato model) throws RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
	}

	public void insert(Stato model) throws UniqueFieldError, RequiredFieldError, MaxLengthError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Stato model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Stato find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Stato> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public Stato findForInsert(Stato model) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(StatoMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
