package co.edu.unbosque.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropiedadesProp {
private Properties property = new Properties();

	
	public void escribirPropiedad(String key, String value, String location, String comments) throws IOException {
		property.setProperty(key, value);
		property.store(new FileOutputStream(location), comments);
	}

	
	public String leerPropiedad(String location, String key) throws IOException {
		String linea = "";
		property.load(new FileInputStream(location));
		linea += property.getProperty(key);
		return linea;

	}

}
