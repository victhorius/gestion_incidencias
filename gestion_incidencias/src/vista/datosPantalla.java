package vista;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Incidencia;
import modelo.IncidenciasCreadas;
import modelo.Usuario;

/**
 * Recoje los datos y genera los menús correspondientes.
 * 
 * @author Miguel, Víctor y Sergio
 * 
 */
public class datosPantalla {
	Scanner sc = new Scanner(System.in);

	public datosPantalla() {

	}

	/**
	 * Muestra el menú principal. La opcion 1 nos manda a la pantalla de registro de
	 * usuarios. La opcion 2 nos lleva a la pantalla de login. La opcion 3 sale del
	 * programa.
	 * 
	 * @return La opcion elegida.
	 */
	public int menuPrincipal() {
		System.out.println("MENU");
		System.out.println("1 - Registrarse");
		System.out.println("2 - Login");
		System.out.println("3 - Salir");
		int opcion = sc.nextInt();
		return opcion;
	}

	/**
	 * Muestra el menú secundario. La opcion 1 nos manda a la pantalla de registro
	 * de incidencias. La opcion 2 nos permite consultar una pantalla con el estado
	 * de las incidencias creadas. La opcion 3 nos lleva a la pantalla de
	 * modificación del perfil.
	 * 
	 * @return La opcion elegida.
	 */
	public int menuIncidencias() {
		System.out.println("MENU INCIDENCIAS");
		System.out.println("1 - Crear Incidencia");
		System.out.println("2 - Consultar Estado de las incidencias");
		System.out.println("3 - Editar Perfil");
		int opcion = sc.nextInt();
		return opcion;

	}

	/**
	 * Genera un comentario para la incidencia.
	 * 
	 * @return El comentario generado por el usuario.
	 */
	public String introducirComentario() {
		System.out.println("Introduce comentario: ");
		String comentario = sc.next();
		return comentario;
	}

	/**
	 * Pide un nombre de usuario para comprobarlo en el login.
	 * 
	 * @return El nombre de usuario para el Login.
	 */
	public String introducirUsuario() {
		System.out.println("Usuario:");
		String usuario = sc.next();
		return usuario;
	}

	/**
	 * Pide la contraseña del usuario para comprobarla en el login.
	 * 
	 * @return La contraseña del usuario para el Login.
	 */
	public String introducirPassword() {
		System.out.println("Contraseña:");
		String pw = sc.next();
		return pw;
	}

	/**
	 * Muestra por pantalla Menús de los tipos y subtipos de incidencias.
	 * 
	 * @param i
	 *            -Es un ArrayList con las incidencias predefinidas anteriormente.
	 * @param u
	 *            -Es el usuario que crea la incidencia.
	 */

	public void menuCrearIncidencia(ArrayList<Incidencia> i, Usuario u) {

		System.out.println("Selecciona tipo de incidencias a crear");

		HashSet<String> tipos = new HashSet<String>();
		for (int j = 0; j < i.size(); j++) {
			tipos.add(i.get(j).getTipoIncidencia());

		}

		String tipoaux, subtipoaux;

		ArrayList<String> tiposA = new ArrayList<String>();
		ArrayList<String> subTiposA = new ArrayList<String>();

		for (Iterator<String> iterator = tipos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			tiposA.add(string);
		}

		for (int j = 0; j < tiposA.size(); j++) {
			System.out.println((j + 1) + " - " + tiposA.get(j));
		}

		int opciontipo = sc.nextInt();
		tipoaux = tiposA.get(opciontipo - 1);

		for (int j = 0; j < i.size(); j++) {
			if (i.get(j).getTipoIncidencia().equals(tipoaux)) {
				subTiposA.add(i.get(j).getSubtipo());
			}
		}

		System.out.println("Selecciona un subtipo");

		for (int j = 0; j < subTiposA.size(); j++) {
			System.out.println((j + 1) + " - " + subTiposA.get(j));
		}

		int opcionsubtipo = sc.nextInt();
		subtipoaux = subTiposA.get(opcionsubtipo - 1);

		int idincidencia = 0;

		for (int j = 0; j < i.size(); j++) {

			if (i.get(j).getTipoIncidencia().equals(tipoaux) && i.get(j).getSubtipo().equals(subtipoaux)) {
				idincidencia = i.get(j).getIdIncidencia();
			}
		}

		String comentario = introducirComentario();

		IncidenciasCreadas incidencia = new IncidenciasCreadas();

		incidencia.setComentario(comentario);
		incidencia.setFecha(Calendar.getInstance());
		incidencia.setIdincidencia(idincidencia);
		incidencia.setIdusuario(u.getId());
		System.out.println(incidencia.toString());
	}

}
