package vista;

import java.util.Scanner;

import modelo.Usuario;

public class datosPantalla {
	static Scanner sc = new Scanner(System.in);

	public datosPantalla() {

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
