package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;


public class EjemploPeristencia {
	
	private String archivodata = "C:\\data\\cancionregueton.txt";    
	
	private String frase1[] = {"Mami", "Bebe", "Princess", "Bebecita"};
	private String frase2[] = {"yo quiero", "yo puedo", "yo vengo a", "yo voy a"};
	private String frase3[] = {"encendelte", "hacelte el favol", "ligal", "hacerte mia"};
	private String frase4[] = {"suave", "lento", "rapido", "fuerte"};
	private String frase5[] = {"hasta que salga el sol", "toda la noche", "hasta el amanecer", "todo el dia"};
	private String frase6[] = {"sin anestesia", "sin compromiso", "feis to feis", "sin miedo"};
	
	public String fraseCancion(){
		
		String fraseResultado = "";
		
		for (int i = 0; i < 4; i++) {
			
			int aleatorio1 = (int)(Math.random() * frase1.length);
			int aleatorio2 = (int)(Math.random() * frase2.length);
			int aleatorio3 = (int)(Math.random() * frase3.length);
			int aleatorio4 = (int)(Math.random() * frase4.length);
			int aleatorio5 = (int)(Math.random() * frase5.length);
			int aleatorio6 = (int)(Math.random() * frase6.length);
			
			fraseResultado += frase1[aleatorio1] + " " + frase2[aleatorio2] + " " + frase3[aleatorio3] + " " + frase4[aleatorio4] + " " + frase5[aleatorio5] + " " + frase6[aleatorio6] + "\n";
		}	
		return fraseResultado;
	}
	public int escribirArchivo(String dato, JFileChooser chooser) {
		
		//File file = new File(this.archivodata);
		File f = chooser.getSelectedFile();
		
		
		try {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			fw.close();
			
		} catch (IOException e) {
			return -1;
		}
		return 0;
	}
	public String leerArchivo() {
		
		String linea = "";
		String cadena = "";
		
		File f = new File(this.archivodata);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			
			while (linea != null) {
				cadena += linea + "\n";
				linea = br.readLine();
			}
			fr.close();
			
		} catch (IOException e) {
			return null;
		}
		return cadena;
	}
}