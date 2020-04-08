package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.Palabras;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.InterfazGUI;

public class Frases {
	
	InterfazGUI gui;
	Palabras pa;
	Propiedades prop;
	private String cancion;
	private int NumLineas;
	private int NumEstrofas;
	
	public Frases() {
		
		gui = new InterfazGUI();
		pa = new Palabras();
		prop = new Propiedades();
		prop.escribirPropiedades();
		NumLineas = prop.leerPropiedadesLineas();
		NumEstrofas = prop.leerPropiedadeEstrofas();
		
	}
	
	
	public String creaeFrase() {
		 
		    int frasesAleatorias = (int)(Math.random()*4);
		    int frasesAleatorias2 = (int)(Math.random()*4);;
		    int frasesAleatorias3 = (int)(Math.random()*4);;
		    int frasesAleatorias4 = (int)(Math.random()*4);;
		    int frasesAleatorias5 = (int)(Math.random()*4);;
		    int frasesAleatorias6 = (int)(Math.random()*4);;
		    String frase;
		    frase = pa.getPalabras1()[frasesAleatorias]+" "+pa.getPalabras2()[frasesAleatorias2]+" "+ pa.getPalabras3()[frasesAleatorias3]+" "+ pa.getPalabras4()[frasesAleatorias4]+" "+ pa.getPalabras5()[frasesAleatorias5]+" "+pa.getPalabras6()[frasesAleatorias6]; 
		    	
			
		
			return frase;
			
			
		
	}
	
	public String generarEstrofas() {
		String estrofa = " ";
		
		for (int i = 0; i < NumLineas; i++) {
			
			
			estrofa += creaeFrase() +"\n";
		}
		
	
		
		return estrofa;
	}
	
	public String cancionFinal() {
		cancion= " ";
		
		for (int i = 0; i < NumEstrofas; i++) {
			
			  cancion += generarEstrofas()+"\n";
			
		}
		generarArchivo(cancion);
		
 return cancion;
		
	}
	
	public int generarArchivo(String cancionf) {
		
		
		File f = new File(gui.generarArcivo().getAbsolutePath());
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(cancionf);
			fw.close();
		} catch (IOException e) {
			return -1;
		}
		JOptionPane.showMessageDialog(null, "archivo creado");
		return 0;
		
	}
	
	
	
	
	
	
	
	
}
