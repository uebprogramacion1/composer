package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import co.edu.unbosque.model.CreadorMusica;
import co.edu.unbosque.view.View;



public class Controller implements ActionListener {
	
	
	
	
	public View ventana;
	public CreadorMusica cm;

	

	
	
	public Controller() {
		
		
		cm= new CreadorMusica();
		ventana= new View();
		ventana.getPanel_1().getCrear().addActionListener(this);
		ventana.getPanel_1().getBuscar().addActionListener(this);
		
		

		
		
		
		
		
		
		
		
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand().equals("Crear cancion y guardarla")) {
			
			cm.crearPropiedades();
			cm.buscarPropiedades();
			cm.estrofa();		
			ventana.getPanel_1().getCancion().setText(cm.gestionarCancion(ventana.fileChooser()));

			
			
		}else if(e.getActionCommand().equals("Buscar cancion")) {	
			
			ventana.getPanel_1().getCancion().setText(cm.buscarCancion(ventana.fileChooser()));
			
		}
		
		
		
	
		
	}

	
	


}
