package it.condominio.mapper;

import java.util.List;

import it.condominio.model.Preventivo;

public interface PreventivoMapper {
	public void insert(Preventivo preventivo);  // fatto , inserisce solo ditta_nome e preventivo_prezzo, i campi obbligatori nella tab

	public void update(Preventivo preventivo);  // fatto   aggiorna tutti i campi , quindi lo usiamo per completare i campi di sopra

	public void delete(int id);     //  fatto

	public Preventivo find(int id);    // fatto

	public List<Preventivo> findAll(); // fatto
}
