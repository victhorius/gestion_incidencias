package controlador;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InterfazController2 implements ActionListener{
	private UsuarioController uc;

	private JTextField user;
	JPasswordField password;

	public InterfazController2() {

	}

	/*public InterfazController2(JTextField user, JPasswordField password) {
		this.user = user;
		this.password = password;

	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		Object b = e.getActionCommand();
		String u = user.getText();
		String pw = password.getPassword().toString();
		JOptionPane.showMessageDialog(null, "hola");
		if (b.equals("acceder")) {
			try {
				if (uc.Login(u, pw) == true) {
					JOptionPane.showMessageDialog(null, "conectado");

				} else {
					JOptionPane.showMessageDialog(null, "no conectado");
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (b.equals("registrar")) {

			JOptionPane.showMessageDialog(null, "registrar");

		}

	}

}
