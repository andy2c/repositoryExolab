package it.condominio.model;

public class Filtro_riunione {
	
	private int id;
	private int id_riunione;
	private int id_problematica;
	
	private Riunione riunione ;
	private Problematica problematica;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_riunione() {
		return id_riunione;
	}
	public void setId_riunione(int id_riunione) {
		this.id_riunione = id_riunione;
	}
	public int getId_problematica() {
		return id_problematica;
	}
	public void setId_problematica(int id_problematica) {
		this.id_problematica = id_problematica;
	}
	public Riunione getRiunione() {
		if(riunione==null)
			riunione=new Riunione();
		return riunione;
	}
	public void setRiunione(Riunione riunione) {
		this.riunione = riunione;
	}
	public Problematica getProblematica() {
		if(problematica==null)
			problematica=new Problematica();
		return problematica;
	}
	public void setProblematica(Problematica problematica) {
		this.problematica = problematica;
	}
	public Filtro_riunione(int id, int id_riunione, int id_problematica, Riunione riunione, Problematica problematica) {
		super();
		this.id = id;
		this.id_riunione = id_riunione;
		this.id_problematica = id_problematica;
		this.riunione = riunione;
		this.problematica = problematica;
	}
	public Filtro_riunione(int id, int id_riunione, int id_problematica) {
		super();
		this.id = id;
		this.id_riunione = id_riunione;
		this.id_problematica = id_problematica;
	}
	public Filtro_riunione(int id_riunione, int id_problematica) {
		super();
		this.id_riunione = id_riunione;
		this.id_problematica = id_problematica;
	}
	
	public Filtro_riunione() {
		
	}
	@Override
	public String toString() {
		return "Filtro_riunione [id=" + id + ", id_riunione=" + id_riunione + ", id_problematica=" + id_problematica
				+ ", riunione=" + riunione + ", problematica=" + problematica + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
