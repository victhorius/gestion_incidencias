package controlador;

import java.util.ArrayList;
import java.util.Arrays;

import modelo.BBDD;
import modelo.Incidencia;
import vista.datosPantalla;

public class IncidenciaController {

	static datosPantalla dp = new datosPantalla();
	static BBDD c = new BBDD();

	public ArrayList<Incidencia> crearIncidencia() {
		return c.consultarTipoYSubtipo();
	}
}
