package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.Model.EjercicioArchivo;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	View v;
	EjercicioArchivo ej;
	String leer="";
	String propiedad="";
	String ruta="";
	public Controller() {
		v=new View();
		ej=new EjercicioArchivo();
		v.getBtnescritura().addActionListener(this);
		v.getBtnguardar().addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String accion=e.getActionCommand();
	
		
		
		if(accion=="escritura") {
			leer=ej.crearCancion();
			v.getTexto().setText(leer);
		
				
		}
		if(accion=="guardar") {
			
			
			propiedad=ej.gestionarPropiedades();
			ruta=v.gestionarArchivo();
			String leido=ej.gestionarArchivoCadena(leer,ruta);
				v.leerString("archivo leido: \n"+ leido);
		}
	}
	
}
