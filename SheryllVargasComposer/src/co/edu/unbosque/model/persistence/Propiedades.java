package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "src\\configuracion.properties";
	
	public int escribirPropiedades(String n1, String n2) {
		try {
			
			prop.setProperty("Numerodelineasporestrofa", n1);
			prop.setProperty("Numerodeestrofaporcancion", n2);
			
			prop.store(new FileOutputStream(archivoprop),null);
			
		}catch(IOException e){
			
			return -1;
		}
		return 0;
	}
	public String leerPropiedades() {
		
		String linea= "";
		try {
		prop.load(new FileInputStream(archivoprop));
		linea += prop.getProperty("Numerodelineasporestrofa")+",";
		linea += prop.getProperty("Numerodeestrofaporcancion");
		}catch (IOException e) {
			return null;
		}
		return linea;
	}
	
	

}
