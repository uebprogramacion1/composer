package co.edu.unbosque.model;

import java.io.IOException;

import co.edu.unbosque.persistence.ArchivoFile;
import co.edu.unbosque.persistence.PropiedadesProp;

public class Mundo {
	private Palabras palabras = new Palabras();
	private ArchivoFile archivo = new ArchivoFile();
	private PropiedadesProp propiedad = new PropiedadesProp();
 public String gestionarArchivoCadena() throws IOException{
	 
	 archivo.escribirArchivo("dato de tipo String", "./docs/mon.dat");
	 return "lei este dato: " + archivo.leerArchivo("./docs/mon.dat");
	 }
public ArchivoFile getArchivo() {
	return archivo;
}
public Palabras getPalabras() {
	return palabras;
}
public PropiedadesProp getPropiedad() {
	return propiedad;
}
 
}
