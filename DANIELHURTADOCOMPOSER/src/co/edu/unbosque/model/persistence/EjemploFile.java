package co.edu.unbosque.model.persistence;

import java.io.*;

import javax.swing.JFileChooser;

public class EjemploFile {
	
	
	private String archivoData = "C:\\\\data\\\\datanumeros.txt" + 
			"";
	
	public int escribirArchivo(File direccion, String dato) {
		
		File f = new File(this.archivoData);
		
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println(dato);
			
			fw.close();
			
		}catch (IOException e) {
				return -1;
			}
			return 0;
	}
	
//	public String escribirArchivo(String resultado1) {
//		
//		JFileChooser algo = new JFileChooser();
//		
//		int numero = algo.showSaveDialog(null);
//		File archivo = algo.getSelectedFile();
//		System.out.print(archivo.getAbsolutePath());
//		return resultado1 + " Proceso en clase Fiile ";
//		
//		
//	}
	
		public String leerArchivo() {
			String linea = "";
			String cadena = "";
			File f = new File(this.archivoData);
			
			try {
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				linea = br.readLine();
				
				while (linea!= null) {
					cadena += linea;
					linea = br.readLine();
				}
				fr.close();
			}catch (IOException e) {
				return null;
			}
			return cadena;
		}

		
	}

