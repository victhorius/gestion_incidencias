package vista;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.UsuarioController;
import modelo.Usuario;

public class LogIn extends JFrame implements ActionListener, MouseListener, KeyListener, FocusListener {

	static UsuarioController uc = new UsuarioController();

	private JLabel l1, l2;
	private TextField tf1, tf2;
	private Button b1;

	public LogIn() {
		super();
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Log-In");
		this.setSize(500, 350);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void inicializarComponentes() {
		String usuario = "";
		String pw = "";

		Font f1 = new Font("Arial", Font.BOLD, 20);
		l1 = new JLabel("Usuario");
		usuario = l1.getText();
		l1.setBounds(50, 25, 200, 25);
		l1.setFont(f1);
		l2 = new JLabel("Contraseña");
		pw = l2.getText();
		l2.setBounds(50, 125, 200, 25);
		l2.setFont(f1);
		tf1 = new TextField();
		tf1.setBounds(150, 55, 200, 25);
		tf2 = new TextField();
		tf2.setBounds(150, 155, 200, 25);
		b1 = new Button("Log-In");
		b1.setBounds(200, 220, 100, 50);
		b1.setFont(f1);
		b1.addActionListener(this);
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(b1);
		Usuario u = new Usuario(usuario, pw);
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == b1) {
			uc.Login();
		}
	}

	public static void main(String[] args) {
		LogIn log = new LogIn();
		log.setVisible(true);
	}
}
