package modelo;

public class Usuario {
	private String user, password;
	private int id;
	private String direccion, correoElectronico;

	public Usuario() {

	}

	public Usuario(String usuario, String contrasenia) {
		super();
		this.user = usuario;
		this.password = contrasenia;
	}

	public Usuario(String usuario, String contrasenia, String correoElectronico, String direccion) {
		super();
		this.user = usuario;
		this.password = contrasenia;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}