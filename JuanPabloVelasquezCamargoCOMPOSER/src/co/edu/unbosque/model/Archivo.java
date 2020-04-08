package co.edu.unbosque.model;

import java.io.File;

import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propiedades;

public class Archivo {

	private Frases frases;
	private Propiedades propeties;
	private String linea;
	private String parrafo;
	private int parrafoprop;
	private int lineaprop;
	private EjemploFile archivo;

	public Archivo() {
		propeties = new Propiedades();
		frases = new Frases();
		linea = "";
		parrafo = "";
		parrafoprop = 0;
		lineaprop = 0;
		nParrafos();
		nEstrofas();
	}

	public int nAleatorio() {
		int numeroAleatorio = (int) (Math.random() * (4));
		return numeroAleatorio;
	}

	public void nParrafos() {
		propeties.escribirPropiedades();
		parrafoprop = propeties.leerParrafosPropeties();
	}

	public void nEstrofas() {
		propeties.escribirPropiedades();
		lineaprop = propeties.leerEstrofasPropeties();
	}

	private String escribirParrafo() {
		String palabra = "";

		for (int i = 0; i < parrafoprop; i++) {
			for (int j = 0; j < lineaprop; j++) {
				for (int k = 0; k < 6; k++) {
					palabra = frases.mostrarValor(nAleatorio(), k);

					linea += palabra;
					palabra = "";
				}
				parrafo += linea + "\n";
				linea = "";
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
		EjemploFile archivo = new EjemploFile();
		archivo.escribirArchivo(direccion, parrafo);
	}

	public Frases getFrases() {
		return frases;
	}

	public void setFrases(Frases frases) {
		this.frases = frases;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getParrafo() {
		return parrafo;
	}

	public void setParrafo(String parrafo) {
		this.parrafo = parrafo;
	}

	public EjemploFile getArchivo() {
		return archivo;
	}

	public void setArchivo(EjemploFile archivo) {
		this.archivo = archivo;
	}

}
