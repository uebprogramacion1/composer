package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Canciones;
import co.edu.unbosque.model.persistence.Frases;

public class Cancion {
	Canciones cancion;
	Frases frases;
	public Canciones getCancion() {
		return cancion;
	}
	public void setCancion(Canciones cancion) {
		this.cancion = cancion;
	}
	public Frases getFrases() {
		return frases;
	}
	public void setFrases(Frases frases) {
		this.frases = frases;
	}

}
