package vista;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import controlador.InterfazController;
import modelo.Incidencia;
import modelo.IncidenciasCreadas;
import modelo.Usuario;

import javax.swing.JButton;

public class MenuCrearIncidencia extends JFrame {
	private JTextField txtComentario;
	private JButton btnAceptar,btnCancelar;
	private JComboBox comboTipo,comboSubtipo;
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
		

		comboTipo = new JComboBox();
		comboTipo.setToolTipText("");
		comboTipo.setBounds(256, 35, 122, 54);
		comboTipo.setActionCommand("combotipo");
		comboTipo.addItemListener(new InterfazController());

		comboSubtipo = new JComboBox();
		comboSubtipo.setToolTipText("");
		comboSubtipo.setBounds(256, 102, 122, 54);
		comboSubtipo.setActionCommand("combosubtipo");
		

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(39, 297, 97, 25);
		btnAceptar.setActionCommand("aceptar");
		btnAceptar.addActionListener(new InterfazController());

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
	
	public void llenarComboTipo(ArrayList<Incidencia> i, Usuario u) {
		
		HashSet<String> tipos = new HashSet<String>();
		for (int j = 0; j < i.size(); j++) {
			tipos.add(i.get(j).getTipoIncidencia());
		}
		
		String tipoaux, subtipoaux;

		ArrayList<String> tiposA = new ArrayList<String>();
		ArrayList<String> subTiposA = new ArrayList<String>();

		for (Iterator<String> iterator = tipos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			tiposA.add(string);
		}
		
		for (int j = 0; j < tiposA.size(); j++) {
			comboTipo.addItem(tiposA.get(j));
		}
		
		
		//metodo que hay que usar para llenar los combo
		
		/*public IncidenciasCreadas menuCrearIncidencia(ArrayList<Incidencia> i, Usuario u) {
		 * 
		 * System.out.println("Selecciona tipo de incidencias a crear");

		HashSet<String> tipos = new HashSet<String>();
		for (int j = 0; j < i.size(); j++) {
			tipos.add(i.get(j).getTipoIncidencia());

		}

		String tipoaux, subtipoaux;

		ArrayList<String> tiposA = new ArrayList<String>();
		ArrayList<String> subTiposA = new ArrayList<String>();

		for (Iterator<String> iterator = tipos.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			tiposA.add(string);
		}

		for (int j = 0; j < tiposA.size(); j++) {
			System.out.println((j + 1) + " - " + tiposA.get(j));
		}

		int opciontipo = sc.nextInt();
		tipoaux = tiposA.get(opciontipo - 1);

		for (int j = 0; j < i.size(); j++) {
			if (i.get(j).getTipoIncidencia().equals(tipoaux)) {
				subTiposA.add(i.get(j).getSubtipo());
			}
		}

		System.out.println("Selecciona un subtipo");

		for (int j = 0; j < subTiposA.size(); j++) {
			System.out.println((j + 1) + " - " + subTiposA.get(j));
		}

		int opcionsubtipo = sc.nextInt();
		subtipoaux = subTiposA.get(opcionsubtipo - 1);

		int idincidencia = 0;

		for (int j = 0; j < i.size(); j++) {

			if (i.get(j).getTipoIncidencia().equals(tipoaux) && i.get(j).getSubtipo().equals(subtipoaux)) {
				idincidencia = i.get(j).getIdIncidencia();
			}
		}

		String comentario = introducirComentario();

		IncidenciasCreadas incidencia = new IncidenciasCreadas();

		incidencia.setComentario(comentario);
		incidencia.setFecha(Calendar.getInstance());
		incidencia.setIdincidencia(idincidencia);
		incidencia.setIdusuario(u.getId());
		
		System.out.println(incidencia.toString());
		
		return incidencia;
		
	}*/
		
		
	}
	
	public static void llenarComboSubTipo() {
		int opciontipo = sc.nextInt();
		tipoaux = tiposA.get(opciontipo - 1);

		for (int j = 0; j < i.size(); j++) {
			if (i.get(j).getTipoIncidencia().equals(tipoaux)) {
				subTiposA.add(i.get(j).getSubtipo());
			}
		}

		System.out.println("Selecciona un subtipo");

		for (int j = 0; j < subTiposA.size(); j++) {
			System.out.println((j + 1) + " - " + subTiposA.get(j));
		}
	}

	public static void main(String[] args) {

		MenuCrearIncidencia i = new MenuCrearIncidencia();
		i.setVisible(true);
	}
}
