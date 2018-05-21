package modelo;

public class DatosIncidencias {
	private String usuario, tipo, subtipo, fecha, comentario;

	public DatosIncidencias() {

	}

	public DatosIncidencias(String usuario, String tipo, String subtipo, String fecha, String comentario) {
		super();
		this.usuario = usuario;
		this.tipo = tipo;
		this.subtipo = subtipo;
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSubtipo() {
		return subtipo;
	}

	public void setSubtipo(String subtipo) {
		this.subtipo = subtipo;
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
