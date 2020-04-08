package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Modelo;

public class Propiedades {

	String cancion;

	private Properties prop = new Properties();
	private String archivoprop = "c:\\cancion\\Regueton.properties";

	public int escribirPropiedades() {
		try {
			prop.setProperty("composicion", cancion);
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
			linea += "Canción Reguetón :" + prop.getProperty("composicion") + "\n";

		} catch (IOException e) {

			return null;
		}
		return linea;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

}
