package vista;

import javax.swing.JFrame;

import controlador.InterfazController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Registro extends JFrame {
	private JLabel lblNombreUsuario, lblRegistrate, lblDireccin, lblCorreoElectronico, lblContrasea, lblyaTienesCuenta;
	private JTextField CorreoElectronico, Direccion, NombreUsuario, Contrasenia;
	private JButton btnAccedeAqu, btnRegistrarse;

	public Registro() {
		super();
		inicializarFrame();
		inicializarComponentes();

	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Bienvenido a la Comunidad");
		this.setSize(445, 550);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void inicializarComponentes() {

		lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setBounds(155, 0, 130, 45);
		lblRegistrate.setFont(new Font("Tahoma", Font.BOLD, 20));

		lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setBounds(12, 40, 350, 35);
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		NombreUsuario = new JTextField();
		NombreUsuario.setBounds(12, 80, 350, 35);
		NombreUsuario.setColumns(10);

		lblContrasea = new JLabel("Contrasena");
		lblContrasea.setBounds(12, 120, 350, 35);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));

		Contrasenia = new JTextField();
		Contrasenia.setBounds(12, 160, 350, 35);
		Contrasenia.setFont(new Font("Tahoma", Font.PLAIN, 18));

		lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setBounds(12, 200, 350, 35);
		lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 18));

		CorreoElectronico = new JTextField();
		CorreoElectronico.setBounds(12, 240, 350, 35);
		CorreoElectronico.setColumns(10);

		lblDireccin = new JLabel("Direccion");
		lblDireccin.setBounds(12, 280, 350, 35);
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 18));

		Direccion = new JTextField();
		Direccion.setBounds(12, 320, 350, 35);
		Direccion.setColumns(10);

		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(50, 380, 275, 50);
		btnRegistrarse.setForeground(Color.BLUE);
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnRegistrarse.setActionCommand("registro");
		btnRegistrarse
				.addActionListener(new InterfazController(NombreUsuario, Contrasenia, CorreoElectronico, Direccion));

		lblyaTienesCuenta = new JLabel("Ya tienes cuenta?");
		lblyaTienesCuenta.setBounds(12, 450, 170, 35);
		lblyaTienesCuenta.setFont(new Font("Tahoma", Font.BOLD, 16));

		btnAccedeAqu = new JButton("Accede aqui");
		btnAccedeAqu.setBounds(235, 450, 170, 35);
		btnAccedeAqu.setForeground(Color.BLUE);
		btnAccedeAqu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnAccedeAqu.setActionCommand("accede");
		btnAccedeAqu.addActionListener(new InterfazController());

		this.add(lblRegistrate);
		this.add(lblNombreUsuario);
		this.add(NombreUsuario);
		this.add(lblContrasea);
		this.add(Contrasenia);
		this.add(lblCorreoElectronico);
		this.add(CorreoElectronico);
		this.add(lblDireccin);
		this.add(Direccion);
		this.add(btnRegistrarse);
		this.add(lblyaTienesCuenta);
		this.add(btnAccedeAqu);

	}

}
