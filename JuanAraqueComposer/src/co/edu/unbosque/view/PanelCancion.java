package co.edu.unbosque.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PanelCancion extends JPanel{

	public JTextArea campoTexto;
	public JButton botonCrear;
	public JButton botonAbrir;
	
	public PanelCancion() {
		
		setLayout(null);
		inicializar();
	}
	
	public void inicializar() {
		
		campoTexto = new JTextArea();
		campoTexto.setBounds(0, 80, 550, 700);
		campoTexto.setLineWrap(true);
		campoTexto.setEditable(false);
		add(campoTexto);
		
		botonCrear = new JButton("Crear Cancion");
		botonCrear.setBounds(150, 30, 170, 20);
		add(botonCrear);
		
		botonAbrir = new JButton("Abrir Cancion");
		botonAbrir.setBounds(150, 0, 170, 20);
		add(botonAbrir);
		
	}

	public JTextArea getCampoTexto() {
		return campoTexto;
	}

	public void setCampoTexto(JTextArea campo) {
		this.campoTexto = campo;
	}

	public JButton getBotonCrear() {
		return botonCrear;
	}

	public void setBotonCrear(JButton botonCrear) {
		this.botonCrear = botonCrear;
	}

	public JButton getBotonAbrir() {
		return botonAbrir;
	}

	public void setBotonAbrir(JButton botonAbrir) {
		this.botonAbrir = botonAbrir;
	}
	
}
