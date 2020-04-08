package co.edu.unbosque.model;

public class Cancion {

	String Palabra1[] = {"Mami", "Bebé", "Princess", "Mami"};
	String Palabra2[] = {" quiero", " puedo", " vine a", " voy a"};
	String Palabra3[] = {" encenderte", " amarte", " ligar", " jugar"};
	String Palabra4[] = {" suave", " lento", " rápido", " fuerte"};
	String Palabra5[] = {" sin anestesia", " sin compromiso", " feis to feis", " sin miedo"};
	String Palabra6[] = {" hasta que salga el sol", " toda la noche", " hasta el amanecer", " todo el día"};

	public String hacerEstrofa() {

		String linea ="";

		for (int i = 0; i < 4; i++) {
			
			int n1 = (int)(Math.random()* Palabra1.length);

			int n2 = (int)(Math.random()* Palabra2.length);

			int n3 = (int)(Math.random()* Palabra3.length);

			int n4 = (int)(Math.random()* Palabra4.length);

			int n5 = (int)(Math.random()* Palabra5.length);

			int n6 = (int)(Math.random()* Palabra6.length);

			linea += Palabra1[n1] + 
					Palabra2[n2] +
					Palabra3[n3] +
					Palabra4[n4] +
					Palabra5[n5] + 
					Palabra6[n6] + "\n";		

		}
		return linea;

	}
	
}