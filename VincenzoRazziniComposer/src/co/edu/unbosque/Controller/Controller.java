package co.edu.unbosque.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.Persistence.EjemploFile;
import co.edu.unbosque.Persistence.Frases;
import co.edu.unbosque.View.View;


public class Controller implements ActionListener {
	
	public View view = new View();
	public Frases frase;
	public EjemploFile file;
	
	Controller()  {
	
	frase = new Frases();
	view.panel1.boton_validar.addActionListener(this);
    view.setVisible(true);
    file = new EjemploFile();
		
	}
	

	public void actionPerformed(ActionEvent e) {
	   if(e.getActionCommand().equals("Generar Cancion")) {		
			
			view.panel1.campo_texto.setText(frase.leerArreglo());
			file.escribirArchive(view.guardar(),frase.leerArreglo());
			
			
		}
	}
}



