package it.condominio.model;

public class Utente {
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int cambia_password;
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCambia_password() {
		return cambia_password;
	}
	public void setCambia_password(int cambia_password) {
		this.cambia_password = cambia_password;
	}
	public Utente(int id, String nome, String cognome, String email, String password, int cambia_password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.cambia_password = cambia_password;
	}
	public Utente(String nome, String cognome, String email, String password, int cambia_password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.cambia_password = cambia_password;
	}
	
	public Utente() {
		
	}
	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password="
				+ password + ", cambia_password=" + cambia_password + "]";
	}
	public Utente(String nome, String cognome, String email, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}
	public Utente(int id, String nome, String cognome, String email, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}
	
	/*
	 * 
	 * commento
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
