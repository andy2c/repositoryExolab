package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Palazzina;

public interface PalazzinaMapper {
	public void insert(Palazzina palazzina);  //fatto

	public void update(Palazzina palazzina);   // fatta

	public void delete(int id);     // fatta

	public Palazzina find(int id);   // fatta 

	public List<Palazzina> findAll();  // fatta
	
	public Palazzina findForInsert(Palazzina palazzina);   // fatta 
}
