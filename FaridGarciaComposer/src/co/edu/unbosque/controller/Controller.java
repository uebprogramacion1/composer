package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import co.edu.unbosque.model.EjercicioCancionR;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.View2;

public class Controller implements ActionListener{
	
	private EjercicioCancionR cancionsasa;
	private View vista;
	private View2 vista2;

	
	public Controller() {
		cancionsasa = new EjercicioCancionR();
		vista = new View();
		vista2 = new View2();
		vista.panelCrear.getBotonCrear().addActionListener(this);
		vista.panelCrear.getBotonGuardar().addActionListener(this);
		vista.panelCrear.getBotonPropiedades().addActionListener(this);
		vista2.panelPropiedades.getBotonVolver().addActionListener(this);
	}
		
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(vista.panelCrear.getBotonCrear())) {
			String auxCrear = cancionsasa.gestionarArchivoCadena();
			vista.panelCrear.getCampo().setText("CANCION PA' PERREAR \n\n" + auxCrear);
		}else
			if (e.getSource().equals(vista.panelCrear.getBotonGuardar())) {
				
		}else
			if (e.getSource().equals(vista.panelCrear.getBotonPropiedades())) {
				vista.setVisible(false);
				vista2.setVisible(true);
		}else
			if (e.getSource().equals(vista2.panelPropiedades.getBotonVolver())) {
				vista2.setVisible(false);
				vista.setVisible(true);
			}
	}
}

