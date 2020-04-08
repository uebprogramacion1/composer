package co.edu.unbosque.model.persistence;
import java.io.*;


public class Archivo{
	public int escribirArchivo(String dato,File f) {
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(dato);
			fw.close();
		}catch(Exception e) {
			return -1;
		}
		return 0;
	}
	public String leerArchivo(File f) {
		String linea="";
		String cadena="";
		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while(linea != null) {
				cadena+= linea+"\n";
				linea = br.readLine();
				}
				
			fr.close();
		}catch(Exception e) {
			return null;
		}
		return cadena;
	}
}

