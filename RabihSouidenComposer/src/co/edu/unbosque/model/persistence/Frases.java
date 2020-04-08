package co.edu.unbosque.model.persistence;

public class Frases {
	
	
	
	String frases[][] = {{"Mami","Bebe","Princess","Mami",},
						{" yo quiero "," yo puedo "," yo vengo a "," voy a"},
						{" Encendelte "," malte "," ligal "," jugal "},
						{" suave "," lento "," rapido "," fuerte "},
						{" Hasta que salga el sol "," toda la noche "," hasta el amanecer "," todo el dia "},
						{" sin anestecia. "," sin compromiso."," face to face."," sin miedo.",}};
	public Frases() {
		crearCancion();
	}
	public String crearFrases() {
		String palabra="";
		for(int i=0;i<frases.length;i++) {
			int x=generarAleatorio();
			palabra += frases[i][x];
		}
		return palabra+"\n";
	}
	public String crearEstrofas() {
		String estrofa="";
		for(int i=0;i<4;i++) {
			estrofa +=crearFrases()+"\n";
		}
		return estrofa;
	}
	public String crearCancion() {
		String cancion="";
		for(int i=0;i<4;i++) {
			cancion += crearEstrofas()+"\n";
		}
		return cancion;
	}
	public int generarAleatorio() {
		int aleatorio= (int)(Math.random()*4);
		return aleatorio;
	}
}
