package controlador;

import vista.datosPantalla;

public class MenuController {
	static datosPantalla dp = new datosPantalla();
	static UsuarioController uc = new UsuarioController();

	public void ejecucionMenu(int opcion) {
		switch (opcion) {
		case 1:
			uc.Registrarse();
			break;

		case 2:
			uc.Login();
			break;

		default:
			break;
		}
	}

}
