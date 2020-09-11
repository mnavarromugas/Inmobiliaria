package modelo;

public class Transaccion {

	private int id;
	private String fecha;
	private int idVendedor;
	private int tipoOperacion;
	private int tipoInmueble;
	private double monto;

	public Transaccion(String fecha, int idVendedor, int tipoOperacion, int tipoInmueble, double monto) {
		this.id = -1;
		this.fecha = fecha;
		this.idVendedor = idVendedor;
		this.tipoOperacion = tipoOperacion;
		this.tipoInmueble = tipoInmueble;
		this.monto = monto;
	}

	public Transaccion(int id, String fecha, int idVendedor, int tipoOperacion, int tipoInmueble, double monto) {
		this.id = id;
		this.fecha = fecha;
		this.idVendedor = idVendedor;
		this.tipoOperacion = tipoOperacion;
		this.tipoInmueble = tipoInmueble;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}

	public int getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public int getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(int tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Transaccion{" + "id=" + id + ", fecha=" + fecha + ", idVendedor=" + idVendedor + ", tipoOperacion=" + tipoOperacion + ", tipoInmueble=" + tipoInmueble + '}';
	}
}
