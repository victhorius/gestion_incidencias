package modelo;

public class IncidenciasCreadas {
	private Incidencia i;
	private Usuario u;
	private String fecha, comentario;

	public IncidenciasCreadas(Incidencia i, Usuario u, String fecha, String comentario) {
		super();
		this.i = i;
		this.u = u;
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public Incidencia getI() {
		return i;
	}

	public void setI(Incidencia i) {
		this.i = i;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
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
