package co.edu.unbosque.Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.Model.Mundo;
import co.edu.unbosque.View.View;
import co.edu.unbsoque.Model.persistence.EjemploFile;
import co.edu.unbsoque.Model.persistence.Palabras;

public class Controller implements ActionListener {
	
	public Mundo mundo;
	public View view;
	public Palabras palabra;
	public EjemploFile file;
	
	Controller()  {
	
	view = new View(); 
	palabra = new Palabras();
    file = new EjemploFile();
    mundo = new Mundo();
    view.panel1.boton_validar.addActionListener(this);
    view.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
	   if(e.getActionCommand().equals("Generar Cancion")) {		
			
			view.panel1.campo_texto.setText(palabra.leerArreglos());
			file.escribirArchivo(view.guardarArchivo(), palabra.leerArreglos());
			
		}
	   
	}
}

