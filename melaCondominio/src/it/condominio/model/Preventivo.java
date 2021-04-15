package it.condominio.model;

import java.sql.Timestamp;
import java.util.Date;

public class Preventivo {
	private int id;
	private Timestamp data_creazione;
	private String ditta_nome;
	private String ditta_telefono;
	private String ditta_email;
	private String ditta_via;
	private String ditta_referente;
	private String preventivo_percorso;
	private double preventivo_prezzo;
	private int preventivo_durata_lavori;
	private Date preventivo_inizio_lavori;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getData_creazione() {
		return data_creazione;
	}
	public void setData_creazione(Timestamp data_creazione) {
		this.data_creazione = data_creazione;
	}
	public String getDitta_nome() {
		return ditta_nome;
	}
	public void setDitta_nome(String ditta_nome) {
		this.ditta_nome = ditta_nome;
	}
	public String getDitta_telefono() {
		return ditta_telefono;
	}
	public void setDitta_telefono(String ditta_telefono) {
		this.ditta_telefono = ditta_telefono;
	}
	public String getDitta_email() {
		return ditta_email;
	}
	public void setDitta_email(String ditta_email) {
		this.ditta_email = ditta_email;
	}
	public String getDitta_via() {
		return ditta_via;
	}
	public void setDitta_via(String ditta_via) {
		this.ditta_via = ditta_via;
	}
	public String getDitta_referente() {
		return ditta_referente;
	}
	public void setDitta_referente(String ditta_referente) {
		this.ditta_referente = ditta_referente;
	}
	public String getPreventivo_percorso() {
		return preventivo_percorso;
	}
	public void setPreventivo_percorso(String preventivo_percorso) {
		this.preventivo_percorso = preventivo_percorso;
	}
	public double getPreventivo_prezzo() {
		return preventivo_prezzo;
	}
	public void setPreventivo_prezzo(double preventivo_prezzo) {
		this.preventivo_prezzo = preventivo_prezzo;
	}
	public int getPreventivo_durata_lavori() {
		return preventivo_durata_lavori;
	}
	public void setPreventivo_durata_lavori(int preventivo_durata_lavori) {
		this.preventivo_durata_lavori = preventivo_durata_lavori;
	}
	public Date getPreventivo_inizio_lavori() {
		return preventivo_inizio_lavori;
	}
	public void setPreventivo_inizio_lavori(Date preventivo_inizio_lavori) {
		this.preventivo_inizio_lavori = preventivo_inizio_lavori;
	}
	public Preventivo(int id, Timestamp data_creazione, String ditta_nome, String ditta_telefono, String ditta_email,
			String ditta_via, String ditta_referente, String preventivo_percorso, double preventivo_prezzo,
			int preventivo_durata_lavori, Date preventivo_inizio_lavori) {
		super();
		this.id = id;
		this.data_creazione = data_creazione;
		this.ditta_nome = ditta_nome;
		this.ditta_telefono = ditta_telefono;
		this.ditta_email = ditta_email;
		this.ditta_via = ditta_via;
		this.ditta_referente = ditta_referente;
		this.preventivo_percorso = preventivo_percorso;
		this.preventivo_prezzo = preventivo_prezzo;
		this.preventivo_durata_lavori = preventivo_durata_lavori;
		this.preventivo_inizio_lavori = preventivo_inizio_lavori;
	}
	public Preventivo(Timestamp data_creazione, String ditta_nome, String ditta_telefono, String ditta_email,
			String ditta_via, String ditta_referente, String preventivo_percorso, double preventivo_prezzo,
			int preventivo_durata_lavori, Date preventivo_inizio_lavori) {
		super();
		this.data_creazione = data_creazione;
		this.ditta_nome = ditta_nome;
		this.ditta_telefono = ditta_telefono;
		this.ditta_email = ditta_email;
		this.ditta_via = ditta_via;
		this.ditta_referente = ditta_referente;
		this.preventivo_percorso = preventivo_percorso;
		this.preventivo_prezzo = preventivo_prezzo;
		this.preventivo_durata_lavori = preventivo_durata_lavori;
		this.preventivo_inizio_lavori = preventivo_inizio_lavori;
	}
	
	public Preventivo() {
		
	}
	@Override
	public String toString() {
		return "Preventivo [id=" + id + ", data_creazione=" + data_creazione + ", ditta_nome=" + ditta_nome
				+ ", ditta_telefono=" + ditta_telefono + ", ditta_email=" + ditta_email + ", ditta_via=" + ditta_via
				+ ", ditta_referente=" + ditta_referente + ", preventivo_percorso=" + preventivo_percorso
				+ ", preventivo_prezzo=" + preventivo_prezzo + ", preventivo_durata_lavori=" + preventivo_durata_lavori
				+ ", preventivo_inizio_lavori=" + preventivo_inizio_lavori + "]";
	}
	
	
	
	
	
	
}
