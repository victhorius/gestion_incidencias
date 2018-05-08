package vista;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPasswordField;

import controlador.InterfazController;
import controlador.Principal;

public class InicioSesion extends JFrame {

	private JLabel l1, l2;
	private TextField tf1;
	private Button b1, b2;
	private JPasswordField passwordField;
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
		tf1 = new TextField();
		tf1.setBounds(12, 81, 363, 31);
		// tf1.addActionListener(new Principal(tf1));
		passwordField = new JPasswordField();
		passwordField.setBounds(12, 175, 363, 31);
		// passwordField.addActionListener;
		b1 = new Button("Acceder");
		b1.setActionCommand("acceder");
		b1.addActionListener(new InterfazController(tf1, passwordField));
		b1.setBounds(134, 234, 130, 50);
		b1.setFont(f1);
		b2 = new Button("Registrate aqui");
		b2.setActionCommand("registrar");
		b2.addActionListener(new InterfazController());
		b2.setForeground(Color.BLUE);
		b2.setBounds(238, 304, 169, 50);
		b2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		getContentPane().add(l1);
		getContentPane().add(l2);
		getContentPane().add(tf1);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(passwordField);
		getContentPane().add(lblaunNoTienes);

	}

	public static void main(String[] args) {
		InicioSesion log = new InicioSesion();
		log.setVisible(true);
	}
}
