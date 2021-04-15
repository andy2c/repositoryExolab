package it.condominio.model;

public class Problematica {
	private int id;
	private String oggetto_problematica;
	private String descrizione_problematica;
	private String problematica_percorso;
	private int id_tipo_problematica;
	private int id_stato_problematica;
	
	private Tipo_problematica tipo_problematica;
	private Stato stato;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOggetto_problematica() {
		return oggetto_problematica;
	}
	public void setOggetto_problematica(String oggetto_problematica) {
		this.oggetto_problematica = oggetto_problematica;
	}
	public String getDescrizione_problematica() {
		return descrizione_problematica;
	}
	public void setDescrizione_problematica(String descrizione_problematica) {
		this.descrizione_problematica = descrizione_problematica;
	}
	public String getProblematica_percorso() {
		return problematica_percorso;
	}
	public void setProblematica_percorso(String problematica_percorso) {
		this.problematica_percorso = problematica_percorso;
	}
	public int getId_tipo_problematica() {
		return id_tipo_problematica;
	}
	public void setId_tipo_problematica(int id_tipo_problematica) {
		this.id_tipo_problematica = id_tipo_problematica;
	}
	public int getId_stato_problematica() {
		return id_stato_problematica;
	}
	public void setId_stato_problematica(int id_stato_problematica) {
		this.id_stato_problematica = id_stato_problematica;
	}
	public Tipo_problematica getTipo_problematica() {
		return tipo_problematica;
	}
	public void setTipo_problematica(Tipo_problematica tipo_problematica) {
		this.tipo_problematica = tipo_problematica;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public Problematica(int id, String oggetto_problematica, String descrizione_problematica,
			String problematica_percorso, int id_tipo_problematica, int id_stato_problematica,
			Tipo_problematica tipo_problematica, Stato stato) {
		super();
		this.id = id;
		this.oggetto_problematica = oggetto_problematica;
		this.descrizione_problematica = descrizione_problematica;
		this.problematica_percorso = problematica_percorso;
		this.id_tipo_problematica = id_tipo_problematica;
		this.id_stato_problematica = id_stato_problematica;
		this.tipo_problematica = tipo_problematica;
		this.stato = stato;
	}
	public Problematica(String oggetto_problematica, String descrizione_problematica, String problematica_percorso,
			int id_tipo_problematica, int id_stato_problematica) {
		super();
		this.oggetto_problematica = oggetto_problematica;
		this.descrizione_problematica = descrizione_problematica;
		this.problematica_percorso = problematica_percorso;
		this.id_tipo_problematica = id_tipo_problematica;
		this.id_stato_problematica = id_stato_problematica;
	}
	
	public Problematica() {
		
	}
	@Override
	public String toString() {
		return "Problematica [id=" + id + ", oggetto_problematica=" + oggetto_problematica
				+ ", descrizione_problematica=" + descrizione_problematica + ", problematica_percorso="
				+ problematica_percorso + ", id_tipo_problematica=" + id_tipo_problematica + ", id_stato_problematica="
				+ id_stato_problematica + ", tipo_problematica=" + tipo_problematica + ", stato=" + stato + "]";
	}
	
	
	
	
}
