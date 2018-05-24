package modelo;

import java.sql.Date;

public class DatosIncidencias {
	
	private String usuario, tipo, subtipo, comentario;
	Date fecha;

	public DatosIncidencias() {

	}

	public DatosIncidencias(String usuario, String tipo, String subtipo, Date fecha, String comentario) {
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
