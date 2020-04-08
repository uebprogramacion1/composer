package co.edu.unbosque.model;

public class Creador {

	String Frase1[] = {"Mami", "Bebé", "Princess", "Cosita", "Mamasita"};
	String Frase2[] = {" quiero", " puedo", " vine a", " voy a"};
	String Frase3[] = {" encendelte", " amalte", " ligal", " jugal"};
	String Frase4[] = {" suave", " lento", " lápido", " fuelte"};
	String Frase5[] = {" sin anestesia", " sin compromiso", " feis to feis", " sin miedo"};
	String Frase6[] = {" hasta que salga el sol", " toa la noche", " hasta el amanecer", " too el día"};

	public String crearCancion() {
		
		String a = "";
		
		for (int i = 0; i < 4; i++) {
			int aleatorio1 = (int)(Math.random()*Frase1.length);
			int aleatorio2 = (int)(Math.random()*Frase2.length);
			int aleatorio3 = (int)(Math.random()*Frase3.length);
			int aleatorio4 = (int)(Math.random()*Frase4.length);
			int aleatorio5 = (int)(Math.random()*Frase5.length);
			int aleatorio6 = (int)(Math.random()*Frase6.length);

			a += Frase1[aleatorio1] + Frase2[aleatorio2] + Frase3[aleatorio3] + Frase4[aleatorio4]
					+ Frase5[aleatorio5] + Frase6[aleatorio6] + "\n";
			
		}
		
		return a;
	}
}
