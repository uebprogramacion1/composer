package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Creador;
import co.edu.unbosque.model.persistence.FrasesPersistencia;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	private Creador cre;
	private View gui;
	private FrasesPersistencia frape;
	
	String cancion;

	public Controller() {
		cre = new Creador();
		gui = new View();
		frape = new FrasesPersistencia();
		gui.getBotonok().addActionListener(this);
		gui.getBotongenerar().addActionListener(this);
		
		
		cancion = "REGUETON TIME"+"\n"+cre.crearCancion()+"\n"+cre.crearCancion()+"\n"+cre.crearCancion()+"\n"+cre.crearCancion()+"\n";
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Mostrar canción")) {	
			String aux = cre.crearCancion();
			
			gui.getTxtcancion().setText(cancion);
			
		}
		

		if(e.getActionCommand().equals("Generar canción")) {
			gui.ventanaSalvar();
			frape.escribirCancion(cancion, gui.getFc());
			
		}
	}

}