package modelo;

public class DatosIncidencias {

	private String estado, tipo, subtipo, comentario;
	String fecha;
	int idincidencia;

	public DatosIncidencias() {

	}

	public DatosIncidencias(int idincidencia, String tipo, String subtipo, String comentario, String fecha,
			String estado) {
		super();
		this.idincidencia = idincidencia;
		this.estado = estado;
		this.tipo = tipo;
		this.subtipo = subtipo;
		this.comentario = comentario;
		this.fecha = fecha;

	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getIdincidencia() {
		return idincidencia;
	}

	public void setIdincidencia(int idincidencia) {
		this.idincidencia = idincidencia;
	}

}