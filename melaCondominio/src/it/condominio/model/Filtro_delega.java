package it.condominio.model;

public class Filtro_delega {
	
	private int id;
	private int id_storico_utente;
	private int id_delega;
	private int id_ruoli_delega;
	
	private Storico_utente storico_utente;
	private Delega delega;
	private Ruoli_delega ruoli_delega;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_storico_utente() {
		return id_storico_utente;
	}
	public void setId_storico_utente(int id_storico_utente) {
		this.id_storico_utente = id_storico_utente;
	}
	public int getId_delega() {
		return id_delega;
	}
	public void setId_delega(int id_delega) {
		this.id_delega = id_delega;
	}
	public int getId_ruoli_delega() {
		return id_ruoli_delega;
	}
	public void setId_ruoli_delega(int id_ruoli_delega) {
		this.id_ruoli_delega = id_ruoli_delega;
	}
	public Storico_utente getStorico_utente() {
		return storico_utente;
	}
	public void setStorico_utente(Storico_utente storico_utente) {
		this.storico_utente = storico_utente;
	}
	public Delega getDelega() {
		return delega;
	}
	public void setDelega(Delega delega) {
		this.delega = delega;
	}
	public Ruoli_delega getRuoli_delega() {
		return ruoli_delega;
	}
	public void setRuoli_delega(Ruoli_delega ruoli_delega) {
		this.ruoli_delega = ruoli_delega;
	}
	public Filtro_delega(int id, int id_storico_utente, int id_delega, int id_ruoli_delega,
			Storico_utente storico_utente, Delega delega, Ruoli_delega ruoli_delega) {
		super();
		this.id = id;
		this.id_storico_utente = id_storico_utente;
		this.id_delega = id_delega;
		this.id_ruoli_delega = id_ruoli_delega;
		this.storico_utente = storico_utente;
		this.delega = delega;
		this.ruoli_delega = ruoli_delega;
	}
	public Filtro_delega(int id, int id_storico_utente, int id_delega, int id_ruoli_delega) {
		super();
		this.id = id;
		this.id_storico_utente = id_storico_utente;
		this.id_delega = id_delega;
		this.id_ruoli_delega = id_ruoli_delega;
	}
	public Filtro_delega(int id_storico_utente, int id_delega, int id_ruoli_delega) {
		super();
		this.id_storico_utente = id_storico_utente;
		this.id_delega = id_delega;
		this.id_ruoli_delega = id_ruoli_delega;
	}
	
	public Filtro_delega() {
		
	}
	@Override
	public String toString() {
		return "Filtro_delega [id=" + id + ", id_storico_utente=" + id_storico_utente + ", id_delega=" + id_delega
				+ ", id_ruoli_delega=" + id_ruoli_delega + ", storico_utente=" + storico_utente + ", delega=" + delega
				+ ", ruoli_delega=" + ruoli_delega + "]";
	}
	
	
	
	
	
	
	
}
