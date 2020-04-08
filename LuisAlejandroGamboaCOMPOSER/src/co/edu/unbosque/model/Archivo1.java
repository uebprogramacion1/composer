package co.edu.unbosque.model;

import java.io.File;
import java.util.Properties;

import co.edu.unbosque.persistence.Cancion;
import co.edu.unbosque.persistence.Propiedades;

public class Archivo1 {
	String Fila[] = {"Mami","yo quiero","encenderte","suave","hasta que salga el sol","sin anestesia"};
	String Fila1[] = {"bebe","yo puedo","amarte","lento","toda la noche","sin compromiso"};
	String Fila2[] = {"Princess","yo vengo a","ligar","rapido","hasta el amanecer","feis to feis"};
	String Fila3[] = {"Mami","voy a" ,"jugar","fuerte","todo el dia","sin miedo"};
	String dato = "";
	
	
	public Archivo1() {
		
		
		
	}
	
	public String procesarDato(){
		
		int aleatorio = (int)(Math.random()*6+0);
		for(int i = 0; i<17; i++) {
			for(int j = 0; j<7; j++) {
				aleatorio = (int)(Math.random()*6+0);
				if(j == 6)
				{
					dato = dato + Fila[aleatorio] + "\n";
				}else {
					dato = dato + Fila[aleatorio] + " ";
				}
			}
		}
		return dato;
	}
	
	
	//public String gestionarArchivo(){
		
		/*Cancion can = new Cancion();
		can.escribirArchivos(dato);
		return can.leerArchivo();
		*/
	
	public void guardarCancion(File direccion) {
		Cancion archivo = new Cancion();
		archivo.escribirArchivos(direccion,procesarDato());
	}
	
	public String gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		return prop.leerPropiedades();
	}

	public String[] getFila() {
		return Fila;
	}

	public void setFila(String[] fila) {
		Fila = fila;
	}

	
	

	

}
