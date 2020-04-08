package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View extends JFrame{
	
	JLabel labelnombre;
	JTextArea txtcancion;
	JButton botongenerar;
	JButton botonok;
	private JFileChooser fc; 
	
	
	public View() {
		
		GridLayout matriz= new GridLayout(3,1);
		
		setLayout(matriz);
		
		labelnombre = new JLabel("Regueton time");
		txtcancion = new JTextArea();
		JScrollPane barra = new JScrollPane(txtcancion);
		botongenerar = new JButton("Generar canción");
		botonok = new JButton("Mostrar canción");
		
		add(labelnombre);
		add(barra);
		
		JPanel aux = new JPanel();
		aux.setLayout(new GridLayout(1,2));
		aux.add(botonok);
		aux.add(botongenerar);
		
		add(aux);
		//txtcancion.setBounds(x, y, width, height);
		setBounds(30, 30, 300, 300);
		
		
		setResizable(true);
		setVisible(true);
		
	}
	
	public void ventanaSalvar() {
		fc = new JFileChooser(System.getProperty("user.dir"));
		fc.showSaveDialog(fc);
	}
	
	public JFileChooser getFc() {
		return fc;
	}
	
	
	
	

	public JLabel getLabelnombre() {
		return labelnombre;
	}





	public void setLabelnombre(JLabel labelnombre) {
		this.labelnombre = labelnombre;
	}





	public JTextArea getTxtcancion() {
		return txtcancion;
	}





	public void setTxtcancion(JTextArea txtcancion) {
		this.txtcancion = txtcancion;
	}





	public JButton getBotongenerar() {
		return botongenerar;
	}





	public void setBotongenerar(JButton botongenerar) {
		this.botongenerar = botongenerar;
	}





	public JButton getBotonok() {
		return botonok;
	}





	public void setBotonok(JButton botonok) {
		this.botonok = botonok;
	}

}

