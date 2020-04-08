package co.edu.unbosque.view;

import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCrear extends JPanel{
	
	private JTextArea campo;
	private JButton botonCrear;
	private JButton botonGuardar;
	private JButton botonPropiedades;
	
	
	public PanelCrear() {
		
		setLayout(null);
		setBackground(Color.ORANGE);
		inicializar();
	}
	
	public void inicializar() {
		
		campo = new JTextArea();
		campo.setBounds(25, 80, 430, 340);
		campo.setLineWrap(true);
		add(campo);
		
		botonCrear = new JButton("Crear Cancion Exitosa");
		botonCrear.setBounds(20, 30, 170, 20);
		add(botonCrear);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.setBounds(205, 30, 120, 20);
		add(botonGuardar);
		
		botonPropiedades = new JButton("Propiedades");
		botonPropiedades.setBounds(340, 30, 120, 20);
		add(botonPropiedades);
		
	}

	public JTextArea getCampo() {
		return campo;
	}

	public void setCampo(JTextArea campo) {
		this.campo = campo;
	}

	public JButton getBotonCrear() {
		return botonCrear;
	}

	public void setBotonCrear(JButton botonIngreso) {
		this.botonCrear = botonIngreso;
	}

	public JButton getBotonGuardar() {
		return botonGuardar;
	}

	public void setBotonGuardar(JButton botonGuardar) {
		this.botonGuardar = botonGuardar;
	}

	public JButton getBotonPropiedades() {
		return botonPropiedades;
	}

	public void setBotonPropiedades(JButton botonPropiedades) {
		this.botonPropiedades = botonPropiedades;
	}
	

}
