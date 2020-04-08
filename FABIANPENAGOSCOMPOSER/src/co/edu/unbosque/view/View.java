package co.edu.unbosque.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;


public class View extends JFrame {
	JButton btnescritura;
	JButton btnguardar;

	
	JPanel panel1;
	JTextArea texto;
	
	public View () {
		setSize(700,300);
		setTitle("Cancion de reggaeton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnescritura=new JButton("Crear cancion ");
		btnguardar=new JButton("Guardar");
		
		btnescritura.setActionCommand("escritura");
		btnguardar.setActionCommand("guardar");
		texto=new JTextArea(12,70);
		texto.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		JScrollPane scroll = new JScrollPane ( texto );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
	    
		texto.setLineWrap(true);
		texto.setEnabled(false);
		panel1=new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel1.add(btnescritura);
		panel1.add(btnguardar);
		
		panel1.add(scroll);
		add(panel1);
		setVisible(true);
	}
	
	public String gestionarArchivo() {
	JFileChooser arc=new JFileChooser();
	int numero=arc.showSaveDialog(null);
	
		File archivo=arc.getSelectedFile();
		String ruta=arc.getSelectedFile().getAbsolutePath();
		archivo.getAbsolutePath().endsWith(".txt");
		
		return ruta;
	}
	
	public void leerString(String leer) {
		
		JOptionPane.showMessageDialog(null, leer);
		
		
	}
	
	
	public JButton getBtnescritura() {
		return btnescritura;
	}
	public void setBtnescritura(JButton btnescritura) {
		this.btnescritura = btnescritura;
	}
	public JPanel getPanel1() {
		return panel1;
	}
	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}

	public JTextArea getTexto() {
		return texto;
	}

	public void setTexto(JTextArea texto) {
		this.texto = texto;
	}

	public JButton getBtnguardar() {
		return btnguardar;
	}

	public void setBtnguardar(JButton btnguardar) {
		this.btnguardar = btnguardar;
	}
	
}
