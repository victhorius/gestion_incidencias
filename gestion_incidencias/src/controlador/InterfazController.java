package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.prism.impl.shape.OpenPiscesRasterizer;

import modelo.BBDD;
import modelo.IncidenciasCreadas;
import modelo.Usuario;
import vista.InicioSesion;
import vista.MenuCrearIncidencia;
import vista.MenuPrincipal;
import vista.Registro;

public class InterfazController implements ActionListener, ItemListener, MouseListener, KeyListener, FocusListener {
	private UsuarioController uc = new UsuarioController();
	// private IncidenciaController ic = new IncidenciaController();
	private IncidenciasCreadas ic;
	private Usuario us = new Usuario();
	private int idUsuario;
	BBDD c;
	MenuCrearIncidencia m;
	private JComboBox comboTipo, comboSubTipo;
	private JTextField user, password,txtComentario;
	private JTextField nombreUsuario, contrasenia, correoElectronico, direccion;

	public InterfazController() {

	}
	
	public InterfazController(MenuCrearIncidencia m) {

		this.m=m;
	}
	
	public InterfazController(JComboBox comboTipo, JComboBox comboSubTipo,JTextField txtComentario) {

		this.comboTipo=comboTipo;
		this.comboSubTipo=comboSubTipo;
		this.txtComentario=txtComentario;
		
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
					us.setUser(u);
					us.setPassword(pw);
					us.setId(c.consultarIdUsuario(us));
					
					new MenuPrincipal(us).setVisible(true);

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
			Usuario u = new Usuario();
			u.setUser(nomU);
			u.setPassword(conU);
			u.setCorreoElectronico(coElU);
			u.setDireccion(dirU);
			c.registrarUsuario(u);
			JOptionPane.showMessageDialog(null, "registrando");

		}
		if (b.equals("accede")) {
			JOptionPane.showMessageDialog(null, "A inicio de sesion");
			new InicioSesion().setVisible(true);
		}

		if (b.equals("crearIncidencia")) {

			String opcionComboTipo, opcionComboSubTipo;

			m = new MenuCrearIncidencia();
			m.setVisible(true);
			c = new BBDD();
			// retorna el String con el tipo, lo que ocurre que siempre me
			// selecciona el primer elemento del comboBox
			m.llenarComboTipo(c.consultarTipo());
			
			//m.llenarComboSubTipo(c.consultarSubTipo(opcionComboTipo));
			//opcionComboSubTipo = m.obtenerComboSubTipo();

		}
			
			if (b.equals("aceptar")) {

				String comentario, opcionComboTipo;
				int idIncidencia;
				
				c = new BBDD();
				
				
				idIncidencia = c.consultarId((String) comboSubTipo.getSelectedItem());
				comentario = (String) txtComentario.getText();
				

				System.out.println((String) comboSubTipo.getSelectedItem()+" "+idIncidencia+" "+comentario);
				//saca usuario null porque no lo recupera dle atributo de clase
				System.out.println("usuario conectado "+us.getPassword());
				// hay que recuperar el id del usuario conectado, pongo 1 de prueba
				ic = new IncidenciasCreadas();
				ic.setIdusuario(1);
				ic.setIdincidencia(idIncidencia);
				ic.setComentario(comentario);

				//c.registarIncidencia(ic);

			}
			
			

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
	public void itemStateChanged(ItemEvent e) {
		
		c = new BBDD();
		
		String opcionComboTipo, opcionComboSubTipo;
		
		opcionComboTipo = m.obtenerComboTipo();
		System.out.println(opcionComboTipo);
		m.llenarComboSubTipo(c.consultarSubTipo(opcionComboTipo));
		//opcionComboSubTipo = m.obtenerComboSubTipo();

	// para que se actualice al combo de Subtipos con cada cambio en el de tipos

	}

}
