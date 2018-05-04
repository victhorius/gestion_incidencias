package vista;

import java.util.ArrayList;
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

	public void menuCrearIncidencia(ArrayList<Incidencia> i) {
		System.out.println("Selecciona tipo de incidencias");
		for (int j = 0; j <= i.size() - 1; j++) {
			System.out.println(i.get(j).getTipoIncidencia());
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
