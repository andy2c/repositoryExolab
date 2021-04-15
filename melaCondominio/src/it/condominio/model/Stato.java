package it.condominio.model;

public class Stato {
	private int id;
	private String nome;
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
	public Stato(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Stato(String nome) {
		super();
		this.nome = nome;
	}
	
	public Stato() {
		
	}
	@Override
	public String toString() {
		return "Stato [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
	
}
