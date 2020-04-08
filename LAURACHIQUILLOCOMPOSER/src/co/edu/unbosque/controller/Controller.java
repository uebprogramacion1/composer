package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Canciones;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.View2;

public class Controller implements ActionListener{

	
	private View ventana;
	private View2 ven;
	private Canciones cancion;
	
	public Controller() {
		ventana= new View();
		cancion= new Canciones();
		ventana.getMostrar().addActionListener(this);
		ventana.getGuardar().addActionListener(this);
		ventana.getDar().addActionListener(this);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		for (int i = 0; i < 4; i++) {
			
			if (e.getActionCommand().equals("Mostrar")) {			
				ventana.getLeer().setText(cancion.agregarCancion());
			}
		}
		
		if (e.getActionCommand().equals("Guardar")) {
				ventana.salvar();
				cancion.agregar(cancion.agregarCancion(),ventana.getFc());
		}
		if (e.getActionCommand().equals("Dar")) {
				
				ven= new View2();
				ventana.setVisible(false);
				ven.getPanel().getLeer().setText(cancion.gestionarPropiedades());
			}
	}
}
