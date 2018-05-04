package vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import modelo.Incidencia;
import modelo.Usuario;

public class datosPantalla {
	static Scanner sc = new Scanner(System.in);

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

	public void menuCrearIncidencia(ArrayList<Incidencia> i) {
		int cont = 1;
		String tipoaux;
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

		int opcion = sc.nextInt();
		tipoaux = tiposA.get(opcion - 1);

		for (int j = 0; j < i.size(); j++) {
			if (i.get(j).getTipoIncidencia().equals(tipoaux)) {
				subTiposA.add(i.get(j).getSubtipo());
			}
		}

		System.out.println("Selecciona un subtipo");

		for (int j = 0; j < subTiposA.size(); j++) {
			System.out.println((j + 1) + " - " + subTiposA.get(j));
		}
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
