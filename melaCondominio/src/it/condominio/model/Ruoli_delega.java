package it.condominio.model;

public class Ruoli_delega {
	private int id;
	private String nome;
	public Ruoli_delega(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Ruoli_delega() {
		
	}
	public Ruoli_delega(String nome) {
		super();
		this.nome = nome;
	}
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
	@Override
	public String toString() {
		return "Ruoli_delega [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
