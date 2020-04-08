package co.edu.unbosque.model;

import javax.swing.JFileChooser;

import co.edu.unbosque.model.persistence.EjemploPeristencia;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {
	
	private EjemploPeristencia persistencia;

	public String gestionarArchivoCancion() {

		String parrafo = "";

		EjemploPeristencia frase1 = new EjemploPeristencia();
		EjemploPeristencia frase2 = new EjemploPeristencia();
		EjemploPeristencia frase3 = new EjemploPeristencia();
		EjemploPeristencia frase4 = new EjemploPeristencia();

		parrafo += (frase1.fraseCancion() + "\n" + frase2.fraseCancion() + "\n" + frase3.fraseCancion()
				+ "\n" + frase4.fraseCancion());

		return parrafo;
	}
	public void agregarCancion(String a,JFileChooser chooser) {
		persistencia.escribirArchivo(gestionarArchivoCancion(),chooser);
	}
	public String gestionarPropiedades() {

		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();

		return prop.leerPropiedades();
	}
}