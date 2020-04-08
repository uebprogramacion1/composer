package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.model.Frases;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private EjercicioArchivo archivo;
	private View gui;
	private Frases frases;
	private File EjemploFile;

	public Controller() {
		frases = new Frases();
		archivo = new EjercicioArchivo();
		gui = new View();
		gui.getPanel().getBoton_mostrar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals("Crear")) {
			String resultado1 = archivo.escribirCancion();
			gui.getPanel().mostrarResultado(resultado1);

			


			
		}
	}

}

