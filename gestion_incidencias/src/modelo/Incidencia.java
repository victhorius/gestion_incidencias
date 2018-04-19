package modelo;

public class Incidencia {
	private int idIncidencia;
	private String tipoIncidencia;

	public Incidencia(int idIncidencia, String tipoIncidencia) {
		super();
		this.idIncidencia = idIncidencia;
		this.tipoIncidencia = tipoIncidencia;
	}

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public String getTipoIncidencia() {
		return tipoIncidencia;
	}

	public void setTipoIncidencia(String tipoIncidencia) {
		this.tipoIncidencia = tipoIncidencia;
	}

}
