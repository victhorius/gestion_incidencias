package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BBDD {

	public Connection conectar(Connection c) {
		String sDriver = "com.mysql.jdbc.Driver";
		String sURL = "jdbc:mysql://localhost:3306/comunidad";

		try {
			Class.forName(sDriver).newInstance();
			c = DriverManager.getConnection(sURL, "root", "");

			/*
			 * if (c != null)
			 * System.out.println("Conectado a la base de datos");
			 */

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public void registrarUsuario(Usuario u) {
		Connection con = null;
		con = conectar(con);
		PreparedStatement stmt = null;

		/*
		 * ***INSERTAMOS USUARIO***
		 */

		try {

			stmt = con.prepareStatement("insert into usuarios values (?,?,?)");
			stmt.setInt(1, 0);
			stmt.setString(2, u.getUsuario());
			stmt.setString(3, u.getContraseña());

			stmt.executeUpdate();

			/*
			 * if (filaInsertada > 0) System.out.println("fila insertada");
			 */

			con.close();
		} catch (

		SQLException e) {
			e.printStackTrace();
		}
	}

	public String consultarUsuarioContraseña(Usuario u) {
		Connection con = null;
		Statement stmt = null;
		String usuariocontraseña = "";
		String usuario = "";
		String contraseña = "";
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select usuario, password from usuarios where usuario='" + u.getUsuario()
					+ "' and password='" + u.getContraseña() + "'");
			rs.next();
			usuario = rs.getString(1);
			contraseña = rs.getString(2);
			usuariocontraseña = usuario + contraseña;
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(usuariocontraseña);
		return usuariocontraseña;
	}

}
