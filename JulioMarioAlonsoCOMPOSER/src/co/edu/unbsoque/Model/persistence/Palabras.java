package co.edu.unbsoque.Model.persistence;
public class Palabras {
	
	String frases1[]= {"feis to feis","a ella le gusta el taca taca","hasta abajo"
			,"castigarte","te acuerdas de mi"
			, "mami"};
    
	String frases2[]= {"Sin miedo"," hasta que salga el sol", "toda la noche"
			, " todo el dia","suave","lento"};

    String frases3[]= {"yo quiero", "yo puedo","amalte"
    		,"ligar","encendelte", "bebe"};
    
    String frases4[]= {"complomiso","te veo","contra la pared"
    		,"eso en 4 no se ve","sin anestesia","con ganas"};
 
    public Palabras() {
	
	
    }
    
    public String leerArreglos() {
    	
    String f = "";
    
    	
    	
        for (int i = 0; i < 4; i++) {
        	int valorDado = 0;
        	for (int j = 0; j < 4; j++) {
        		valorDado = (int) Math.floor(Math.random()*4);
        		
        		
    		 	
        	 f+= frases1[valorDado]+" " + frases2[valorDado]+" "+ 
        	frases3[valorDado]+" " +frases4[valorDado]+" "+"\n";
    	   }
       f+="\n";
       
      
        }
    	return f ;
       }
	
    }



