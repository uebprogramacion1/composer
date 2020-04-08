package co.edu.unbosque.model;

import java.io.File;
import java.util.Random;

import co.edu.unbosque.model.persistence.Cancion_Properties;
import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.model.persistence.Frases;

public class Cancion {

	private String frase;
	private String Estrofa;
	private Frases oracion;
	private Cancion_Properties prop;
	private ArchivoFile c;
	
	
	
	
public Cancion (){
	frase = "";
	Estrofa = "";
	oracion = new Frases();
	prop = new Cancion_Properties();
	c = new ArchivoFile();
}
public String estrofa(){
	
	for(int i=0; i<prop.getLineas() ; i++){
		frase = oracion.getParte1()[random()]+" "+oracion.getParte2()[random()]+" "+oracion.getParte3()[random()]+" "+oracion.getParte4()[random()]+" "+oracion.getParte5()[random()]+" "+oracion.getParte6()[random()];
		Estrofa += frase + "\n";
}
	
	return Estrofa;
}
public int random(){
 Random r = new Random();
 int n = r.nextInt(4);
return n;
}
public String crearCancion(){
	System.out.println("f");
	for(int i = 0;i<prop.getEstrofas();i++){
		
		System.out.println("a");
		Estrofa = estrofa()+"\n";
		
		
	}
	
	
	return Estrofa;
}
public void guardarCancion(String a ,File f){
	
	c.escribirArchivo(a,f);
	
}
public void crearPropiedades(){
	prop.escribirPropiedades();
	}
public String buscarpropiedades(){
	return prop.leerPropiedades();
}
public String getFrase() {
	return frase;
}
public void setFrase(String frase) {
	this.frase = frase;
}
public String getEstrofa() {
	return Estrofa;
}
public void setEstrofa(String estrofa) {
	Estrofa = estrofa;
}
public Frases getOracion() {
	return oracion;
}
public void setOracion(Frases oracion) {
	this.oracion = oracion;
}
public Cancion_Properties getProp() {
	return prop;
}
public void setProp(Cancion_Properties prop) {
	this.prop = prop;
}
public ArchivoFile getC() {
	return c;
}
public void setC(ArchivoFile c) {
	this.c = c;
}




}