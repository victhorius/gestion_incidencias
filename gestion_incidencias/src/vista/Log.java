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

public class Log extends JFrame implements ActionListener, MouseListener, KeyListener, FocusListener {

	private JLabel l1, l2;
	private TextField tf1, tf2;
	private Button b1;

	public Log() {
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

		Font f1 = new Font("Arial", Font.BOLD, 20);
		l1 = new JLabel("Usuario");
		l1.setBounds(50, 25, 200, 25);
		l1.setFont(f1);
		l2 = new JLabel("Contraseña");
		l2.setBounds(50, 125, 200, 25);
		l2.setFont(f1);
		tf1 = new TextField();
		tf1.setBounds(150, 55, 200, 25);
		tf2 = new TextField();
		tf2.setBounds(150, 155, 200, 25);
		b1 = new Button("Log-In");
		b1.setBounds(200, 220, 100, 50);
		b1.setFont(f1);
		add(l1);
		add(l2);
		add(tf1);
		add(tf2);
		add(b1);

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
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Log log = new Log();
		log.setVisible(true);
	}
}
