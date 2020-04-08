package co.edu.unbosque.model.persistence;

public class Frases {
	
	
	
	String frases[][] = {{"Mami","Bebe","Princess","Mami","Corazon","Amor","Cielo"},
						{" yo quiero "," yo puedo "," yo vengo a "," voy a"," yo deseo "," yo sueño "," yo voy a "},
						{" Encendelte "," malte "," ligal "," jugal "," conquistalte "," poseelte "," besalte "},
						{" suave "," lento "," rapido "," fuerte "," violento "," duro "," suavemente "},
						{" Hasta que salga el sol "," toda la noche "," hasta el amanecer "," todo el dia "," de lunes a viernes "," todo el fin de semana "," los domingos por la noche "},
						{" sin anestecia. "," sin compromiso."," face to face."," sin miedo."," sin que tu novio se entere."," cuando tus padres no esten."," cuando tu quieras."}};
	public String crearFrases() {
		String palabra="";
		for(int i=0;i<6;i++) {
			int x=generarAleatorio();
			palabra += frases[i][x];
		}
		return palabra+"\n";
	}
	public String crearEstrofas(int datos[]) {
		String estrofa="";
		for(int i=0;i<datos[0];i++) {
			estrofa +=crearFrases()+"\n";
		}
		return estrofa;
	}
	public String crearCancion(int datos[]) {
		String cancion="";
		for(int i=0;i<datos[1];i++) {
			cancion += crearEstrofas(datos)+"\n";
		}
		return cancion;
	}
	public int generarAleatorio() {
		int aleatorio= (int)(Math.random()*7);
		return aleatorio;
	}
}
