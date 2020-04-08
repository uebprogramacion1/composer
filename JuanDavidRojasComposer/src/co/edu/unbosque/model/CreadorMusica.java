package co.edu.unbosque.model;

import java.io.File;
import java.util.Random;

import co.edu.unbosque.model.persistence.ArchivoProperties;
import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.FrasesRegueton;

public class CreadorMusica {
	
	
	
	private String linea;
	
	private String estrofa;
	
	private FrasesRegueton frases;
	 
	private ArchivoProperties prop;
	
	
	private EjemploFile archivo;
	
	
	
	public CreadorMusica() {
		
		frases = new FrasesRegueton();
		prop=new ArchivoProperties();
		archivo= new EjemploFile();
		estrofa="";
		linea="";
		
		
	}
	
	
	
	public String estrofa() {
		
		
		

		for(int j=0;j<prop.getNumeroEstrofas();j++) {
			
			
		for (int i=0;i<prop.getNumeroLineas();i++) {    
		
		 linea= frases.getFrases1()[random()]+" "+frases.getFrases2()[random()]+" "+frases.getFrases3()[random()]+" "+frases.getFrases4()[random()]+" "+frases.getFrases5()[random()]+" "+frases.getFrases6()[random()];
		 estrofa += linea+"\n";
		
		
		   }
		estrofa= estrofa+"\n";
		
		
		
		}
		return estrofa;
        		
		
	}
	
	public int random() {
		Random r = new Random();
		int r1 = r.nextInt(4) ;
		
		return r1;
	}
		
	
		
		
	
	
	public String gestionarCancion(File f) {
		
	
		archivo.escribirArchivo(estrofa,f);
		return archivo.leerArchivo(f);
		
	}
	
	public String buscarCancion(File f) {
		
		return archivo.leerArchivo(f);
		
		
		
	}

	public void crearPropiedades() {
		
		prop.escribirPropiedades();
		
		
	}
	
	public String buscarPropiedades() {
		
	
	
	return prop.leerPropiedades();
		
		
		
	}


}
