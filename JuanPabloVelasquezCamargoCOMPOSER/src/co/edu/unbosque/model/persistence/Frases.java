package co.edu.unbosque.model.persistence;

public class Frases {

	private String frases[][];

	public Frases() {
		frases = cargarPalabras();
	}

	public String[][] cargarPalabras() {

		String frases[][] = {
				{ " MAMI ", " YO QUIERO ", " ENCENDERTE ", " SUAVE ", " HASTA QUE SALGA EL SOL", " SIN ANESTECIA " },
				{ " BEBE ", " YO PUEDO ", " AMARTE ", " LENTO ", " TODA LA NOCHE", " SIN COMPROMISO " },
				{ " PRINCESS ", " VENGO A", " BESAR ", " RAPIDO ", " HASTA EL AMANECER ", " FACE TO FACE " },
				{ " MAMI ", " VOY A ", " JUGAR ", " FUERTE ", " TODO EL DIA ", " SIN MIEDO " } };

		return frases;

	}

	public String mostrarValor(int filas, int columnas) {
		return frases[filas][columnas];
	}

	public String[][] getFrases() {
		return frases;
	}

	public void setFrases(String[][] frases) {
		this.frases = frases;
	}

}
