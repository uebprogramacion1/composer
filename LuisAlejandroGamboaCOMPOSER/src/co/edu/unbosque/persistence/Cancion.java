package co.edu.unbosque.persistence;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class Cancion {




	private String archivodata = ".\\cancion.txt";
	
	public int escribirArchivos(File f, String dato) {
		
		
		
		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw= new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
		}catch(IOException e) {
			return -1;
		}
		
		return 0;
	}
	
	public String leerArchivo() {
		String linea = "";
		String cadena = "";
		
		File f = new File(this.archivodata);
		
		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				cadena += linea+"\n";
			linea = br.readLine();
		}
		fr.close();
	}
	catch(IOException e) {
		return null;
	}
		return cadena;
		
	}

}

