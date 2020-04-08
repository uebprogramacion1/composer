package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.view.View;


public class Controller  {
	
	private View v;
	private Cancion c;

	
	public Controller(){
		
		v = new View();
		c = new Cancion();
		
		c.crearPropiedades();
		c.buscarpropiedades();
		String aux = c.crearCancion();
		c.guardarCancion(aux,v.archivo());
		v.panel_1.getSalida().setText(aux);
		

	}


	
}
    
		



