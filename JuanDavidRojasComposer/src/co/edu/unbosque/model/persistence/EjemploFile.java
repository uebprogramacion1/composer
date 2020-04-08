package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;

public class EjemploFile {
	

	 
	
	public int escribirArchivo(String dato,File f) {
		

		
		
		try {
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(dato);
			
			fw.close();
			
		}catch(IOException e) {
			
			return -1;
			
		}
		
		return 0;
		
	}
	
	public String leerArchivo(File f) {
		
		String linea = "";
		String cadena = "";
		

		
		try {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea=br.readLine();
			while (linea != null) {
				cadena+= linea+"\n";
				linea = br.readLine();
				
			}
			
			fr.close();
			
			
		}catch(IOException e) {
			return null;
		}
		return cadena;
		
		
		
		
		
	}
}
