package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.mapper.DelegaMapper;
import it.condominio.model.Delega;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class DelegaCRUD {
	private DelegaMapper mapper;
	private Delega ret = null;
	private List<Delega> list = new ArrayList<Delega>();
	private Validator validator = new Validator();
	private void validateOrUpdate(Delega model) throws RequiredFieldError, MaxLengthError {
		validator.required("percorso delega", model.getPercorso_delega());
		validator.maxLength("percorso delega", model.getPercorso_delega(),20);
	}
	public void insert(Delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Delega model) {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public Delega find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		ret = mapper.find(id);

		SqlMapFactory.instance().closeSession();

		if (ret == null) {
			throw new EntityNotFoundError();
		}
		return ret;

	}

	public List<Delega> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(DelegaMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

}
