package controlador;

import modelo.Usuario;
import vista.datosPantalla;

public class MenuController {

	private datosPantalla dp;
	private UsuarioController uc = new UsuarioController();
	private IncidenciaController ic = new IncidenciaController();

	public MenuController(datosPantalla dp) {
		this.dp = dp;
	}

	public MenuController(IncidenciaController ic) {
		this.ic = ic;
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
				int opcion2 = dp.menuIncidencias();
				switch (opcion2) {
				case 1:

					break;

				default:
					break;
				}
			}
			break;

		default:
			break;
		}
	}

}
