package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.BBDD;
import modelo.IncidenciasCreadas;
import modelo.Usuario;
import vista.InicioSesion;
import vista.MenuCrearIncidencia;
import vista.MenuPrincipal;
import vista.Registro;
import vista.VerIncidencias;

public class InterfazController implements ActionListener, ItemListener {
	private UsuarioController uc = new UsuarioController();
	private IncidenciasCreadas ic;
	private Usuario us = new Usuario();
	BBDD c;
	MenuCrearIncidencia m;
	@SuppressWarnings({ "rawtypes", "unused" })
	private JComboBox comboTipo, comboSubTipo;
	private JTextField user, password, txtComentario;
	private JTextField nombreUsuario, contrasenia, correoElectronico, direccion;

	public InterfazController() {

	}

	public InterfazController(MenuCrearIncidencia m) {

		this.m = m;
	}

	public InterfazController(@SuppressWarnings("rawtypes") JComboBox comboTipo,
			@SuppressWarnings("rawtypes") JComboBox comboSubTipo, JTextField txtComentario) {

		this.comboTipo = comboTipo;
		this.comboSubTipo = comboSubTipo;
		this.txtComentario = txtComentario;

	}

	public InterfazController(JTextField user, JTextField password) {
		this.user = user;
		this.password = password;

	}

	public InterfazController(JTextField nombreUsuario, JTextField contrasenia, JTextField correoElectronico,
			JTextField direccion) {
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object b = e.getActionCommand();

		if (b.equals("log")) {
			String u = user.getText();
			String pw = password.getText();
			JOptionPane.showMessageDialog(null, (u + pw));

			// control de excepciones por si el login no es correcto
			try {

				if (uc.Login(u, pw) == true) {
					c = new BBDD();
					JOptionPane.showMessageDialog(null, "Login correcto");
					new MenuPrincipal().setVisible(true);
					us.setUser(u);
					us.setPassword(pw);
					Principal.setIdUsuario(c.consultarIdUsuario(us));

				}

			} catch (Exception e1) {

				System.out.println("Error:" + e1.getMessage());
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
				new InicioSesion().setVisible(true);

			}

		}

		if (b.equals("registrar")) {
			JOptionPane.showMessageDialog(null, "registrar");
			new Registro().setVisible(true);

		}
		if (b.equals("registro")) {
			String nomU = nombreUsuario.getText();
			String conU = contrasenia.getText();
			String coElU = correoElectronico.getText();
			String dirU = direccion.getText();
			Usuario u = new Usuario(nomU, conU, coElU, dirU);
			c = new BBDD();
			c.registrarUsuario(u);
			JOptionPane.showMessageDialog(null, "registrando");

		}
		if (b.equals("accede")) {
			JOptionPane.showMessageDialog(null, "A inicio de sesion");
			new InicioSesion().setVisible(true);
		}

		if (b.equals("crearIncidencia")) {

			m = new MenuCrearIncidencia();
			m.setVisible(true);
			c = new BBDD();
			// retorna el String con el tipo, lo que ocurre que siempre me
			// selecciona el primer elemento del comboBox
			m.llenarComboTipo(c.consultarTipo());

		}

		if (b.equals("aceptar")) {

			String comentario;
			int idIncidencia;
			c = new BBDD();

			idIncidencia = c.consultarId((String) comboSubTipo.getSelectedItem());
			comentario = (String) txtComentario.getText();

			System.out.println((String) comboSubTipo.getSelectedItem() + " " + idIncidencia + " " + comentario);
			// saca usuario null porque no lo recupera del atributo de clase
			System.out.println("usuario conectado " + Principal.getIdUsuario());
			ic = new IncidenciasCreadas();
			// recuperamos id Usuario del static del Principal
			ic.setIdusuario(Principal.getIdUsuario());
			ic.setIdincidencia(idIncidencia);
			ic.setComentario(comentario);

			// Registra ya la incidencia
			c.registarIncidencia(ic);

		}

		if (b.equals("cancelar")) {
			new MenuPrincipal().setVisible(true);
		}

		if (b.equals("salir")) {
			JOptionPane.showMessageDialog(null, "Hasta pronto!");
			System.exit(0);
		}
		if (b.equals("cerrarSesion")) {
			new InicioSesion().setVisible(true);
		}

		if (b.equals("mostrarEstadoIncidencias")) {
			new VerIncidencias().setVisible(true);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		c = new BBDD();

		String opcionComboTipo;

		opcionComboTipo = m.obtenerComboTipo();
		System.out.println(opcionComboTipo);
		m.llenarComboSubTipo(c.consultarSubTipo(opcionComboTipo));

	}

}
