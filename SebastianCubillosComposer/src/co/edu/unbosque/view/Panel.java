package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel extends JPanel{
	
	private JTextArea areaCancion;
	private JButton botonCancion;
	private JButton botonGuardar;
	private JButton botonProp;
	
	public Panel() {
		
		setLayout(null);
		setBackground(Color.BLUE);
		
		inicializar();
	}
	public void inicializar() {
		
		areaCancion = new JTextArea("");
		areaCancion.setBounds(10, 10, 455, 410);
		add(areaCancion);
		
		botonCancion = new JButton("Crear Cancion Pa' Perrear");
		botonCancion.setBounds(38, 440, 400, 40);
		add(botonCancion);
		
		botonGuardar = new JButton("Guardar Cancion");
		botonGuardar.setBounds(38, 490, 400, 40);
		add(botonGuardar);
		
		botonProp = new JButton("Ver Propiedades del Archivo");
		botonProp.setBounds(38, 540, 400, 40);
		add(botonProp);
	}
	public JTextArea getAreaCancion() {
		return areaCancion;
	}
	public void setAreaCancion(JTextArea areaCancion) {
		this.areaCancion = areaCancion;
	}
	public JButton getBotonCancion() {
		return botonCancion;
	}
	public void setBotonCancion(JButton botonCancion) {
		this.botonCancion = botonCancion;
	}
	public JButton getBotonProp() {
		return botonProp;
	}
	public void setBotonProp(JButton botonProp) {
		this.botonProp = botonProp;
	}
	public JButton getBotonGuardar() {
		return botonGuardar;
	}
	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}
	
}
