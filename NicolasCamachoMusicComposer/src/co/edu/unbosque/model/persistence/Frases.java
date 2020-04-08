package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Frases {
	private String ruta;
	private String cancion;
	private String newfrase;
	private String estrofa;
	private  String palabras1[] = {"MAMI","BEBE","PRINCES","MAMI"};
	private  String palabras2[] = {"YO QUIERO","YO PUEDO","YO VENGO A","VOY A"};
	private  String palabras3[] = {"ENCENDERTE","AMARTE","LIGAR","JUGAR"};
	private  String palabras4[] = {"SUAVE","LENTO","RAPIDO","FUERTE"};
	private  String palabras5[] = {"HASTA QUE SALGA EL SOL","TODA LA NOCHE","HASTA EL AMANECER","TODO EL DIA"};
	private  String palabras6[] = {"SIN ANESTECIA","SIN COMPROMISO","FEIS TO FEIS","SIN MIEDO"};

	public Frases() {
		
	}
	
	
	public String creaeFrase() {
		int aleatorio = (int)(Math.random()*4);
		int aleatorio1 = (int)(Math.random()*4);
		int aleatorio2 = (int)(Math.random()*4);
		int aleatorio3 = (int)(Math.random()*4);
		int aleatorio4 = (int)(Math.random()*4);
		int aleatorio5 = (int)(Math.random()*4);
		int aleatorio6 = (int)(Math.random()*4);


		
			newfrase = palabras1[aleatorio]+" "+palabras2[aleatorio1]+" "+palabras3[aleatorio2]+" "+palabras4[aleatorio3]+" "+palabras5[aleatorio4]+" "+palabras6[aleatorio5];
			System.out.println(newfrase);
		
		return newfrase;
		
	}
	public String crearEstrofa() {
		estrofa="";
		for(int x = 0 ; x<4 ; x++) {
			
			estrofa +=creaeFrase()+"\n";
			
		}
		
		estrofa += "\n";
		return estrofa;
		
	}
	public String crearCancion() {
		cancion ="";
		for(int x = 0 ; x<4 ; x++) {
			
			cancion +=crearEstrofa();
			System.out.println("");
		}
		JOptionPane.showMessageDialog(null, cancion);
		return cancion;
		
	}
	
	public void crerArchivo(String archivo) {
		ruta = "C:\\Cancion\\cancion.txt";
		File f = new File(this.ruta);
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
}
