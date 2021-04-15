package it.condominio.model;

public class Tipo_problematica {
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
	public Tipo_problematica(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Tipo_problematica(int id) {
		super();
		this.id = id;
	}
	public Tipo_problematica() {
		
	}
	@Override
	public String toString() {
		return "Tipo_problematica [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
	
	
}
