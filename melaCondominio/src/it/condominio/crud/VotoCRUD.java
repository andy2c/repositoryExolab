package it.condominio.crud;

import java.util.List;

import it.condominio.mapper.VotoMapper;
import it.condominio.model.Presenza_riunione;
import it.condominio.model.Soluzione;
import it.condominio.model.Voto;
import it.condominio.util.SqlMapFactory;

public class VotoCRUD {
	Soluzione soluzione = new Soluzione();
	SoluzioneCRUD soluzione_crud = new SoluzioneCRUD();
	Presenza_riunione presenza_riunione = new Presenza_riunione();
	Presenza_riunioneCRUD presenza_riunione_crud = new Presenza_riunioneCRUD();
	
	
	
	
	
	public void insert(Voto model) {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Voto model) {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	public void delete(int id) {
		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);

		mapper.delete(id);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
	}

	
	public List<Voto> findAll() {

		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		List<Voto> ret = mapper.findAll();

		SqlMapFactory.instance().closeSession();

		return ret;

	}
	public Voto find(int id) {
		SqlMapFactory.instance().openSession();

		VotoMapper mapper = SqlMapFactory.instance().getMapper(VotoMapper.class);
		Voto ret = mapper.find(id);
		SqlMapFactory.instance().closeSession();
		
		soluzione = soluzione_crud.find(ret.getId_soluzione());
		ret.setSoluzione(soluzione);
		
		presenza_riunione = presenza_riunione_crud.find(ret.getId_presenza_riunione());
		ret.setPresenza_riunione(presenza_riunione);
		return ret;

	}

}
