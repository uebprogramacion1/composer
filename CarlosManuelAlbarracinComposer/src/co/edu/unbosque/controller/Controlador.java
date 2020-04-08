package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Modelo;
import co.edu.unbosque.view.InterfazGUI;
import co.edu.unbosque.view.PanelResultados;

public class Controlador implements ActionListener {

	private InterfazGUI gui;
	private Modelo model;
	private String cancion;

	public Controlador() {

		model = new Modelo();
		gui = new InterfazGUI(this);
		gui.setVisible(true);
		cancion = model.getComposicion();

	}

	public void actionPerformed(ActionEvent evento) {

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Abrirtxt)) {

			gui.abrirArchivo();

		}

		if (evento.getActionCommand().equals(gui.getPanelEntrada().Abrirprop)) {

			gui.getPanelResultados().getTxtMonto().setText(model.getComposicionProp());

		}

		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {

			gui.getPanelResultados().getTxtMonto().setText(model.getComposicion());

			gui.setCancion(cancion);
			gui.guardarArchivo();

		}

	}

}
