package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propeties {

	private Properties prop= new Properties();
	private String archivoprop= "c:\\cancion\\cancion.properties";
	
	public int escribirPropiedades() {
		try {
			
			prop.setProperty("Númerodelineasporestrofa","4");
			prop.setProperty("Númerodeestrofasporcanción","4");
			prop.store(new FileOutputStream(archivoprop),null);
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea= "";
	
		try {
			prop.load(new FileInputStream(archivoprop));
			linea += "numero de lineas: "+ prop.getProperty("Númerodelineasporestrofa")+"\n";
			linea += "numero de lineas: "+ prop.getProperty("Númerodeestrofasporcanción")+"\n";

		} catch (IOException e) {
			return null;
		} 
		return linea;
	}
}
