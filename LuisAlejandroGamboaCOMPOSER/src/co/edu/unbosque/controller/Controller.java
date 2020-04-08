package co.edu.unbosque.controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Archivo1;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	public View v;
	public Archivo1 arch_1;
	String aux= "";
	
	public Controller() {
		
		v = new View();
		arch_1 = new Archivo1();
		v.panel_cancion.boton_crear.addActionListener(this);
		String letracan = arch_1.procesarDato();
		v.panel_cancion.campo_cancion.setText(letracan);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Crear")) {
			arch_1.guardarCancion(v.fileChooserGurdar()); 
			
			arch_1.gestionarPropiedades();
		
		}
		
	}
	
	
	

}
