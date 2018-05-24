package vista;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import modelo.BBDD;
import modelo.DatosIncidencias;
import modelo.IncidenciasCreadas;

public class VerIncidencias extends JFrame {

	JTable tabla;
	DefaultTableModel modelo;
	JScrollPane scroll;
	DatosIncidencias di = new DatosIncidencias();
	BBDD c = new BBDD();

	public VerIncidencias() {
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		this.setTitle("INCIDENCIAS CREADAS");
		this.setSize(310, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void inicializarComponentes() {
		String cabeceras[] = { "USUARIO", "TIPO", "SUBTIPO", "FECHA", "COMENTARIO" };
		tabla = new JTable();
		modelo = new DefaultTableModel();
		ArrayList<DatosIncidencias> di = c.consultarIncidencias();
		insertarFila(di);
		modelo.setColumnIdentifiers(cabeceras);

		tabla.setModel(modelo);
		scroll = new JScrollPane(tabla);

		this.add(scroll);
	}

	public void insertarFila(ArrayList<DatosIncidencias> di) {

		for (int i = 0; i < di.size(); i++) {
			modelo.addRow(new Object[] { di.get(i).getUsuario(), di.get(i).getTipo(), di.get(i).getSubtipo(),
					di.get(i).getFecha(), di.get(i).getComentario() });
		}
	}
}
