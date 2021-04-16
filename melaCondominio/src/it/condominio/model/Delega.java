package it.condominio.model;

import java.sql.Timestamp;

public class Delega {
	private int id;
	private String percorso_delega;
	private int id_riunione;
	private Timestamp data_creazione;
	private Riunione riunione;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPercorso_delega() {
		return percorso_delega;
	}
	public void setPercorso_delega(String percorso_delega) {
		this.percorso_delega = percorso_delega;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	public Timestamp getData_creazione() {
		return data_creazione;
	}
	public void setData_creazione(Timestamp data_creazione) {
		this.data_creazione = data_creazione;
	}
	public Riunione getRiunione() {
		if(riunione==null)
			riunione = new Riunione();
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public Delega(int id, String percorso_delega, int id_riunione, Timestamp data_creazione, Riunione riunione) {
		super();
		this.id = id;
		this.percorso_delega = percorso_delega;
		this.id_riunione = id_riunione;
		this.data_creazione = data_creazione;
		this.riunione = riunione;
	}
	public Delega(String percorso_delega, int id_riunione, Timestamp data_creazione) {
		super();
		this.percorso_delega = percorso_delega;
		this.id_riunione = id_riunione;
		this.data_creazione = data_creazione;
	}
	@Override
	public String toString() {
		return "Delega [id=" + id + ", percorso_delega=" + percorso_delega + ", id_riunione=" + id_riunione
				+ ", data_creazione=" + data_creazione + ", riunione=" + riunione + "]";
	}
	
	
	public Delega () {
		
	}
	
	
	
	
	
}
