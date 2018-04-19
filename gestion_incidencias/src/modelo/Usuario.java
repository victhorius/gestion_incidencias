package modelo;

public class Usuario {
	private String usuario, contraseña;
	private int portal, piso;
	private char letra;

	public Usuario(String usuario, String contraseña, String email, int portal, int piso, char letra) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.usuario = email;
		this.portal = portal;
		this.piso = piso;
		this.letra = letra;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuairo(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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