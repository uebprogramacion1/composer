package co.edu.unbosque.model;

public class Palabras {
   private String palte1[] = { "Mami ", "Bebe ","Princesa ","Jeva "};
   private String palte2[] = {"Yo Quiero ","Yo puedo ", "Yo vengo A ", " Voy A "};
   private String palte3[] = { "Encendelte ", "Amalte ", "Ligalte ","Jugalte "};
   private String palte4[] = { "Suavemente ", "Lentamente ", "Rapidamente ","Fuertemente "};
   private String palte5[] = { "Hasta que salga el sol ", "Toda la Noche ", "Hasta el amanecer ","Todo el dia "};
   private String palte6[]= {"Sin Anestesia ", "Sin Compromiso ", "Cara a Cara ", "Sin miedo "};
   public Palabras() {
	   
   }
   public String armarCancion() {
	   String letra = "";
	  for (int i = 0; i < 4; i++) {
		
	
	   for (int j = 0; j < 4; j++) {
		   letra += palte1[(int) (Math.random()*4)]+palte2[(int) (Math.random()*4)]+palte3[(int) (Math.random()*4)]+palte4[(int) (Math.random()*4)]+palte5[(int) (Math.random()*4)]+palte6[(int)(Math.random()*4)]+"\n";
	 }
	   
	   
    }   
	   return letra;
	  
   }
   
public String[] getPalte1() {
	return palte1;
}
public void setPalte1(String[] palte1) {
	this.palte1 = palte1;
}
public String[] getPalte2() {
	return palte2;
}
public void setPalte2(String[] palte2) {
	this.palte2 = palte2;
}
public String[] getPalte3() {
	return palte3;
}
public void setPalte3(String[] palte3) {
	this.palte3 = palte3;
}
public String[] getPalte4() {
	return palte4;
}
public void setPalte4(String[] palte4) {
	this.palte4 = palte4;
}
public String[] getPalte5() {
	return palte5;
}
public void setPalte5(String[] palte5) {
	this.palte5 = palte5;
}
public String[] getPalte6() {
	return palte6;
}
public void setPalte6(String[] palte6) {
	this.palte6 = palte6;
}

   
   
}
