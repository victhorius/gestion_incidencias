package vista;

import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import controlador.InterfazController;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class MenuCrearIncidencia extends JFrame {
	private JTextField txtComentario;
	private JButton btnAceptar, btnCancelar;
	private JComboBox<String> comboTipo, comboSubtipo;
	private JLabel tipo, subtipo;

	public MenuCrearIncidencia() {
		inicializarFrame();
		inicializarComponentes();

	}

	public void inicializarFrame() {
		new JFrame();
		this.setTitle("Crear Incidencia");
		this.setSize(435, 425);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void inicializarComponentes() {
		this.setLayout(null);

		tipo = new JLabel("Tipo Incidencia");
		tipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tipo.setBounds(97, 42, 127, 37);

		txtComentario = new JTextField();
		txtComentario.setText("Comentario...");
		txtComentario.setBounds(61, 173, 317, 93);

		txtComentario.setColumns(10);

		subtipo = new JLabel("Subtipo");
		subtipo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		subtipo.setBounds(97, 117, 66, 37);

		comboTipo = new JComboBox<String>();
		comboTipo.setToolTipText("");
		comboTipo.setBounds(256, 35, 122, 54);
		comboTipo.setActionCommand("combotipo");

		comboSubtipo = new JComboBox<String>();
		comboSubtipo.setToolTipText("");
		comboSubtipo.setBounds(256, 102, 122, 54);
		comboSubtipo.setActionCommand("combosubtipo");

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(39, 297, 97, 25);
		btnAceptar.setActionCommand("aceptar");
		btnAceptar.addActionListener(new InterfazController(comboTipo, comboSubtipo, txtComentario));

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(297, 297, 97, 25);
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.addActionListener(new InterfazController());

		this.add(btnCancelar);
		this.add(btnAceptar);
		this.add(tipo);
		this.add(comboTipo);
		this.add(comboSubtipo);
		this.add(subtipo);
		this.add(txtComentario);
	}

	public void llenarComboTipo(ArrayList<String> tipos) {

		for (int i = 0; i < tipos.size(); i++) {

			comboTipo.addItem(tipos.get(i));
		}
		comboTipo.addItemListener(new InterfazController(this));
	}

	public void llenarComboSubTipo(ArrayList<String> subTipos) {

		comboSubtipo.removeAllItems();

		for (int i = 0; i < subTipos.size(); i++) {

			comboSubtipo.addItem(subTipos.get(i));
		}

	}

	public String obtenerComboTipo() {

		return (String) comboTipo.getSelectedItem();

	}

	public String obtenerComboSubTipo() {

		return comboSubtipo.getItemAt(comboTipo.getSelectedIndex());

	}

	public String obtenerComentario() {
		String comentario;

		comentario = txtComentario.getText();

		return comentario;

	}
}
