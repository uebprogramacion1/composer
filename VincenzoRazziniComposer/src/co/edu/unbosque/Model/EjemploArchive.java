package co.edu.unbosque.Model;

import java.io.File;

import co.edu.unbosque.Persistence.EjemploFile;
import co.edu.unbosque.Persistence.Frases;

public class EjemploArchive{
	
	private Frases	frases;
	
	public EjemploArchive(){
		frases = new Frases();
	}

	public void gestionarArchivocadena(File mandar) {
		
		EjemploFile archivo = new EjemploFile();
		
		archivo.escribirArchive(mandar, frases.leerArreglo());
	}
}

		
	
