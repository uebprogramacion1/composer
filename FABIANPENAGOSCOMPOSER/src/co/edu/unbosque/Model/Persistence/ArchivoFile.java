package co.edu.unbosque.Model.Persistence;
import java.io.*;

import co.edu.unbosque.view.View;
public class ArchivoFile {
	

	
	public int escribirArchivo(String dato,String ruta) {
		
		File f=new File(ruta );
		
		try {
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			pw.println(dato);
			fw.close();
		}catch(IOException ioex) {
			return -1;
		}
		return 0;
	}
	public String leerArchivo(String ruta) {
		String linea="";
		String cadena="\n";
		File f=new File(ruta);
		
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			linea=br.readLine();
			while(linea!=null) {
				cadena+=linea+"\n";
				linea=br.readLine();
			}
				fr.close();
		} catch (IOException e) {
			return null;
		
		}
		return cadena;
	}
}
