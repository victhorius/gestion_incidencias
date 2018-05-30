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
		/*
		 * UsuarioController uc = new UsuarioController(); IncidenciaController ic = new
		 * IncidenciaController(); datosPantalla dp = new datosPantalla();
		 * 
		 * MenuController mc = new MenuController(dp); int opcion = dp.menuPrincipal();
		 * mc.ejecucionMenu(opcion);
		 */
		new InicioSesion().setVisible(true);
	}
}
