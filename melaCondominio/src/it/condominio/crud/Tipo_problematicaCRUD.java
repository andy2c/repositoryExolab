package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.Tipo_problematicaMapper;
import it.condominio.model.Tipo_problematica;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class Tipo_problematicaCRUD {
	private Tipo_problematicaMapper mapper;
	private Tipo_problematica ret = null;
	private List<Tipo_problematica> list = new ArrayList<Tipo_problematica>();
	private Validator validator = new Validator();

	private void validateInsertOrUpdate(Tipo_problematica model) throws RequiredFieldError, MaxLengthError {
		validator.required("nome", model.getNome());
		validator.maxLength("nome", model.getNome(), 30);
	}

	private void validateInsert(Tipo_problematica model) throws UniqueFieldError, RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
		ret = findForInsert(model);
		if (ret != null)
			throw new UniqueFieldError("nome tipo problematica ");

	}

	private void validateUpdate(Tipo_problematica model) throws RequiredFieldError, MaxLengthError {
		validateInsertOrUpdate(model);
	}

	public void insert(Tipo_problematica model) throws UniqueFieldError, RequiredFieldError, MaxLengthError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Tipo_problematica model) throws RequiredFieldError, MaxLengthError {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Tipo_problematica find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Tipo_problematica> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public Tipo_problematica findForInsert(Tipo_problematica model) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(Tipo_problematicaMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
