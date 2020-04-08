package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;

public class EjercicioCancionR {
	
	public String gestionarArchivoCadena() {
		
		Creador creador = new Creador();
		RegguetonPapiFile archivo = new  RegguetonPapiFile();
		
		archivo.escribirArchivo(creador.armarOracion() + creador.armarOracion() + 
								creador.armarOracion() + creador.armarOracion());
		return archivo.leerArchivo();  
	}
	
	public String gestionarPropiedades() {
		
		Propiedades prop = new Propiedades();
		
		prop.escribirPropiedades();
		return prop.leerPropiedades();
	}

}
