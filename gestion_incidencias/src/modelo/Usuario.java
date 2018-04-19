package modelo;

public class Usuario {
	private String nombre, contrase�a, email;
	private int portal, piso;
	private char letra;

	public Usuario(String nombre, String contrase�a, String email, int portal, int piso, char letra) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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