package it.condominio.model;

public class Voto {
	private int id;
	private int voto;
	private int id_presenza_riunione;
	private int id_soluzione;
	
	private Presenza_riunione presenza_riunione;
	private Soluzione soluzione;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	public int getId_presenza_riunione() {
		return id_presenza_riunione;
	}
	public void setId_presenza_riunione(int id_presenza_riunione) {
		this.id_presenza_riunione = id_presenza_riunione;
	}
	public int getId_soluzione() {
		return id_soluzione;
	}
	public void setId_soluzione(int id_soluzione) {
		this.id_soluzione = id_soluzione;
	}
	public Presenza_riunione getPresenza_riunione() {
		return presenza_riunione;
	}
	public void setPresenza_riunione(Presenza_riunione presenza_riunione) {
		this.presenza_riunione = presenza_riunione;
	}
	public Soluzione getSoluzione() {
		return soluzione;
	}
	public void setSoluzione(Soluzione soluzione) {
		this.soluzione = soluzione;
	}
	public Voto(int id, int voto, int id_presenza_riunione, int id_soluzione, Presenza_riunione presenza_riunione,
			Soluzione soluzione) {
		super();
		this.id = id;
		this.voto = voto;
		this.id_presenza_riunione = id_presenza_riunione;
		this.id_soluzione = id_soluzione;
		this.presenza_riunione = presenza_riunione;
		this.soluzione = soluzione;
	}
	public Voto(int voto, int id_presenza_riunione, int id_soluzione) {
		super();
		this.voto = voto;
		this.id_presenza_riunione = id_presenza_riunione;
		this.id_soluzione = id_soluzione;
	}
	public Voto() {
		
	}
	@Override
	public String toString() {
		return "Voto [id=" + id + ", voto=" + voto + ", id_presenza_riunione=" + id_presenza_riunione
				+ ", id_soluzione=" + id_soluzione + ", presenza_riunione=" + presenza_riunione + ", soluzione="
				+ soluzione + "]";
	}
	
	
	
}
