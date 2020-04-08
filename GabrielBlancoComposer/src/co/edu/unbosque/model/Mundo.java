package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.GabenFile;
import co.edu.unbosque.model.persistence.GabenProperties;

/**
 * @author Gabriel Blanco
 * Clase "multitoma" donde se define la solución de la problemática
 */
public class Mundo {
	private Cancion[] cancion = new Cancion[10];
	private GabenFile archivo = new GabenFile();
	private GabenProperties propiedad = new GabenProperties();
	private int cantLineas = 0;
	private int cantEstrofas = 0;
	
	public void nuevaCancion(String letra, String titulo) {
		for (int i = 0; i < cancion.length; i++) {
			if(cancion[i] == null) {
				cancion[i] = new Cancion(letra, titulo);
				break;
			}
		}
	}
	
	public String generarLetra() throws Exception {
		String letrafinal = "";
		String[] letra = archivo.leerArchivo("./docs/lib/cancion.csv").trim().split("\n");
		for (int i = 0; i < letra.length+1; i++) {
			String[] sincomma = letra[(int) (Math.random()*letra.length)].split(",");
			letrafinal += sincomma[i]+" ";
		}
		cantLineas = letra.length;
		cantEstrofas = 4;
		return letrafinal;
	}
	
	public Cancion[] getCancion() {
		return cancion;
	}

	public GabenFile getArchivo() {
		return archivo;
	}

	public GabenProperties getPropiedad() {
		return propiedad;
	}

	public int getCantLineas() {
		return cantLineas;
	}

	public int getCantEstrofas() {
		return cantEstrofas;
	}
}
