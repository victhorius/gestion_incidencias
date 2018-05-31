package controlador;

import java.util.ArrayList;
import modelo.BBDD;
import modelo.Incidencia;

/**
 * Ejemplo de controlador
 * 
 * @author Miguel
 *
 */
public class IncidenciaController {

	static datosPantalla dp = new datosPantalla();
	static BBDD c = new BBDD();

	public ArrayList<Incidencia> crearIncidencia() {
		return c.consultarTipoYSubtipo();
	}
}
