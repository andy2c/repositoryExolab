package it.condominio.model;

import java.util.Date;

public class Storico_utente {
	private int id;
	private Date data_inizio;
	private Date data_fine;
	private int id_utente;
	private int id_ruolo;
	private int id_appartamento;
	private int id_stato;
	
	private Utente utente;
	private Ruolo ruolo;
	private Appartamento appartamento;
	private Stato stato;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData_inizio() {
		return data_inizio;
	}
	public void setData_inizio(Date data_inizio) {
		this.data_inizio = data_inizio;
	}
	public Date getData_fine() {
		return data_fine;
	}
	public void setData_fine(Date data_fine) {
		this.data_fine = data_fine;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}
	public int getId_ruolo() {
		return id_ruolo;
	}
	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}
	public int getId_appartamento() {
		return id_appartamento;
	}
	public void setId_appartamento(int id_appartamento) {
		this.id_appartamento = id_appartamento;
	}
	public int getId_stato() {
		return id_stato;
	}
	public void setId_stato(int id_stato) {
		this.id_stato = id_stato;
	}
	public Utente getUtente() {
		if(utente==null)
			utente=new Utente();
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Ruolo getRuolo() {
		if(ruolo==null)
			ruolo= new Ruolo();
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}
	public Appartamento getAppartamento() {
		if(appartamento==null)
			appartamento= new Appartamento();
		return appartamento;
	}
	public void setAppartamento(Appartamento appartamento) {
		this.appartamento = appartamento;
	}
	public Stato getStato() {
		if(stato==null)
			stato= new Stato();
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public Storico_utente(int id, Date data_inizio, Date data_fine, int id_utente, int id_ruolo, int id_appartamento,
			int id_stato, Utente utente, Ruolo ruolo, Appartamento appartamento, Stato stato) {
		super();
		this.id = id;
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.id_utente = id_utente;
		this.id_ruolo = id_ruolo;
		this.id_appartamento = id_appartamento;
		this.id_stato = id_stato;
		this.utente = utente;
		this.ruolo = ruolo;
		this.appartamento = appartamento;
		this.stato = stato;
	}
	public Storico_utente(Date data_inizio, Date data_fine, int id_utente, int id_ruolo, int id_appartamento,
			int id_stato) {
		super();
		this.data_inizio = data_inizio;
		this.data_fine = data_fine;
		this.id_utente = id_utente;
		this.id_ruolo = id_ruolo;
		this.id_appartamento = id_appartamento;
		this.id_stato = id_stato;
	}
	public Storico_utente() {
		
	}
	
	@Override
	public String toString() {
		return "Storico_utente [id=" + id + ", data_inizio=" + data_inizio + ", data_fine=" + data_fine + ", id_utente="
				+ id_utente + ", id_ruolo=" + id_ruolo + ", id_appartamento=" + id_appartamento + ", id_stato="
				+ id_stato + ", utente=" + utente + ", ruolo=" + ruolo + ", appartamento=" + appartamento + ", stato="
				+ stato + "]";
	}
	
	
	
	
	
	
	
	
	
}
