package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private Cancion cancion;
	private View gui;
	
	public Controller() {
		
		cancion = new Cancion();
		gui = new View();
		
		gui.getPanel().getBotonCancion().addActionListener(this);
		gui.getPanel().getBotonGuardar().addActionListener(this);
		gui.getPanel().getBotonProp().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(gui.getPanel().getBotonCancion())) {
			String aux = "Perreo Intenso" + "\n\n" + cancion.gestionarArchivoCancion();
			gui.getPanel().getAreaCancion().setText(aux);
		}else if(e.getSource().equals(gui.getPanel().getBotonGuardar())) {
			gui.salvar();
			cancion.agregarCancion(cancion.gestionarArchivoCancion(), gui.getFc());
		}else if(e.getSource().equals(gui.getPanel().getBotonProp())) {
			gui.getPanel().getAreaCancion().setText(cancion.gestionarPropiedades());
		}
	}
}