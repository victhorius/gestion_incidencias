package controlador;

import java.util.Scanner;

import modelo.BBDD;
import modelo.Usuario;
import vista.datosPantalla;

public class UsuarioController {
	static BBDD c = new BBDD();
	static datosPantalla dp = new datosPantalla();

	public void Registrarse() {
		String usuario = dp.introducirUsuario();
		String pw = dp.introducirPassword();

		Usuario u = new Usuario(usuario, pw);
		c.registrarUsuario(u);
	}

	//
	public boolean Login(String user, String pw) {
		boolean login = false;
		Usuario u = new Usuario(user, pw);
		String usuariopw = user + pw;
		System.out.println(usuariopw);
		if (usuariopw.equals(c.consultarUsuarioContraseña(u))) {
			System.out.println("LOGIN CORRECTO");
			login = true;
		} else {
			System.out.println("LOGIN INCORRECTO");
			login = false;
		}
		return login;
	}
}
