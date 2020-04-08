package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.InterfazGUI;

public class Music {
	Propiedades pr;
	InterfazGUI gui;
	private String newfrase;
	private String cancion;
	private String estrofa;
	Frases f;
	public  Music() {
		f = new Frases();
		pr = new Propiedades();
		gui = new InterfazGUI();
	}

	public String creaeFrase() {
		int aleatorio = (int)(Math.random()*4);
		int aleatorio1 = (int)(Math.random()*4);
		int aleatorio2 = (int)(Math.random()*4);
		int aleatorio3 = (int)(Math.random()*4);
		int aleatorio4 = (int)(Math.random()*4);
		int aleatorio5 = (int)(Math.random()*4);
		int aleatorio6 = (int)(Math.random()*4);

		
		newfrase = f.getPalabras1()[aleatorio]+" "+f.getPalabras2()[aleatorio1]+" "+f.getPalabras3()[aleatorio2]+" "+f.getPalabras4()[aleatorio3]+" "+f.getPalabras5()[aleatorio4]+" "+f.getPalabras6()[aleatorio5]; 
		
		
		return newfrase;
		
	}
	public String crearEstrofa() {
		estrofa="";
		for(int x = 0 ; x<pr.leerPropiedadeslinea() ; x++) {
			
			estrofa +=creaeFrase()+"\n";
			
		}
		
		estrofa += "\n";
		return estrofa;
		
	}
	public String crearCancion() {
		cancion ="";
		for(int x = 0 ; x<pr.leerPropiedadesEstrofa() ; x++) {
			
			cancion +=crearEstrofa();
			System.out.println("");
		}
		
		
		return cancion;
		
	}
	
	public void crerArchivo(String cancion) {

		File f = new File(gui.gestionarArchivo().getAbsolutePath());
		
		try {
			
		
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(cancion);
			fw.close();
		
		} catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e.getMessage());
		}
		JOptionPane.showMessageDialog(null, "archivo creado");
	}
	public int gestionarPropiedades() {
		Propiedades prop = new Propiedades();
		prop.escribirPropiedades();
		return prop.leerPropiedadeslinea();
		
	}
	
}
