package co.edu.unbsoque.Model.persistence;

import java.io.*;

import javax.swing.JFileChooser;

import co.edu.unbosque.View.*;

public class EjemploFile {
	
	public String archivodata = "Cancion.txt";
	public int escribirArchivo(File f,String dato) {
		
		
		try {
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
		
			pw.println(dato);
			
			fw.close();
			
		
		}catch (IOException e) {
			return -1;
			
		}
		return 0;
	}
	
	public String leerArchivo() {
		
		String linea= "";
		String cadena = "";
		
	File f = new File(this.archivodata);
	
	try {
	    FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		linea = br.readLine();
		while(linea!=null) {
		cadena += linea;
		linea = br.readLine();
		
	}
	fr.close();
		
	}
	catch (IOException e) {
		return null;
	}
     return cadena;
}

}
