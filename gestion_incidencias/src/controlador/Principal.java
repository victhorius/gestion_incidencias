package controlador;

import vista.InicioSesion;

public class Principal {

	static int idUsuario;

	public static int getIdUsuario() {
		return idUsuario;
	}

	public static void setIdUsuario(int idUsuario) {
		Principal.idUsuario = idUsuario;
	}

	public static void main(String[] args) {
		new InicioSesion().setVisible(true);
	}
}
