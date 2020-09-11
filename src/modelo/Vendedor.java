package modelo;

public class Vendedor {
	private int id;
	private String nombreCompleto;

	public Vendedor(int id, String nombreCompleto) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return nombreCompleto;
	}
	
}
