package controlador;

import modelo.Usuario;
import vista.datosPantalla;

public class MenuController {

	private datosPantalla dp;
	private UsuarioController uc = new UsuarioController();

	public MenuController(datosPantalla dp) {
		this.dp = dp;
	}

	public void ejecucionMenu(int opcion) {
		switch (opcion) {
		case 1:
			uc.Registrarse();
			break;

		case 2:
			String user = dp.introducirUsuario();
			String pw = dp.introducirPassword();
			uc.Login(user, pw);
			if (uc.Login(user, pw) == true) {
				dp.menuIncidencias();
			}
			break;

		default:
			break;
		}
	}

}
