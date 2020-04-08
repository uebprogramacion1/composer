package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	Cancion cancion;
	View view;
	public Controller() {
		cancion= new Cancion();
		view = new View();
		view.getPanelCancion().botonCrear.addActionListener(this);
		view.getPanelCancion().botonAbrir.addActionListener(this);
		
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(view.getPanelCancion().getBotonCrear())) {
				File f=view.guardarArchivo();
				cancion.getArchivo().escribirArchivo(cancion.getFrases().crearCancion(cancion.getProp().leerPropiedades()),f);
				String auxCrear = cancion.getArchivo().leerArchivo(f);
				view.getPanelCancion().getCampoTexto().setText(auxCrear);
			}
			if(e.getSource().equals(view.getPanelCancion().getBotonAbrir())) {
				String auxCrear = cancion.getArchivo().leerArchivo(view.guardarArchivo());
				view.getPanelCancion().getCampoTexto().setText(auxCrear);
			}
		}
}
