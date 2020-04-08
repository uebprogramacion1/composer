package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Cancion_Properties {
	
	private int lineas;
	private int estrofas;
	
	private Properties prop = new Properties();
	private String archivoprop = ".\\archivo.properties";
	
public int escribirPropiedades() {
		
		try {
			prop.setProperty("lineas", "4");
			prop.setProperty("estrofas", "4");
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
			linea+="Numero de lineas por estrofa: "+prop.getProperty("lineas")+"\n";
			linea+="Numero de estrofas en la cancion: "+prop.getProperty("estrofas")+"\n";
			 lineas = Integer.parseInt(prop.getProperty("lineas"));
			 estrofas = Integer.parseInt(prop.getProperty("estrofas"));
			
			
		}catch(IOException e) {
			
			return null;
			
			
		}
			
		return linea;
	
	}

	public int getLineas() {
		return lineas;
	}

	public void setLineas(int lineas) {
		this.lineas = lineas;
	}

	public int getEstrofas() {
		return estrofas;
	}

	public void setEstrofas(int estrofas) {
		this.estrofas = estrofas;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}
	
	

}
