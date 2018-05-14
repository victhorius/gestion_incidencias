package controlador;

import vista.InicioSesion;

public class Principal {
	public static void main(String[] args) {
		UsuarioController uc = new UsuarioController();
		IncidenciaController ic = new IncidenciaController();
		datosPantalla dp = new datosPantalla();
		// InicioSesion log = new InicioSesion();
		// log.setVisible(true);
		MenuController mc = new MenuController(dp);
		int opcion = dp.menuPrincipal();
		mc.ejecucionMenu(opcion);

	}
}
