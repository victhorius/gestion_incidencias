package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Esta clase representa la conexion y las consultas, insercion y modificaciones
 * en la base de datos.
 * 
 * @author Miguel, Víctor y Sergio
 * 
 */
public class BBDD {
	/**
	 * Comprueba la conexion a la base de datos y en caso de que sea correcta la
	 * devuelve.
	 * 
	 * @param c
	 *            - Es la conexion a comprobar.
	 * @return La conexion metida por parámetro ya evaluada.
	 */
	public Connection conectar(Connection c) {
		String sDriver = "com.mysql.jdbc.Driver";
		String sURL = "jdbc:mysql://localhost:3306/comunidad";

		try {
			Class.forName(sDriver).newInstance();
			c = DriverManager.getConnection(sURL, "root", "");

			if (c != null) {
				System.out.println("Conexion correcta");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public void registrarUsuario(Usuario u) {
		Connection con = null;
		con = conectar(con);
		PreparedStatement stmt = null;

		/**
		 * ***INSERTAMOS USUARIO***
		 */

		try {

			stmt = con.prepareStatement("insert into usuarios (usuario,password,correo,direccion) values (?,?,?,?)");
			stmt.setString(1, u.getUser());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getCorreoElectronico());
			stmt.setString(4, u.getDireccion());
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

	public Usuario consultarUsuarioContrasenia(Usuario u) {
		Connection con = null;
		Statement stmt = null;
		String usuariocontrasenia = "";
		String usuario = "";
		String contrasenia = "";
		int id;
		Usuario us = null;
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select usuario, password, id from usuarios where usuario='" + u.getUser()
					+ "' and password='" + u.getPassword() + "'");
			rs.next();
			usuario = rs.getString(1);
			contrasenia = rs.getString(2);
			id = rs.getInt(3);
			us = new Usuario(usuario, contrasenia, id);
			usuariocontrasenia = usuario + contrasenia;

			con.close();
		} catch (SQLException e) {
			e.getMessage();
		}
		return us;
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

	/*
	 * public String consultarSubtipos(String tipo) { Connection con = null;
	 * Statement stmt = null; String subtipo = ""; try {
	 * 
	 * con = conectar(con);
	 * 
	 * stmt = con.createStatement(); ResultSet rs =
	 * stmt.executeQuery("select subtipo from tipo_incidencia where tipo='" + tipo +
	 * "'"); while (rs.next()) { subtipo = rs.getString(1);
	 * System.out.println(subtipo); } con.close(); } catch (SQLException e) {
	 * e.printStackTrace(); } return tipo; }
	 */

	public ArrayList<Incidencia> consultarTipoYSubtipo() {
		Connection con = null;
		Statement stmt = null;
		String tipo, subtipo = "";
		int id;
		ArrayList<Incidencia> incidencias = new ArrayList<Incidencia>();
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tipo_incidencia");
			while (rs.next()) {
				id = rs.getInt(1);
				tipo = rs.getString(2);
				subtipo = rs.getString(3);
				Incidencia i = new Incidencia(id, tipo, subtipo);
				incidencias.add(i);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return incidencias;
	}

	public ArrayList<String> consultarTipo() {
		Connection con = null;
		Statement stmt = null;
		String tipo;
		ArrayList<String> tipos = new ArrayList<String>();
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT DISTINCT tipo FROM tipo_incidencia");
			while (rs.next()) {
				tipo = rs.getString(1);
				tipos.add(tipo);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tipos;
	}

	public ArrayList<String> consultarSubTipo(String tipo) {
		Connection con = null;
		Statement stmt = null;
		String subTipo;
		ArrayList<String> subTipos = new ArrayList<String>();
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT subtipo from tipo_incidencia where tipo = '" + tipo + "'");
			while (rs.next()) {
				subTipo = rs.getString(1);
				subTipos.add(subTipo);
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return subTipos;
	}

	public int consultarId(String subTipo) {
		Connection con = null;
		Statement stmt = null;
		int id = 0;
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id from tipo_incidencia where subtipo = '" + subTipo + "'");
			while (rs.next()) {
				id = rs.getInt(1);

			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	public void registarIncidencia(IncidenciasCreadas ic) {
		Connection con = null;
		con = conectar(con);
		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(
					"insert into incidencias (idusuario,idincidencia,comentario,fecha_registro, estado) values (?,?,?,Now(),?)");
			stmt.setInt(1, ic.getIdusuario());
			stmt.setInt(2, ic.getIdincidencia());
			stmt.setString(3, ic.getComentario());
			ic.setEstado("Abierta");
			stmt.setString(4, ic.getEstado());

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

	public ArrayList<DatosIncidencias> consultarIncidencias(int idUsuario) {
		Connection con = null;
		Statement stmt = null;
		String tipo, subtipo, comentario, estado;
		int idincidencia;
		String fecha;
		String consulta = "select idincidencia, tipo, subtipo, comentario, fecha_registro, estado "
				+ "from tipo_incidencia, incidencias where tipo_incidencia.id=incidencias.idincidencia and idusuario="
				+ idUsuario;
		ArrayList<DatosIncidencias> di = new ArrayList<DatosIncidencias>();
		try {

			con = conectar(con);

			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(consulta);
			while (rs.next()) {
				idincidencia = rs.getInt(1);
				tipo = rs.getString(2);
				subtipo = rs.getString(3);
				comentario = rs.getString(4);
				fecha = rs.getString(5);
				estado = rs.getString(6);

				di.add(new DatosIncidencias(idincidencia, tipo, subtipo, comentario, fecha, estado));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return di;
	}
}
