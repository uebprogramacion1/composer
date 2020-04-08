package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CancionFile {

	public int escribirArchivo(File f,String letraCancion) {
	
		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(letraCancion);
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

	public String leerArchivo(String file) {
		String linea = " ";
		String cadena = " ";
		File f = new File(file);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			cadena = linea;
			while (linea != null) {

				linea = br.readLine();
				if (linea != null) {
					cadena = cadena + "\n" + linea;
				}
			}
			fr.close();
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}

}
