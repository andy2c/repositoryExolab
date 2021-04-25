package it.condominio.crud;

import java.util.ArrayList;
import java.util.List;

import it.condominio.exception.EntityNotFoundError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.mapper.VotoMapper;
import it.condominio.model.Presenza_riunione;
import it.condominio.model.Soluzione;
import it.condominio.model.Voto;
import it.condominio.util.SqlMapFactory;
import it.condominio.util.Validator;

public class VotoCRUD {
	private Soluzione soluzione = null;
	private SoluzioneCRUD soluzione_crud = new SoluzioneCRUD();
	private Presenza_riunione presenza_riunione = new Presenza_riunione();
	private Presenza_riunioneCRUD presenza_riunione_crud = new Presenza_riunioneCRUD();
	private Validator validator = new Validator();

	private VotoMapper mapper;
	private Voto ret = new Voto();
	private List<Voto> list = new ArrayList<Voto>();

	private void validateInsertOrUpdate(Voto model) {

	}

	private void validateInsert(Voto model) throws UniqueFieldError {
		validateInsertOrUpdate(model);
		ret = findForInsert(model);
		if (ret != null)
			throw new UniqueFieldError("id presenza riunione  e  id soluzione ");

	}

	private void validateUpdate(Voto model) {
		validateInsertOrUpdate(model);
	}

	public void insert(Voto model) throws UniqueFieldError {
		validateInsert(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Voto model) {
		validateUpdate(model);
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public List<Voto> findAll() {

		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		list = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return list;

	}

	public Voto find(int id) throws EntityNotFoundError {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		ret = mapper.find(id);
		SqlMapFactory.instance().closeSession();
		if (ret == null) {
			throw new EntityNotFoundError();
		}
		soluzione = soluzione_crud.find(ret.getId_soluzione());
		ret.setSoluzione(soluzione);

		presenza_riunione = presenza_riunione_crud.find(ret.getId_presenza_riunione());
		ret.setPresenza_riunione(presenza_riunione);
		return ret;

	}

	public Voto findForInsert(Voto model) {
		SqlMapFactory.instance().openSession();

		mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		ret = mapper.findForInsert(model);

		SqlMapFactory.instance().closeSession();

		return ret;

	}

}
