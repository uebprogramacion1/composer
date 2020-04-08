package co.edu.unbosque.model.persistence;

public class Creador {
	
	private String espacio1[] = {"Mami " , "Princess " , "Beibi " , "Helmosa ", "Reina ", "Amol "};
	private String espacio2[] = {"yo quiero " , "yo puedo " , "yo vengo a " , "voy a "};
	private String espacio3[] = {"encendelte " , "amalte " , "ligal " , "jugal " + "bailal "};
	private String espacio4[] = {"suave " , "lento " , "rapido " , "fuelte ", "duro ", "desenflenado "};
	private String espacio5[] = {"hasta que salga el sol " , "toda la noche " , "hasta el amanecel " , "todo el dia " , "en toda la disco "};
	private String espacio6[] = {"sin anestecia" , "sin complomiso" , "feis to feis" , "sin miedo", "beibi"};

	public String armarOracion() {

		String result = "";

		for (int i = 0; i < 4; i++) {
			int aleatorio1 = (int) (Math.random() * espacio1.length);
			int aleatorio2 = (int) (Math.random() * espacio2.length);
			int aleatorio3 = (int) (Math.random() * espacio3.length);
			int aleatorio4 = (int) (Math.random() * espacio4.length);
			int aleatorio5 = (int) (Math.random() * espacio5.length);
			int aleatorio6 = (int) (Math.random() * espacio6.length);

			result += espacio1[aleatorio1] + espacio2[aleatorio2] + espacio3[aleatorio3] + espacio4[aleatorio4]
					+ espacio5[aleatorio5] + espacio6[aleatorio6] + "\n";
		}
		return result + "\n";
	}

}
