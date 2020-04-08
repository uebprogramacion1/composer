package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.view.InterfazGUI;

public class Controller implements ActionListener {
	Frases f;
	
	InterfazGUI gui;
	
	
	public Controller() {
		f = new Frases();
		/*
		 * f.creaeFrase(); f.crearEstrofa(); f.crearCancion();
		 */
		gui = new InterfazGUI();
		gui.setVisible(true);
		gui.getButtgenerarC().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if (evento.getActionCommand().equals("Generar Cancion")) {
			
			f.crerArchivo(f.crearCancion());
			
		}
		
		
		
	}

}
