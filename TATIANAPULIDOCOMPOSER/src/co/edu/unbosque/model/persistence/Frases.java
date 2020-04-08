package co.edu.unbosque.model.persistence;

public class Frases {

	private String frases[][];

	public Frases() {
		frases = cargarMatrizFrases();

	}

	public String[][] cargarMatrizFrases() {

		String frases[][] = {
				{ "mami ", "yo quiero ", "encenderte ", "suave ",
						"hasta que salga el sol ", "sin anestesia " },
				{ "bebé ", "yo puedo ", "amarte ", "lento ", "toda la noche ",
						"sin compromiso " },
				{ "princess ", "yo vengo a ", "ligar ", "rapido ",
						"hasta el amanecer ", "feis to feis " },
				{ "mami ", "voy a ", "jugar ", "fuerte ", "todo el dia ",
						"sin miedo " } };
		return frases;

	}

	public String mostrarValor(int a, int b) {
		return frases[a][b];
	}

	public String[][] getFrases() {
		return frases;
	}

	public void setFrases(String[][] frases) {
		this.frases = frases;
	}
	
}
