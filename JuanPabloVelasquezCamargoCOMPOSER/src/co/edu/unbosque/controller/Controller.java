package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Archivo archivo;
	private View gui;

	public Controller() {

		archivo = new Archivo();
		gui = new View();
		String letra = archivo.escribirCancion();
		gui.getPanelResultados().mostrarResultado(letra);
		gui.getPanelEntrada().getBtonGenerar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getActionCommand().equals("Guardar")) {
			archivo.guardarCancion(gui.FileChooser());
		}

	}

}
