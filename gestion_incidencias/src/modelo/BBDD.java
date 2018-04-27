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
			stmt.setString(2, u.getUser());
			stmt.setString(3, u.getPassword());

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

	/*
	 * ***Comprobamos que sea correcto el usuario y contraseña con la bbdd***
	 */

	public String consultarUsuarioContraseña(Usuario u) {
		Connection con = null;
		Statement stmt = null;
		String usuariocontraseña = "";
		String usuario = "";
		String contraseña = "";
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select usuario, password from usuarios where usuario='" + u.getUser()
					+ "' and password='" + u.getPassword() + "'");
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

	public int consultarIdUsuario(Usuario u) {
		Connection con = null;
		Statement stmt = null;
		int id = 0;
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select id from usuarios where usuario='" + u.getUser() + "'");
			rs.next();
			id = rs.getInt(1);

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	public String consultarTiposIncidencias() {
		Connection con = null;
		Statement stmt = null;
		String tipo = "";
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select DISTINCT(tipo) from tipo_incidencia ");
			while (rs.next()) {
				tipo = rs.getString(1);
				System.out.println(tipo);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tipo;
	}

	public String consultarSubtipos(String tipo) {
		Connection con = null;
		Statement stmt = null;
		String subtipo = "";
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select subtipo from tipo_incidencia where tipo='" + tipo + "'");
			while (rs.next()) {
				subtipo = rs.getString(1);
				System.out.println(subtipo);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tipo;
	}

}
