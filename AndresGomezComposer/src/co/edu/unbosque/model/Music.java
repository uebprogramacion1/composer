package co.edu.unbosque.model;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JOptionPane;


import co.edu.unbosque.model.persintence.Frases;
import co.edu.unbosque.model.persintence.Propiedades;
import co.edu.unbosque.view.InterfazGui;

public class Music {
	
	private int Nlineas;
	private int Nestrofas;
	
	Frases fr;
	Propiedades prop;
	InterfazGui gui;
	
 
	
	
	
	public Music() {
		fr=new Frases();
		gui=new InterfazGui();
		prop=new Propiedades();
		prop.escribirPropiedades();
		Nlineas=prop.leerpropiedadesLinea();
		Nestrofas=prop.leerpropiedadeEstrofa();
		
		
		
	}
	
	
	
public String SacarFrase() {
		
		
		int posicion1=(int)(Math.random()*4);
		int posicion2=(int)(Math.random()*4);
		int posicion3=(int)(Math.random()*4);
		int posicion4=(int)(Math.random()*4);
		int posicion5=(int)(Math.random()*4);
		int posicion6=(int)(Math.random()*4);
		
		String frase;
		
		 frase= fr.getParte1()[posicion1]+" "+fr.getParte2()[posicion2]+" "+fr.getParte3()[posicion3]+" "+fr.getParte4()[posicion4]+" "+fr.getParte5()[posicion5]+"  "+fr.getParte6()[posicion6];
		
		return frase;
	
		
		
		
	}
	
	public String SacarEstrofas() {
		
		String estrofa;
		
		
		estrofa="";
		
		for (int i = 0; i < Nlineas ; i++) {
			
			estrofa +=SacarFrase()+"\n";
		}
		
		
		
		estrofa+="\n";
		return estrofa;
		
	}
	
	public String CrearCancion() {
		
		String cancion;
		cancion="";
		for (int i = 0; i <Nestrofas ; i++) {
			
			cancion =cancion  + SacarEstrofas()+"\n";
			
		}
		
		
		crearArchivo(cancion);
		JOptionPane.showMessageDialog(null, cancion);
		
		return cancion;
		
	}
	
	
public void crearArchivo(String cancion) {
		
		
		
		File f=new File(gui.gestionarArchivo().getAbsolutePath());
		
		try {
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			
			pw.println(cancion);
			fw.close();
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "archivo creado");
		
	}  





	
}
	
	
	
	
	


