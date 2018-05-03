package controlador;

import modelo.BBDD;
import modelo.Incidencia;
import vista.datosPantalla;

public class IncidenciaController {

	static datosPantalla dp = new datosPantalla();
	static BBDD c = new BBDD();

	public void incidencia() {

		String tipo = c.consultarTiposIncidencias();
		c.consultarSubtipos(tipo);
	}
}
