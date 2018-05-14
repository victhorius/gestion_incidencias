package modelo;

import java.util.Calendar;

public class IncidenciasCreadas {
	private Calendar fecha;
	private String comentario;
	private int idusuario;
	private int idincidencia;

	public IncidenciasCreadas() {
		super();
	}

	public IncidenciasCreadas(int idusuario, int idincidencia, Calendar fecha, String comentario) {
		super();
		this.idusuario = idusuario;
		this.idincidencia = idincidencia;
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdincidencia() {
		return idincidencia;
	}

	public void setIdincidencia(int idincidencia) {
		this.idincidencia = idincidencia;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "IncidenciasCreadas [fecha=" + fecha.getTime() + ", comentario=" + comentario + ", idusuario="
				+ idusuario + ", idincidencia=" + idincidencia + "]";
	}
}
