package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
		
	
	private Properties prop = new Properties();
	private String archivoprop = "Archivos.propierties";

	public int escribirPropiedades() {
		
		try {
			

			prop.setProperty("numerodeLineas", "4");
			prop.setProperty("numerodeEstrofas","4");
			prop.store(new FileOutputStream(archivoprop),null);
			
		} catch (IOException e) {
			return -1;
		}return 0;
		
		}
	
	public int leerPropiedadesLineas() {
		
		int numeroLineas;
		
		
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			
			numeroLineas = Integer.parseInt(prop.getProperty("numerodeLineas"));
		} catch (IOException e) {
		
			return -1;
		}
		
		return numeroLineas;
		
		
		
	}
   public int leerPropiedadeEstrofas() {
		
		int numeroEstrofas;
		
		
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			
			numeroEstrofas = Integer.parseInt(prop.getProperty("numerodeEstrofas"));
		} catch (IOException e) {
		
			return -1;
		}
		
		return numeroEstrofas;
		
		
		
	}
	
	
	
		
		
}
