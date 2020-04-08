package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCrear extends JPanel{
	
	public JTextArea campo;
	public JButton botonCrear;
	public JButton botonAbrir;
	
	public PanelCrear() {
		
		setLayout(null);
		inicializar();
	}
	
	public void inicializar() {
		
		campo = new JTextArea();
		campo.setBounds(30, 80, 420, 1040);
		campo.setLineWrap(true);
		campo.setEditable(false);
		add(campo);
		
		botonCrear = new JButton("Crear Cancion Exitosa");
		botonCrear.setBounds(150, 30, 170, 20);
		add(botonCrear);
		
		botonAbrir = new JButton("Abrir Cancion Exitosa");
		botonAbrir.setBounds(150, 0, 170, 20);
		add(botonAbrir);
		
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

	public JButton getBotonAbrir() {
		return botonAbrir;
	}

	public void setBotonAbrir(JButton botonAbrir) {
		this.botonAbrir = botonAbrir;
	}
	
}
	
