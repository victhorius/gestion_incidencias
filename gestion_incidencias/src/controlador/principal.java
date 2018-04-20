package controlador;

import modelo.BBDD;
import modelo.Usuario;

public class principal {
	public static void main(String[] args) {
		UsuarioController uc = new UsuarioController();
		Usuario u = new Usuario();
		uc.Login();
	}
}
