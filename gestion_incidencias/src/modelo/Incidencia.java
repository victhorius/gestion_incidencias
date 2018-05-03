package modelo;

public class Incidencia {
	private int id;
	private String tipo, subtipo, comentario;

	public Incidencia() {

	}

	public Incidencia(int id, String tipo, String subtipo, String comentario) {
		super();
		this.tipo = tipo;
		this.subtipo = subtipo;
		this.comentario = comentario;
	}

	public String getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
	}

	public int getIdIncidencia() {
		return id;
	}

	public void setIdIncidencia(int id) {
		this.id = id;
	}

	public String getTipoIncidencia() {
		return tipo;
	}

	public void setTipoIncidencia(String tipo) {
		this.tipo = tipo;
	}

}
