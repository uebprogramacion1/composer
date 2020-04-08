package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private Properties prop = new Properties();
	private String archivoprop = "c:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "ArchivosTexto");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.Java");
			prop.setProperty("numeroDeLineas", "4");
			prop.store(new FileOutputStream(archivoprop), null);
			
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			linea += "nombre del Proyecto :" + prop.getProperty("nombreProyecto") + "\n";
			linea += "nombre del Archivo :" + prop.getProperty("nombreArchivo") + "\n";
			linea += "nombre de la Clase Java :" + prop.getProperty("nombreCodigoFuente") + "\n";
			linea += "numero De Lineas es :" + prop.getProperty("numeroDeLineas") + "\n";
			
		} catch (IOException e) {
			return null;
		}
		return linea;
	}

}
