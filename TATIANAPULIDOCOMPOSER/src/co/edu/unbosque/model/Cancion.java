package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.CancionFile;
import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propiedades;

public class Cancion {

	private Frases frases;
	private String estrofa;
	private String parrafo;
	private int numeroEstrofas;
	private int numeroParrafos;

	public Cancion() {
		frases = new Frases();
		estrofa = "";
		parrafo = "";
		numeroEstrofas = 0;
		numeroParrafos = 0;
		verPropiedadesEstrofas();
		verPropiedadesParrafos();
	}

	private int aleatorio() {
		int a = (int) (Math.random() * 4);
		return a;

	}

	private String escribirParrafo() {
		String palabra = "";

		for (int i = 0; i < numeroParrafos; i++) {
			for (int j = 0; j < numeroEstrofas; j++) {
				for (int k = 0; k < 6; k++) {

					palabra = frases.mostrarValor(aleatorio(), k);

					estrofa += palabra;
					palabra = "";
				}
				parrafo += estrofa + "\n";
				estrofa = "";
			}
			parrafo = parrafo + "\n";
		}
		return parrafo;
	}

	public String escribirCancion() {
		String cancion = escribirParrafo();
		return cancion;

	}

	public void guardarCancion(File direccion) {
		CancionFile archivo = new CancionFile();
		archivo.escribirArchivo(direccion, parrafo);
	}

	public String mostrarCancion(String file) {
		CancionFile archivo = new CancionFile();
		return archivo.leerArchivo(file);
	}

	public void verPropiedadesEstrofas() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		numeroEstrofas = prop.leerPropiedadesEstrofas();

	}

	public void verPropiedadesParrafos() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		numeroParrafos = prop.leerPropiedadesParrafos();

	}

	public Frases getFrases() {
		return frases;
	}

	public void setFrases(Frases frases) {
		this.frases = frases;
	}

	public String getEstrofa() {
		return estrofa;
	}

	public void setEstrofa(String estrofa) {
		this.estrofa = estrofa;
	}

	public String getParrafo() {
		return parrafo;
	}

	public void setParrafo(String parrafo) {
		this.parrafo = parrafo;
	}

}
