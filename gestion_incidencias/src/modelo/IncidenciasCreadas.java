package modelo;

public class IncidenciasCreadas {

	private String fecha, comentario;

	public IncidenciasCreadas(String fecha, String comentario) {
		super();
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
