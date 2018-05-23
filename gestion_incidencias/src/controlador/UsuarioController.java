package controlador;

import modelo.BBDD;
import modelo.Usuario;

public class UsuarioController {
	BBDD c;
	datosPantalla dp;

	public UsuarioController() {
		c = new BBDD();
		dp = new datosPantalla();
	}

	public void Registrarse() {
		String usuario = dp.introducirUsuario();
		String pw = dp.introducirPassword();
		String correo = dp.introducirCorreo();
		String direccion = dp.introducirDireccion();

		Usuario u = new Usuario(usuario, pw, correo, direccion);
		c.registrarUsuario(u);
	}

	public boolean Login(String user, String pw) throws Exception {
		boolean login = false;
		Usuario u = new Usuario(user, pw);
		String usuariopw = user + pw;
		if (usuariopw.equals(c.consultarUsuarioContrasenia(u))) {
			System.out.println("LOGIN CORRECTO");
			login = true;
		} else {
			System.out.println("LOGIN INCORRECTO");
			login = false;
			throw new Exception("Usuario/contraseña incorrectos");

		}
		return login;
	}

}
