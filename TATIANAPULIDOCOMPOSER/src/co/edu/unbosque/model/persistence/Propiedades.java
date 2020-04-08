package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties prop;
	private String archivoProp ;

	public Propiedades() {
		prop = new Properties();
		archivoProp =".\\archivo.properties";
	}

	public int escribirPropiedades() {
		
		try {
			prop.setProperty("NumeroDeEstrofas","4");
			prop.setProperty("NumeroDeParrafos", "4");
			prop.store(new FileOutputStream(archivoProp), null);
	
		} catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {
		String linea = "";
		try {
			// leer el archivo de propiedades
			prop.load(new FileInputStream(archivoProp));
			// obtener las propiedades definidas
			prop.list(System.out);
			linea += "Numero de estrofas: "
					+ prop.getProperty("NumeroDeEstrofas") + "\n";
			linea += "Numero de parrafos"
					+ prop.getProperty("NumeroDeParrafos") + "\n";
		} catch (IOException e) {
			return null;
		}
		return linea;
	}

	public int leerPropiedadesParrafos() {
		int nParrafos = 0;
		try {
			// leer el archivo de propiedades
			prop.load(new FileInputStream(archivoProp));
			// obtener las propiedades definidas
			prop.list(System.out);
			nParrafos = Integer
					.parseInt(prop.getProperty("NumeroDeParrafos"));
		} catch (IOException e) {
			return 0;
		}
		return nParrafos;
	}

	public int leerPropiedadesEstrofas() {
		int nEstrofas = 0;
		try {
			// leer el archivo de propiedades
			prop.load(new FileInputStream(archivoProp));
			// obtener las propiedades definidas
			prop.list(System.out);
			nEstrofas = Integer
					.parseInt(prop.getProperty("NumeroDeEstrofas"));
		} catch (IOException e) {
			return 0;
		}
		
		return nEstrofas;
	}
}
