package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField NombreUsuario;
	private JPasswordField Contrasenia;
	private JTextField CorreoElectronico;
	private JTextField Direccion;

	public Registro() {
		super();
		inicializarFrame();
		inicializarComponentes();

	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Bienvenido a la Comunidad");
		this.setSize(445, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}

	public void inicializarComponentes() {
		JLabel lblRegistrate = new JLabel("Registrate");
		lblRegistrate.setFont(new Font("Tahoma", Font.BOLD, 20));

		JPanel panel = new JPanel();

		JLabel lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));

		NombreUsuario = new JTextField();
		NombreUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));

		Contrasenia = new JPasswordField();

		JLabel lblCorreoElectronico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 18));

		CorreoElectronico = new JTextField();
		CorreoElectronico.setColumns(10);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 18));

		Direccion = new JTextField();
		Direccion.setColumns(10);

		JLabel lblyaTienesCuenta = new JLabel("\u00BFYa tienes cuenta?");
		lblyaTienesCuenta.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnAccedeAqu = new JButton("Accede aqu\u00ED");
		btnAccedeAqu.setForeground(Color.BLUE);
		btnAccedeAqu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(CorreoElectronico))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(Contrasenia))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap().addComponent(NombreUsuario))
						.addGroup(Alignment.LEADING,
								gl_panel.createSequentialGroup().addGap(12).addComponent(lblContrasea,
										GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING,
								gl_panel.createSequentialGroup().addContainerGap().addComponent(lblDireccin,
										GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING,
								gl_panel.createSequentialGroup().addContainerGap().addComponent(lblCorreoElectronico,
										GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING,
								gl_panel.createSequentialGroup().addContainerGap().addComponent(lblNombreUsuario,
										GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup().addGap(10)
												.addComponent(lblyaTienesCuenta).addGap(18).addComponent(btnAccedeAqu))
										.addComponent(Direccion))))
				.addGap(9)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addComponent(lblNombreUsuario, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(NombreUsuario, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(Contrasenia, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addGap(12).addComponent(CorreoElectronico, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblDireccin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(Direccion, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblyaTienesCuenta, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAccedeAqu))
				.addContainerGap()));
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(
						gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
										.addComponent(lblRegistrate, GroupLayout.PREFERRED_SIZE, 248,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(162, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(panel,
												GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
										.addGap(40)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(lblRegistrate, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(5)));
		contentPane.setLayout(gl_contentPane);
	}
}
