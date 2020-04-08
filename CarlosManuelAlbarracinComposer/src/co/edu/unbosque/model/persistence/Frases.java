package co.edu.unbosque.model.persistence;

public class Frases {

	private String frase1[] = new String[4];
	private String frase2[] = new String[4];
	private String frase3[] = new String[4];
	private String frase4[] = new String[4];
	private String frase5[] = new String[4];
	private String frase6[] = new String[4];
	private int a, b, c, d, e, f;

	public Frases() {

		frase1[0] = "Mami";
		frase1[1] = "Bebe";
		frase1[2] = "Princess";
		frase1[3] = "Tesoro";

		frase2[0] = "yo quielo";
		frase2[1] = "yo puedo";
		frase2[2] = "yo vengo a";
		frase2[3] = "voy a";

		frase3[0] = "encendelte";
		frase3[1] = "amalte";
		frase3[2] = "ligal";
		frase3[3] = "jugal";

		frase4[0] = "suave";
		frase4[1] = "lento";
		frase4[2] = "lápido";
		frase4[3] = "fuelte";

		frase5[0] = "hasta que salga el sol";
		frase5[1] = "toda la noche";
		frase5[2] = "hasta el amanecel";
		frase5[3] = "todo el dia";

		frase6[0] = "sin anestesia";
		frase6[1] = "sin complomiso";
		frase6[2] = "feis to feis";
		frase6[3] = "sin miedo";

	}

	public String getFrase1(int a) {

		return frase1[a];
	}

	public void setFrase1(String[] frase1) {
		this.frase1 = frase1;
	}

	public String getFrase2(int b) {
		return frase2[b];
	}

	public void setFrase2(String[] frase2) {
		this.frase2 = frase2;
	}

	public String getFrase3(int c) {
		return frase3[c];
	}

	public void setFrase3(String[] frase3) {
		this.frase3 = frase3;
	}

	public String getFrase4(int d) {
		return frase4[d];
	}

	public void setFrase4(String[] frase4) {
		this.frase4 = frase4;
	}

	public String getFrase5(int e) {
		return frase5[e];
	}

	public void setFrase5(String[] frase5) {
		this.frase5 = frase5;
	}

	public String getFrase6(int f) {
		return frase6[f];
	}

	public void setFrase6(String[] frase6) {
		this.frase6 = frase6;
	}

	public String[] getFrase1() {
		return frase1;
	}

}
