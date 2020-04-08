package co.edu.unbosque.Model;

import java.io.File;

import co.edu.unbsoque.Model.persistence.*;

public class EjercicioArchivo {
	
	private Palabras palabras;
	
	public EjercicioArchivo() {
		palabras = new Palabras();
	}

	public void gestionarArchivocadena(File direccion) {
		
		EjemploFile archivo = new EjemploFile();
		
		//*archivo.escribirArchivo(palabras);
		//*return archivo.leerArchivo();
		
		archivo.escribirArchivo(direccion, palabras.leerArreglos());
	}
}
