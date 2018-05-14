package vista;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

import controlador.InterfazController;

public class InicioSesion extends JFrame {

	private JLabel l1, l2;
	private JTextField tf1, passwordField;
	private JButton b1, b2;
	private JLabel lblaunNoTienes;

	public InicioSesion() {
		super();
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Inicia sesion");
		this.setSize(435, 425);
		getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void inicializarComponentes() {

		Font f1 = new Font("Arial", Font.BOLD, 20);
		l1 = new JLabel("Usuario");
		l1.setBounds(12, 13, 200, 50);
		l1.setFont(f1);
		l2 = new JLabel("Contraseña");
		l2.setBounds(12, 125, 200, 50);
		l2.setFont(f1);
		lblaunNoTienes = new JLabel("¿Aun no tienes cuenta?");
		lblaunNoTienes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblaunNoTienes.setBounds(12, 304, 242, 50);
		tf1 = new JTextField();
		tf1.setBounds(12, 81, 363, 31);
		passwordField = new JTextField();
		passwordField.setBounds(12, 175, 363, 31);
		b1 = new JButton("Acceder");
		b1.setActionCommand("acceder");
		b1.addActionListener(new InterfazController(tf1, passwordField));
		b1.setBounds(134, 234, 130, 50);
		b1.setFont(f1);
		b2 = new JButton("Registrate aqui");
		b2.setActionCommand("registrar");
		b2.addActionListener(new InterfazController());
		b2.setForeground(Color.BLUE);
		b2.setBounds(238, 304, 169, 50);
		b2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		this.add(l1);
		this.add(l2);
		this.add(tf1);
		this.add(b1);
		this.add(b2);
		this.add(passwordField);
		this.add(lblaunNoTienes);

	}

}
