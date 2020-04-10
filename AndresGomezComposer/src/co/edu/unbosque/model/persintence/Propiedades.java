package co.edu.unbosque.model.persintence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Propiedades {
	
	private Properties prop=new Properties();
	private String archivoProp="archivo.Propietis";
	
	public int escribirPropiedades(){
		try {
			prop.setProperty("lieas", "4");
			prop.setProperty("estrofa", "4");
			prop.store(new FileOutputStream(archivoProp), null);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}		
		
		return 0;
		
		
		
	}
	
	public int leerpropiedadesLinea() {
		int  valor =0;
		try {
			prop.load(new FileInputStream(archivoProp));
			prop.list(System.out);
			valor =Integer.parseInt(prop.getProperty("lieas"));
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		valor = Integer.parseInt(prop.getProperty("lieas"));
		
		return valor ;
		
		
	}
	
	
	public int leerpropiedadeEstrofa() {
		int  valor1 =0;
		try {
			prop.load(new FileInputStream(archivoProp));
			prop.list(System.out);
			valor1 =Integer.parseInt(prop.getProperty("estrofa"));
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		valor1 = Integer.parseInt(prop.getProperty("estrofa"));
		
		return valor1 ;
		
		
	}
	
	
	
	
	
	
	

}
