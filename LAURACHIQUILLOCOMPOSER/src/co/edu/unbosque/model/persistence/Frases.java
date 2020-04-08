package co.edu.unbosque.model.persistence;

import java.lang.reflect.Array;

public class Frases {

	private String frase1[]= {"Mami","Bebe","Princess","Mami"};
	private String frase2[]= {"yo quiero","yo puedo","yo vengo a","voy a"};
	private String frase3[]= {"encenderte","amarte","ligar","jugar"};
	private String frase4[]= {"suave","lento","rapido","fuerte"};
	private String frase5[]= {"hasta que salga el sol","toda la noche","hasta el amanecer","todo el día"};
	private String frase6[]= {"sin anestesia.","sin compromiso.","feis to feis.","sin miedo."};
	
	public String darPalabra1() {
		
		String letra= frase1.toString();

		for (int i = 0; i < frase1.length; i++) {
		int	aleatrorio= (int) Math.floor(Math.random()*frase1.length);
		String frase= frase1[aleatrorio];
		
		String dar= frase;
		return dar;
		}		
		return letra;
	}
	
	public String darPalabra2(){
		String letra1= frase2.toString();
		for (int i = 0; i < frase1.length; i++) {
			int	aleatrorio= (int) Math.floor(Math.random()*frase2.length);
			String frase= frase2[aleatrorio];
			
			String dar= frase;
			return dar;
			}		
			return letra1;
	}
	
	public String darPalabra3(){
		String letra1= frase3.toString();
		for (int i = 0; i < frase1.length; i++) {
			int	aleatrorio= (int) Math.floor(Math.random()*frase3.length);
			String frase= frase3[aleatrorio];
			
			String dar= frase;
			return dar;
			}		
			return letra1;
	}
	
	public String darPalabra4(){
		String letra1= frase4.toString();
		for (int i = 0; i < frase4.length; i++) {
			int	aleatrorio= (int) Math.floor(Math.random()*frase4.length);
			String frase= frase4[aleatrorio];
			
			String dar= frase;
			return dar;
			}		
			return letra1;
	}
	
	public String darPalabra5(){
		String letra1= frase5.toString();
		for (int i = 0; i < frase5.length; i++) {
			int	aleatrorio= (int) Math.floor(Math.random()*frase5.length);
			String frase= frase5[aleatrorio];
			
			String dar= frase;
			return dar;
			}		
			return letra1;
	}
	
	public String darPalabra6(){
		String letra1= frase6.toString();
		for (int i = 0; i < frase6.length; i++) {
			int	aleatrorio= (int) Math.floor(Math.random()*frase6.length);
			String frase= frase6[aleatrorio];
			
			String dar= frase;
			return dar;
			}		
			return letra1;
	}
}
