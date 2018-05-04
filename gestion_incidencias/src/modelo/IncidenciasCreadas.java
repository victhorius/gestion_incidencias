package modelo;

public class IncidenciasCreadas {

	private String fecha, comentario;
	private int idusuario, idincidencia;

	public IncidenciasCreadas() {
		super();
	}

	public IncidenciasCreadas(int idusuario, int idincidencia, String fecha, String comentario) {
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
