package co.edu.unbosque.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propeties;

public class Canciones {
	
	public String titulo() {
		Frases frases= new Frases();
		frases= new Frases();
		return frases.darPalabra3()+" "+frases.darPalabra6();
	}
	public String  frase1() {
		Frases frases= new Frases();
		frases= new Frases(); 
		return frases.darPalabra1()+" "+frases.darPalabra2()+" "+
				frases.darPalabra3()+" "+frases.darPalabra4()+ " "
				+ frases.darPalabra5()+" "+frases.darPalabra6();
	}

	public String  frase2() {
		Frases frases= new Frases();
		frases= new Frases(); 
		return frases.darPalabra1()+" "+frases.darPalabra2()+" "+
				frases.darPalabra3()+" "+frases.darPalabra4()+ " "
				+ frases.darPalabra5()+" "+frases.darPalabra6();
	}
	public String  frase3() {
		Frases frases= new Frases();
		frases= new Frases(); 
		return frases.darPalabra1()+" "+frases.darPalabra2()+" "+
				frases.darPalabra3()+" "+frases.darPalabra4()+ " "
				+ frases.darPalabra5()+" "+frases.darPalabra6();
	}
	public String  frase4() {
		Frases frases= new Frases();
		frases= new Frases(); 
		return frases.darPalabra1()+" "+frases.darPalabra2()+" "+
				frases.darPalabra3()+" "+frases.darPalabra4()+ " "
				+ frases.darPalabra5()+" "+frases.darPalabra6();
	}
	public String agregarCancion() {
		
	String dar= "";
	
	dar= titulo()+"\n"+"\n"+frase1()+"\n"+frase2()+"\n"+frase3()+"\n"+frase4()
	+"\n"+"\n"+frase1()+"\n"+frase2()+"\n"+frase3()+"\n"+frase4()
	+"\n"+"\n"+frase1()+"\n"+frase2()+"\n"+frase3()+"\n"+frase4()
	+"\n"+"\n"+frase1()+"\n"+frase2()+"\n"+frase3()+"\n"+frase4();
		return dar;
	}
	
	public void agregar(String f,JFileChooser chooser) {
		escribirArchivo(agregarCancion(),chooser);
	}
	
	
	public int escribirArchivo(String dato, JFileChooser chooser) {
	
	File f= chooser.getSelectedFile();
	
	try {
		
		FileWriter fw= new FileWriter(f, true);
		PrintWriter pw= new PrintWriter(fw);
		
		pw.print(dato+"\n");
		fw.close();
	} catch (IOException E) {
		return -1;
	}
	return 0;
}

	public String gestionarPropiedades() {
		Propeties  prop= new Propeties();
		prop.escribirPropiedades();
		return prop.leerPropiedades();
	} 
}

