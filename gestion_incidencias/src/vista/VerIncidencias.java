package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controlador.Principal;
import modelo.BBDD;
import modelo.DatosIncidencias;

public class VerIncidencias extends JDialog {

	JTable tabla;
	DefaultTableModel modelo;
	JScrollPane scroll;
	DatosIncidencias di = new DatosIncidencias();

	public VerIncidencias() {
		inicializarFrame();
		inicializarComponentes();
	}

	public void inicializarFrame() {
		this.setTitle("INCIDENCIAS CREADAS");
		this.setSize(310, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}

	public void inicializarComponentes() {
		String cabeceras[] = { "ID_INCIDENCIA", "TIPO", "SUBTIPO", "COMENTARIO", "FECHA_REGISTRO", "ESTADO" };
		BBDD c = new BBDD();
		tabla = new JTable();
		modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(cabeceras);
		ArrayList<DatosIncidencias> di = c.consultarIncidencias(Principal.getIdUsuario());
		insertarFila(di);

		tabla.setModel(modelo);
		scroll = new JScrollPane(tabla);

		this.add(scroll);
	}

	public void insertarFila(ArrayList<DatosIncidencias> di) {

		for (int i = 0; i < di.size(); i++) {
			modelo.addRow(new Object[] { di.get(i).getIdincidencia(), di.get(i).getTipo(), di.get(i).getSubtipo(),
					 di.get(i).getComentario(),di.get(i).getFecha(),di.get(i).getEstado() });
		}
	}
}
