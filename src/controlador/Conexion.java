package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Transaccion;

public class Conexion {

	private String CONN = "jdbc:sqlserver://LAPTOP-0CRE86U4\\SQLEXPRESS:1433;databaseName=Inmobiliaria";
	private String USER = "sa";
	private String PASS = "123456";

	public ArrayList<Transaccion> obtenerTodasLasTransacciones() {
		ArrayList<Transaccion> resultado = new ArrayList<>();

		try {
			Connection conn = DriverManager.getConnection(CONN, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Transacciones");

			while (rs.next()) {
				int id = rs.getInt(1);
				String fecha = rs.getString(2);
				int idVendedor = rs.getInt(3);
				int tipoOperacion = rs.getInt(4);
				int tipoInmueble = rs.getInt(5);
				double monto = rs.getDouble(6);

				Transaccion t = new Transaccion(id, fecha, idVendedor, tipoOperacion, tipoInmueble, monto);

				resultado.add(t);
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return resultado;
	}

	public void agregarTransaccion(Transaccion t) {
		try {
			Connection conn = DriverManager.getConnection(CONN, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Transaccion VALUES (?,?,?,?,?)");
			pstmt.setString(1, t.getFecha());
			pstmt.setInt(2, t.getIdVendedor());
			pstmt.setInt(3, t.getTipoOperacion());
			pstmt.setInt(4, t.getTipoInmueble());
			pstmt.setDouble(5, t.getMonto());

			pstmt.executeUpdate();
			pstmt.close();
			conn.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	
}
