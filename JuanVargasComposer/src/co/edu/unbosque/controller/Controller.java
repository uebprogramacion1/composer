package co.edu.unbosque.controller;

import co.edu.unbosque.model.Archivo;
import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Cancion cancion;
	private Archivo archivo;
	String completa;
	
	

	public Controller() {
		view = new View();
		cancion = new Cancion();
		archivo = new Archivo();
		
		completa = cancion.hacerEstrofa()+"\n"+cancion.hacerEstrofa()+"\n"+cancion.hacerEstrofa()+"\n"+cancion.hacerEstrofa();
		view.mostrar(completa);
		archivo.escribirCancion(completa);

	}
	
}

