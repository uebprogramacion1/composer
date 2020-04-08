package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Cancion cancion;
	private View gui;

	public Controller() {

		gui = new View(this);
		cancion = new Cancion();
		String letra = cancion.escribirCancion();
		gui.getPanelMostrarCancion().mostrarResultado(letra);

	}

	@Override
	public void actionPerformed(ActionEvent a) {

		if (a.getSource().equals(
				gui.getPanelMostrarCancion().getGuardarCancion())) {

			cancion.guardarCancion(gui.fileChooserGuardar());

		} else if (a.getSource().equals(
				gui.getPanelMostrarCancion().getMostrarCancion())) {
			gui.getPanelMostrarCancion().mostrarResultado("");
			gui.getPanelMostrarCancion().mostrarResultado(
					cancion.mostrarCancion(gui.fileChooserAbrir()));

		}
	}

}
