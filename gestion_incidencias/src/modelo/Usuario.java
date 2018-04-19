package modelo;

public class Usuario {
	private String nombre, contraseña, email;
	private int portal, piso;
	private char letra;

	public Usuario(String nombre, String contraseña, String email, int portal, int piso, char letra) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
		this.portal = portal;
		this.piso = piso;
		this.letra = letra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPortal() {
		return portal;
	}

	public void setPortal(int portal) {
		this.portal = portal;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

}