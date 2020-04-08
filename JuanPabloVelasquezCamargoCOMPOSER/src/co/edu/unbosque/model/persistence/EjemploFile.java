package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploFile {

	// private String archivodata = "archivos\\Cancion.txt";

	public int escribirArchivo(File f, String dato) {

		try {
			FileWriter fw = new FileWriter(f, true); // fr -> Crea el flujo hacia f
			PrintWriter pw = new PrintWriter(fw); // pw -> Permite la escritura
			pw.println(dato); // se escribe el contenido del parámetro dato en el archivo
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}

//	public String leerArchivo() {
//		String linea = "";
//		String cadena = "";
//
//		File f = new File(this.archivodata); // f -> carga el archivo
//
//		try {
//			FileReader fr = new FileReader(f); // fr -> Crea el flujo desde f
//			BufferedReader br = new BufferedReader(fr); // br -> permite la lectura
//			linea = br.readLine(); // linea -> toma el valor de la primera linea leida
//			while (linea != null) { // mientras haya datos por leer en el archivo
//				cadena += linea; // acumular en cadena lo leido en linea
//				linea = br.readLine(); // leer el valor de la siguiente linea
//			}
//
//		} catch (IOException e) {
//			return null;
//		}
//		return cadena;
//
//}

}
