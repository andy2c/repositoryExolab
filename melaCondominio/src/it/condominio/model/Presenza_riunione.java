package it.condominio.model;

public class Presenza_riunione {
	
	private int id ;
	private int presenza;
	private int id_storico_utente;
	private int id_riunione;
	
	private Storico_utente storico_utente;
	private Riunione riunione;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPresenza() {
		return presenza;
	}
	public void setPresenza(int presenza) {
		this.presenza = presenza;
	}
	public int getId_storico_utente() {
		return id_storico_utente;
	}
	public void setId_storico_utente(int id_storico_utente) {
		this.id_storico_utente = id_storico_utente;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	public Storico_utente getStorico_utente() {
		if(storico_utente==null)
			storico_utente= new Storico_utente();
		return storico_utente;
	}
	public void setStorico_utente(Storico_utente storico_utente) {
		this.storico_utente = storico_utente;
	}
	public Riunione getRiunione() {
		if(riunione==null)
			riunione=new Riunione();
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public Presenza_riunione(int id, int presenza, int id_storico_utente, int id_riunione,
			Storico_utente storico_utente, Riunione riunione) {
		super();
		this.id = id;
		this.presenza = presenza;
		this.id_storico_utente = id_storico_utente;
		this.id_riunione = id_riunione;
		this.storico_utente = storico_utente;
		this.riunione = riunione;
	}
	public Presenza_riunione(int presenza, int id_storico_utente, int id_riunione) {
		super();
		this.presenza = presenza;
		this.id_storico_utente = id_storico_utente;
		this.id_riunione = id_riunione;
	}
	
	public Presenza_riunione() {
		
	}
	@Override
	public String toString() {
		return "Presenza_riunione [id=" + id + ", presenza=" + presenza + ", id_storico_utente=" + id_storico_utente
				+ ", id_riunione=" + id_riunione + ", storico_utente=" + storico_utente + ", riunione=" + riunione
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
