package co.edu.unbosque.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("numeroDeLineas", "4");
			prop.setProperty("numeroDeEstrofas", "4");
			
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch(IOException ex) {
			return-1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		linea += "Numero de lineas" + prop.getProperty("numeroDeLineas") + "\n";
		linea += "Numero de Estrofas" + prop.getProperty("numeroDeEstrofas") + "\n";
		
		int numerolineas = Integer.parseInt(prop.getProperty("numeroDeLineas"));
		int numeroestrofas = Integer.parseInt(prop.getProperty("numeroDeEstrofas"));
		System.out.println("Numero de lineas: " + numerolineas);
		System.out.println("Numero de estrofas: "+ numeroestrofas);
	
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
		return linea;
		
		
	}

}
