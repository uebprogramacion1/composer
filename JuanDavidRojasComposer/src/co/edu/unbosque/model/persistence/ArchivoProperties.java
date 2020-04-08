package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ArchivoProperties {
	
	private int numeroLineas;
	private int numeroEstrofas;
	
	private  Properties prop = new Properties(); 
	private String archivoprop = ".\\archivo.properties";
	
	public int escribirPropiedades() {
		
		try {
			prop.setProperty("numeroLineas", "4");
			prop.setProperty("numeroEstrofas", "4");
			prop.store(new FileOutputStream(archivoprop), null);
			
			
		}catch(IOException e) {
			
			
			return -1;
			
		}
		
		                           
		return 0;
		
		
	}
	
	public String leerPropiedades() {
		
		String linea = "";
		
		
		try {
		
			
			prop.load(new FileInputStream(archivoprop));
			linea+="Numero de lineas por estrofa: "+prop.getProperty("numeroLineas")+"\n";
			linea+="Numero de estrofas en la cancion: "+prop.getProperty("numeroEstrofas")+"\n";
			 numeroLineas = Integer.parseInt(prop.getProperty("numeroLineas"));
			 numeroEstrofas = Integer.parseInt(prop.getProperty("numeroEstrofas"));
			
		}catch(IOException e) {
			
			return null;
			
			
		}
			
		return linea;
	
	}

	public int getNumeroLineas() {
		return numeroLineas;
	}

	public void setNumeroLineas(int numeroLineas) {
		this.numeroLineas = numeroLineas;
	}

	public int getNumeroEstrofas() {
		return numeroEstrofas;
	}

	public void setNumeroEstrofas(int numeroEstrofas) {
		this.numeroEstrofas = numeroEstrofas;
	}
	
	
	

}
