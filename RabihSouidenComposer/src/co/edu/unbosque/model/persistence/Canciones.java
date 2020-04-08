package co.edu.unbosque.model.persistence;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
public class Canciones{
	public int escribirArchivo(String dato,File data) {
		try {
			FileWriter filewriter = new FileWriter(data);
			PrintWriter printwriter = new PrintWriter(filewriter);
			printwriter.println(dato);
			filewriter.close();
		}catch(Exception e) {
			return -1;
		}
		return 0;
	}
		
	
	public String leerArchivo(File data ) {
		String linea="";
		String cadena="";
		try {
			FileReader filereader= new FileReader(data);
			BufferedReader bufferreader = new BufferedReader(filereader);
			linea = bufferreader.readLine();
			while(linea != null) {
				cadena += linea+"\n";
				linea = bufferreader.readLine();
			}
			filereader.close();
		}catch(Exception e) {
			return null;
		}
		return cadena;
	}
	
}

