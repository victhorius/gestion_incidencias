package vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import modelo.BBDD;
import modelo.Incidencia;
import modelo.IncidenciasCreadas;
import modelo.Usuario;

public class datosPantalla {
	static Scanner sc = new Scanner(System.in);
	static BBDD c = new BBDD();

	public datosPantalla() {

	}

	public int menuPrincipal() {
		System.out.println("MENU");
		System.out.println("1 - Registrarse");
		System.out.println("2 - Login");
		System.out.println("3 - Salir");
		int opcion = sc.nextInt();
		return opcion;
	}

	public int menuIncidencias() {
		System.out.println("MENU INCIDENCIAS");
		System.out.println("1 - Crear Incidencia");
		System.out.println("2 - Consultar Estado de las incidencias");
		System.out.println("3 - Editar Perfil");
		int opcion = sc.nextInt();
		return opcion;

	}

	/*
	 * Muestra por pantalla tipos y subtipos de incidencia y recoge la opcion
	 * que selecciona el usuario, devolverá la incidencia creada
	 */

	public void menuCrearIncidencia(ArrayList<Incidencia> i, Usuario u) {
		int cont = 1;
		String tipoaux;
		String subtipoaux;
		System.out.println("Selecciona tipo de incidencias");
		HashSet<String> tipos = new HashSet<String>();
		ArrayList<String> tiposA = new ArrayList<String>();
		ArrayList<String> subTiposA = new ArrayList<String>();

		for (int j = 0; j < i.size(); j++) {
			tipos.add(i.get(j).getTipoIncidencia());

		}

		for (Iterator iterator = tipos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			tiposA.add(string);
			cont++;
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
		incidencia.setFecha("SYSDATE");
		incidencia.setIdincidencia(idincidencia);
		incidencia.setIdusuario(u.getId());
	}

	public String introducirComentario() {
		System.out.println("CREAR INCIDENCIA");
		System.out.println("Comentario: ");
		String comentario = sc.next();
		return comentario;
	}

	public String introducirUsuario() {
		System.out.println("Usuario:");
		String usuario = sc.next();
		return usuario;
	}

	public String introducirPassword() {
		System.out.println("Contraseña:");
		String pw = sc.next();
		return pw;
	}

}
