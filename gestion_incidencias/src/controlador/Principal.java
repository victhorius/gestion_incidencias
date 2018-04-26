package controlador;

import vista.datosPantalla;

public class Principal {
	public static void main(String[] args) {
		UsuarioController uc = new UsuarioController();

		datosPantalla dp = new datosPantalla();
		MenuController mc = new MenuController(dp);
		int opcion = dp.menuPrincipal();
		mc.ejecucionMenu(opcion);

	}
}
