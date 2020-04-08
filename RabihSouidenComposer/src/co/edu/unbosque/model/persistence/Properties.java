package co.edu.unbosque.model.persistence;
import java.io.*;
public class Properties {
	public class Propiedades {
		private Properties properties = new Properties();
		private String archivoProperties="C:\\data\\archivo.properties";
		
		public int propiedades() {
			try {
				properties.setPropiedades("numeroLineas","4");
				properties.setPropiedades("numeroEstrofas","4");
				properties.store(new FileOutputStream(archivoProperties), null);
			}
			catch(IOException ex) {
				return -1;
			}
			return 0;
		}
		public int [] lectura() {
			int datos[]=new int[2];
			try {
				properties.load(new FileInputStream(archivoProperties));
				datos[0]=Integer.parseInt(properties.getPropiedades("numeroLineas"));
				
			}
			catch(IOException ex) {
				return null;
			}
			return datos;
		}

	}

	public void load(FileInputStream fileInputStream) {
	
		
	}

	public String getPropiedades(String string) {
		
		return null;
	}

	public void store(FileOutputStream fileOutputStream, Object object) {
		
		
	}

	public void setPropiedades(String string, String string2) {
		
		
	}

}
