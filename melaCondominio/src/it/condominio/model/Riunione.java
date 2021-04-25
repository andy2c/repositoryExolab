package it.condominio.model;

import java.time.LocalDate;
import java.util.List;

public class Riunione {
	private int id;
	private LocalDate data_riunione;
	private String nome_verbale;
	private String verbale_contenuto;
	private String verbale_percorso;
	private List<Problematica> problematiche;
	
	
	public List<Problematica> getProblematiche() {
		return problematiche;
	}
	public void setProblematiche(List<Problematica> problematiche) {
		this.problematiche = problematiche;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getData_riunione() {
		return data_riunione;
	}
	public void setData_riunione(LocalDate data_riunione) {
		this.data_riunione = data_riunione;
	}
	public String getNome_verbale() {
		return nome_verbale;
	}
	public void setNome_verbale(String nome_verbale) {
		this.nome_verbale = nome_verbale;
	}
	public String getVerbale_contenuto() {
		return verbale_contenuto;
	}
	public void setVerbale_contenuto(String verbale_contenuto) {
		this.verbale_contenuto = verbale_contenuto;
	}
	public String getVerbale_percorso() {
		return verbale_percorso;
	}
	public void setVerbale_percorso(String verbale_percorso) {
		this.verbale_percorso = verbale_percorso;
	}
	public Riunione(int id, LocalDate data_riunione, String nome_verbale, String verbale_contenuto,
			String verbale_percorso) {
		super();
		this.id = id;
		this.data_riunione = data_riunione;
		this.nome_verbale = nome_verbale;
		this.verbale_contenuto = verbale_contenuto;
		this.verbale_percorso = verbale_percorso;
	}
	public Riunione(LocalDate data_riunione, String nome_verbale, String verbale_contenuto, String verbale_percorso) {
		super();
		this.data_riunione = data_riunione;
		this.nome_verbale = nome_verbale;
		this.verbale_contenuto = verbale_contenuto;
		this.verbale_percorso = verbale_percorso;
	}
	
	public Riunione() {
		
	}
	@Override
	public String toString() {
		return "Riunione [id=" + id + ", data_riunione=" + data_riunione + ", nome_verbale=" + nome_verbale
				+ ", verbale_contenuto=" + verbale_contenuto + ", verbale_percorso=" + verbale_percorso
				+ ", problematiche=" + problematiche + "]";
	}
	
	
	
	
	
	
	
}
