package vista;

import java.util.Scanner;

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

	public String menuCrearIncidencia() {
		System.out.println("CREAR INCIDENCIA");
		System.out.println("Comentario: ");
		String comentario = sc.nextLine();
		return comentario;
	}

	public String introducirUsuario() {
		System.out.println("Usuario:");
		String usuario = sc.nextLine();
		return usuario;
	}

	public String introducirPassword() {
		System.out.println("Contraseña:");
		String pw = sc.nextLine();
		return pw;
	}
}
