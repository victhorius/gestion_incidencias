package controlador;

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

	public void Login() {
		String usuario = dp.introducirUsuario();
		String pw = dp.introducirPassword();
		Usuario u = new Usuario(usuario, pw);
		String usuariopw = usuario + pw;
		System.out.println(usuariopw);
		if (usuariopw.equals(c.consultarUsuarioContraseña(u))) {
			System.out.println("LOGIN CORRECTO");
		} else {
			System.out.println("LOGIN INCORRECTO");
		}
	}
}
