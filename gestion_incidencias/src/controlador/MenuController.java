package controlador;

import modelo.BBDD;
import modelo.Usuario;

public class MenuController {

	private datosPantalla dp;
	private UsuarioController uc = new UsuarioController();
	private IncidenciaController ic = new IncidenciaController();
	static BBDD c = new BBDD();

	public MenuController(datosPantalla dp) {
		this.dp = dp;
	}

	public MenuController(IncidenciaController ic) {
		this.ic = ic;
	}

	public void ejecucionMenu(int opcion) throws Exception {
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
				Usuario u = new Usuario(user, pw);
				u.setId(c.consultarIdUsuario(u));
				switch (opcion2) {
				case 1:
					dp.menuCrearIncidencia(ic.crearIncidencia(), u);
					c.registarIncidencia(dp.menuCrearIncidencia(ic.crearIncidencia(), u));
					break;
					
				case 2:
					dp.menuColsultarEstadoIncidencias(u);

				default:
					break;
				}
			}
		case 3:
			System.out.println("Adiós");
			System.exit(0);
			break;

		default:
			break;
		}

	}
}
