package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
    
public class Propiedades {
	private int numerodelineas;
	private int numerodeestrofa;
	private Properties prop = new Properties();
	private String archivoprop =  "Archivo.properties";

	
	public int escribirPropiedades() {
		try {
			prop.setProperty("numerolineas", "4");
			prop.setProperty("numerodeestrofas", "4");
			
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch(IOException ex){
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			
			linea += "estrofas:"+prop.getProperty("numerodeestrofas")+"\n";
			linea += "numero de lineas"+prop.getProperty("numerolineas")+"\n";
			numerodelineas = Integer.parseInt(prop.getProperty("numerolineas"));
			numerodeestrofa = Integer.parseInt(prop.getProperty("numerodeestrofas"));
			
		}
		catch (IOException ex) {
			return null;
			
		}
		
		return linea;
	}
	public int leerPropiedadeslinea() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			
			
			linea += "numero de lineas"+prop.getProperty("numerolineas")+"\n";
			numerodelineas = Integer.parseInt(prop.getProperty("numerolineas"));
		
		}
		catch (IOException ex) {
			return 0;
			
		}
		
		return numerodelineas;
	}
	public int leerPropiedadesEstrofa() {
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			
			linea += "estrofas:"+prop.getProperty("numerodeestrofas")+"\n";
			
			numerodeestrofa = Integer.parseInt(prop.getProperty("numerodeestrofas"));
			
		}
		catch (IOException ex) {
			return 0;
			
		}
		
		return numerodeestrofa;
	}
	
	
	
	
}
 