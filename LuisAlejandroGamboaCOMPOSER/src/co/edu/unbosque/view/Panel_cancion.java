package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Panel_cancion extends JPanel {
	
	public JTextArea campo_cancion;
	public JButton boton_crear;
	
	public Panel_cancion() {
		
		setLayout(null);
		setBackground(Color.white);
		
		inicializarComponentes();
		
		setVisible(true);
		
	}
	public void inicializarComponentes() {
		
		campo_cancion = new JTextArea();
		campo_cancion.setBounds(30, 20, 700, 450);
		campo_cancion.setEnabled(false);
		
		add(campo_cancion);
		
		boton_crear = new JButton("Crear");
		boton_crear.setBounds(225, 500, 200, 30);
		boton_crear.setBackground(Color.red);
		add(boton_crear);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
