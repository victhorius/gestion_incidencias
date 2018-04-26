package controlador;

import vista.datosPantalla;

public class Principal {
	public static void main(String[] args) {
		datosPantalla dp = new datosPantalla();
		MenuController mc = new MenuController();
		int opcion = dp.menuPrincipal();
		mc.ejecucionMenu(opcion);
	}
}
