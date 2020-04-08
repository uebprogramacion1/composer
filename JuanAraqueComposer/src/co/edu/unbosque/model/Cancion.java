package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.*;


public class Cancion {
	Frases frases;
	Archivo archivo;
	Propiedades prop;
	public Cancion() {
		frases= new Frases();
		archivo=new Archivo();
		prop= new Propiedades();
		prop.escribirPropiedades();
	}
	public Frases getFrases() {
		return frases;
	}
	public void setFrases(Frases frases) {
		this.frases = frases;
	}
	public Archivo getArchivo() {
		return archivo;
	}
	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
	public Propiedades getProp() {
		return prop;
	}
	public void setProp(Propiedades prop) {
		this.prop = prop;
	}
	
	
}
