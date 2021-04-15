package it.condominio.model;

public class Appartamento {
	private int id;
    private String interno;
    private int id_palazzina;
    private Palazzina palazzina;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInterno() {
		return interno;
	}
	public void setInterno(String interno) {
		this.interno = interno;
	}
	public int getId_palazzina() {
		return id_palazzina;
	}
	public void setId_palazzina(int id_palazzina) {
		this.id_palazzina = id_palazzina;
	}
	public Palazzina getPalazzina() {
		return palazzina;
	}
	public void setPalazzina(Palazzina palazzina) {
		this.palazzina = palazzina;
	}
	public Appartamento(int id, String interno, int id_palazzina, Palazzina palazzina) {
		super();
		this.id = id;
		this.interno = interno;
		this.id_palazzina = id_palazzina;
		this.palazzina = palazzina;
	}
	public Appartamento(String interno, int id_palazzina) {
		super();
		this.interno = interno;
		this.id_palazzina = id_palazzina;
	}
	
	public Appartamento() {
		
	}
	@Override
	public String toString() {
		return "Appartamento [id=" + id + ", interno=" + interno + ", id_palazzina=" + id_palazzina + ", palazzina="
				+ palazzina + "]";
	}
	
	
}
