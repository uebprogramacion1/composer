package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivoProp="C:\\data\\archivo.properties";
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("numeroLineas","4");
			prop.setProperty("numeroEstrofas","4");
			prop.store(new FileOutputStream(archivoProp), null);
		}
		catch(IOException ex) {
			return -1;
		}
		return 0;
	}
	public int [] leerPropiedades() {
		int datos[]=new int[2];
		try {
			prop.load(new FileInputStream(archivoProp));
			datos[0]=Integer.parseInt(prop.getProperty("numeroLineas"));
			datos[1]=Integer.parseInt(prop.getProperty("numeroEstrofas"));
		}
		catch(IOException ex) {
			return null;
		}
		return datos;
	}

}
