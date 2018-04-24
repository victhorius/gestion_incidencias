package modelo;

public class Usuario {
	private String user, password;
	private int id;
	private String direccion;

	public Usuario() {

	}

	public Usuario(String usuario, String contraseña) {
		super();
		this.user = usuario;
		this.password = contraseña;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}