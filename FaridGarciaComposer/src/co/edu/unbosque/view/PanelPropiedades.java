package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelPropiedades extends JPanel{
	
	private JTextArea campo;
	private JButton botonVolver;
	
	
	public PanelPropiedades() {
		
		setLayout(null);
		setBackground(Color.ORANGE);
		inicializar();
	}
	
	public void inicializar() {
		
		campo = new JTextArea();
		campo.setBounds(25, 80, 240, 170);
		campo.setLineWrap(true);
		add(campo);
		
		botonVolver = new JButton("Volver");
		botonVolver.setBounds(60, 30, 170, 20);
		add(botonVolver);

		
	}

	public JTextArea getCampo() {
		return campo;
	}

	public void setCampo(JTextArea campo) {
		this.campo = campo;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

}
