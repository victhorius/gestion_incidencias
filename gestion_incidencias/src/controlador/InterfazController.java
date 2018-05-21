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

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.fabric.xmlrpc.base.Array;

import modelo.Usuario;
import vista.InicioSesion;
import vista.MenuCrearIncidencia;
import vista.MenuPrincipal;
import vista.Registro;

public class InterfazController implements ActionListener, ItemListener, MouseListener, KeyListener, FocusListener {
	private UsuarioController uc = new UsuarioController();
	private IncidenciaController ic = new IncidenciaController();
	private Usuario us = new Usuario();

	private JTextField user, password;

	public InterfazController() {

	}

	public InterfazController(JTextField user, JTextField password) {
		this.user = user;
		this.password = password;

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
					JOptionPane.showMessageDialog(null, "Login correcto");
					MenuPrincipal i = new MenuPrincipal();
					i.setVisible(true);
					us.setUser(u);
					us.setPassword(pw);

				}

			} catch (Exception e1) {

				System.out.println("Error:" + e1.getMessage());
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");

				InicioSesion log = new InicioSesion();
				log.setVisible(true);

			}

		}
		

		
		if (b.equals("registrar")) {
			JOptionPane.showMessageDialog(null, "registrar");
			Registro reg = new Registro();
			reg.setVisible(true);

		}
		if (b.equals("accede")) {
			JOptionPane.showMessageDialog(null, "A inicio de sesion");
			InicioSesion log = new InicioSesion();
			log.setVisible(true);
		}

		if (b.equals("crearIncidencia")) {
			
						
			
			MenuCrearIncidencia m = new MenuCrearIncidencia();
			m.llenarComboTipo(ic.crearIncidencia(),us);
			
			m.setVisible(true);
			//recupero la opcion seleccionada del comboTipo
			//metodo del comboSubtipo
			//recuperar todo y crear incidencia
			
			
			

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
		
		//para que se actualice al combo de Subtipos con cada cambio en el de tipos
		
	}

}
