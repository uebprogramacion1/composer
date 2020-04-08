package co.edu.unbosque.model;



import java.io.File;

import co.edu.unbosque.model.persistence.EjemploFile;

public class EjercicioArchivo {
	
	private Frases frases;
	private String linea;
	private String parrafo;
	EjemploFile archivo = new EjemploFile();
	
	public EjercicioArchivo() {
		 frases  = new Frases();
		 linea =   "";
		 parrafo =   "";
	}

	
	public String gestionarArchivoCadena(String resultado1) {
		
		archivo.escribirArchivo(null, resultado1);
		return (archivo.leerArchivo());
	}	
	
	public int numeroAleatorio() {
		int numeroAleatorio = (int) (Math.random()*(4));
		return numeroAleatorio;
	}
	
	private String escribirParrafo() {
		String palabra = "";
		
		
		for(int i=0; i<4 ; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 6; k++) {
					palabra = frases.mostrarValor(numeroAleatorio(), k);
					
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

	public String getOracion() {
		return linea;
	}

	public void setOracion(String oracion) {
		this.linea = oracion;
	}

	public String getParrafos() {
		return parrafo;
	}

	public void setParrafos(String parrafos) {
		this.parrafo = parrafos;
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
