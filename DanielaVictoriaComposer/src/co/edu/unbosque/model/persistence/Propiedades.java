package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "cancion.properties";
	
	public int escribirPropiedades() {
		try {
			 
			prop.setProperty("Numerodelineaporestrofa", "4");
			prop.setProperty("Numerodeestrofaporcanción", "4");
			
			
			prop.store(new FileOutputStream(archivoprop), null);
			
			
		}catch(IOException e){
			
			return -1;
		}
		return 0;
	}
	public String leerPropiedades() {
		String linea="";
		
		return "";
	}
}