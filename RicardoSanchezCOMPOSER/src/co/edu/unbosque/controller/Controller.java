package co.edu.unbosque.controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mundo;

import co.edu.unbosque.view.View;


public class Controller implements ActionListener {
	
	private Mundo mundo = new Mundo();
    private View view = new View();
	
	public Controller() {
		Consola();
	}
	
		
 	public void Consola(){
 		boolean activo = true;
 		while(activo) {
 			try {
 				int comando = Integer.parseInt(view.getDialogos().leerDatoString("0. Salir\n1. Hacer Cancion por JOption\n2. Hacer Cancion por GUI"));
 				switch(comando) {
 				case 0:
 					activo = false;
 					break;
 				case 1:
 					hacerCancionJO();
 					break;
 				case 2:
 					GUI();
 					activo = false;
 					break;
 				}
 			} catch (Exception e) {
 				view.getDialogos().mostrarMensaje("Ocurrio un error inesperado.\n"+e.fillInStackTrace());
 			}
 			
 		}
 
 	}
	public void hacerCancionJO() {
		view.getDialogos().mostrarMensaje(mundo.getPalabras().armarCancion());
 	}
	public void GUI() {
		try {
 			view.iniciar(this);
		} catch (Exception e) {
			view.getDialogos().mostrarMensaje("Ocurrio un error inesperado.\n"+e.fillInStackTrace());
		}
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		try {
			if(evento.getActionCommand().equals( view.getPanelboton().CREAR)) {
				view.getPaneltexto().getTextfield().setText(mundo.getPalabras().armarCancion());
				mundo.getArchivo().escribirArchivo(mundo.getPalabras().armarCancion(), view.guardarArchivo());
				mundo.getPropiedad().escribirPropiedad("LineaPorEstrofas", ""+4, "./cancion.properties", null);
				mundo.getPropiedad().escribirPropiedad("EstrofasPorCancion", ""+4, "./cancion.properties", null);
				view.getDialogos().mostrarMensaje("Linea Por Estrofa: "+mundo.getPropiedad().leerPropiedad("./cancion.properties", "LineaPorEstrofas")
						+ "\n"+ "Estrofa Por Cancion: "+mundo.getPropiedad().leerPropiedad("./cancion.properties", "EstrofasPorCancion"));
			}
		} catch (Exception e) {
			view.getDialogos().mostrarMensaje("Ocurrio un error inesperado.\n"+e.fillInStackTrace());
			
		}
		
	}
 	
 	




		
}

