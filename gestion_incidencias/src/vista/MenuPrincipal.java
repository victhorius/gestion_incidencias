package vista;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.InterfazController;

import javax.swing.JButton;

public class MenuPrincipal extends JFrame {

	private JLabel lblBienvenidoUsuario;
	private JLabel lblqueQuieresHacer;
	private JButton btnCrearIncidencia;
	private JButton btnMostrarEstadoDe;
	private JButton btnNewButton;
	private JButton btnSalir;
	private JButton btnCerrarSesion;

	public MenuPrincipal() {
		super();
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Menu Principal");
		this.setSize(435, 425);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void inicializarComponentes() {
		lblBienvenidoUsuario = new JLabel("Bienvenido Usuario");
		lblBienvenidoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBienvenidoUsuario.setBounds(94, 13, 201, 37);

		lblqueQuieresHacer = new JLabel("\u00BFQue quieres hacer?");
		lblqueQuieresHacer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblqueQuieresHacer.setBounds(12, 67, 216, 29);

		btnCrearIncidencia = new JButton("Crear  Incidencia");
		btnCrearIncidencia.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnCrearIncidencia.setHorizontalAlignment(SwingConstants.LEADING);
		btnCrearIncidencia.setBounds(59, 125, 279, 37);
		btnCrearIncidencia.setActionCommand("crearIncidencia");
		btnCrearIncidencia.addActionListener(new InterfazController());

		btnMostrarEstadoDe = new JButton("Mostrar estado de las incidencias");
		btnMostrarEstadoDe.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnMostrarEstadoDe.setHorizontalAlignment(SwingConstants.LEADING);
		btnMostrarEstadoDe.setBounds(59, 184, 279, 37);
		btnMostrarEstadoDe.setActionCommand("mostrarEstadoIncidencias");
		btnMostrarEstadoDe.addActionListener(new InterfazController());

		btnNewButton = new JButton("Editar Perfil");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBounds(59, 242, 279, 37);

		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalir.setBounds(59, 312, 125, 36);
		btnSalir.setActionCommand("salir");
		btnSalir.addActionListener(new InterfazController());

		btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCerrarSesion.setBounds(213, 312, 125, 36);
		btnCerrarSesion.setActionCommand("cerrarSesion");
		btnCerrarSesion.addActionListener(new InterfazController());

		this.add(lblBienvenidoUsuario);
		this.add(lblqueQuieresHacer);
		this.add(btnCrearIncidencia);
		this.add(btnMostrarEstadoDe);
		this.add(btnNewButton);
		this.add(btnSalir);
		this.add(btnCerrarSesion);

	}

}
