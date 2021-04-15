package it.condominio.model;

public class Palazzina {
	private int id;
	private String nome;
	private String via;
	private String citta;
	private String regione;
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
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	public Palazzina(int id, String nome, String via, String citta, String regione) {
		super();
		this.id = id;
		this.nome = nome;
		this.via = via;
		this.citta = citta;
		this.regione = regione;
	}
	public Palazzina(String nome, String via, String citta, String regione) {
		super();
		this.nome = nome;
		this.via = via;
		this.citta = citta;
		this.regione = regione;
	}
	
	
	public Palazzina() {
		
	}
	@Override
	public String toString() {
		return "Palazzina [id=" + id + ", nome=" + nome + ", via=" + via + ", citta=" + citta + ", regione=" + regione
				+ "]";
	}
	
	
	
}
