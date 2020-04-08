package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreCancion", "Perreo Intenso");
			prop.setProperty("cantidadParrafos", "4");
			prop.setProperty("nombreCodigoFuente", "Propiedades.java");

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

			linea += "Nombre de la Cancion: " + prop.getProperty("nombreCancion") + "\n";
			linea += "Cantidad de Parrafos: " + prop.getProperty("cantidadParrafos") + "\n";
			linea += "Nombre de la Clase Java: " + prop.getProperty("nombreCodigoFuente") + "\n";
			
		} catch (IOException e) {
			return null;
		}
		return linea;
	}

}
