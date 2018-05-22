package vista;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import modelo.DatosIncidencias;
import modelo.IncidenciasCreadas;

public class VerIncidencias extends JFrame {

	JTable tabla;
	DefaultTableModel modelo;
	JScrollPane scroll;
	DatosIncidencias di = new DatosIncidencias();

	public VerIncidencias() {
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		this.setTitle("VENTANA DE JTABLE CON ARRAYLIST");
		this.setSize(310, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void inicializarComponentes() {
		String cabeceras[] = { "USUARIO", "TIPO", "SUBTIPO", "FECHA", "COMENTARIO" };
		tabla = new JTable();
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(cabeceras);
		tabla.setModel(modelo);
		scroll = new JScrollPane(tabla);

		this.add(scroll);
	}

	public static void main(String[] args) {
		VerIncidencias vi = new VerIncidencias();

	}
}