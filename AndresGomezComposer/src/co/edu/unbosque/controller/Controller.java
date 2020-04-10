package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Music;
import co.edu.unbosque.model.persintence.Frases;
import co.edu.unbosque.view.InterfazGui;

public class Controller implements ActionListener{
	Music mc;
	InterfazGui gui;
	
	public Controller()
	{
		mc=new Music();
		gui=new InterfazGui();
		
		gui.setVisible(true);
		gui.getButcrear().addActionListener(this);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		
		
              if(evento.getActionCommand().equals("...")) {
            	  
            
            	  
            	  mc.CrearCancion();
            	  
            	
			
			
			
			
	 	 	
		      }
         
		
	}
}
