package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.Canciones;
import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	Frases frases;
	Canciones canciones;
	View view;
	public Controller() {
		frases = new Frases();
		canciones = new Canciones();
		view = new View();
		view.panelCrear.botonCrear.addActionListener(this);
		view.panelCrear.botonAbrir.addActionListener(this);
		
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(view.panelCrear.getBotonCrear())) {
				File f=view.guardarArchivo();
				canciones.escribirArchivo(frases.crearCancion(),f);
				String auxCrear = canciones.leerArchivo(f);
				view.panelCrear.campo.setText(auxCrear);
			}
			if(e.getSource().equals(view.panelCrear.getBotonAbrir())) {
				String auxCrear = canciones.leerArchivo(view.guardarArchivo());
				view.panelCrear.campo.setText(auxCrear);
			}
		}
}
