package modelo;

public class DtoTransaccion {
	public String fecha;
	public String nombreVendedor;
	public String tipoOperacion;
	public String tipoInmueble;
	public Double monto;

	public DtoTransaccion(String fecha, String nombreVendedor, String tipoOperacion, String tipoInmueble, Double monto) {
		this.fecha = fecha;
		this.nombreVendedor = nombreVendedor;
		this.tipoOperacion = tipoOperacion;
		this.tipoInmueble = tipoInmueble;
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public String getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "DtoTransaccion{" + "fecha=" + fecha + ", nombreVendedor=" + nombreVendedor + ", tipoOperacion=" + tipoOperacion + ", tipoInmueble=" + tipoInmueble + ", monto=" + monto + '}';
	}


	
	
}
