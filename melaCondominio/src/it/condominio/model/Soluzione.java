package it.condominio.model;

public class Soluzione {
	private int id;
	private String nome;
	private String descrizione;
	private int id_stato;
	private int id_problematica;
	private int id_preventivo;
	
	private Stato stato;
	private Problematica problematica;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getId_stato() {
		return id_stato;
	}
	public void setId_stato(int id_stato) {
		this.id_stato = id_stato;
	}
	public int getId_problematica() {
		return id_problematica;
	}
	public void setId_problematica(int id_problematica) {
		this.id_problematica = id_problematica;
	}
	public int getId_preventivo() {
		return id_preventivo;
	}
	public void setId_preventivo(int id_preventivo) {
		this.id_preventivo = id_preventivo;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public Problematica getProblematica() {
		return problematica;
	}
	public void setProblematica(Problematica problematica) {
		this.problematica = problematica;
	}
	public Soluzione(int id, String nome, String descrizione, int id_stato, int id_problematica, int id_preventivo,
			Stato stato, Problematica problematica) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.id_stato = id_stato;
		this.id_problematica = id_problematica;
		this.id_preventivo = id_preventivo;
		this.stato = stato;
		this.problematica = problematica;
	}
	public Soluzione(String nome, String descrizione, int id_stato, int id_problematica, int id_preventivo) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.id_stato = id_stato;
		this.id_problematica = id_problematica;
		this.id_preventivo = id_preventivo;
	}
	
	public Soluzione() {
		
	}
	@Override
	public String toString() {
		return "Soluzione [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", id_stato=" + id_stato
				+ ", id_problematica=" + id_problematica + ", id_preventivo=" + id_preventivo + ", stato=" + stato
				+ ", problematica=" + problematica + "]";
	}
	
	
	
	
	
	
	
	
}
