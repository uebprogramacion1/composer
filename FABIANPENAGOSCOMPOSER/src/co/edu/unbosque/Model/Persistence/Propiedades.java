package co.edu.unbosque.Model.Persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Propiedades {

	private Properties prop=new Properties();
	String archivoprop="archivo.properties";
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "Archivos de texto");
			prop.setProperty("tipoArchivo", "Texto y propiedades");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.store(new FileOutputStream(archivoprop), null);
		}catch(IOException ioex) {
		
		return -1;
			
		}
		return 0;
	}
	public String leerPropiedades() {
		
		String linea="";
		try {
			prop.load(new FileInputStream(archivoprop));
			prop.list(System.out);
			linea+="Nombre del proyecto: "+prop.getProperty("nombreProyecto"+"\n");
			linea+="Tipo de archivo: "+prop.getProperty("tipoArchivo"+"\n");
			linea+="Nombre del archivo: "+prop.getProperty("nombreArchivo"+"\n");
		}catch(IOException ioex) {
			return null;
		}
		return linea ;
	}
}
