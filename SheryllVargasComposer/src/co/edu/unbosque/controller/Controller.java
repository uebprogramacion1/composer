package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.model.persistence.ArchivoFile;
import co.edu.unbosque.model.persistence.FrasesFile;
import co.edu.unbosque.model.persistence.Propiedades;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener  {

	private Cancion CN;
	private FrasesFile fp;
	private View gui;
	private Propiedades pr;
	

	public Controller() {
		fp = new FrasesFile();
		gui = new View(this);
		pr = new Propiedades();
		CN = new Cancion(pr);
		mostrarEstrofa();
	}
	
	
	public String mostrarEstrofa() {
		String verso="";
		String propiedades = pr.leerPropiedades();
		String[] spliir = propiedades.split(",");
		
		for (int i = 0; i < Integer.parseInt(spliir[1]); i++) {

			verso += CN.darEstrofa(fp.getFrases1(), fp.getFrases2(), fp.getFrases3(), fp.getFrases4(), 
					fp.getFrases5(), fp.getFrases6()) +"\n";

		}
		return verso;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// eventos
		if (e.getActionCommand().equals("Guardar")) {
			gui.guardarEstrofa(gui.getPE().getTxtLetra().getText());
		}else if (e.getActionCommand().equals("Properties")){
			String a = JOptionPane.showInputDialog(null, "Numero de lineas :");
			String b = JOptionPane.showInputDialog(null, "Numero de estrofas :");
			pr.escribirPropiedades(a,b);
		}else {
			gui.getPE().getTxtLetra().setText(this.mostrarEstrofa());
			
		}
		
	}
}