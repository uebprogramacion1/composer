package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Panel;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View extends JFrame{
	
	public Panel1 panel1 ;
	
	public View() {
		
		getContentPane().setLayout(null);
		setSize(600, 450);
		setTitle("Cancion");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLACK);
			
		inicializarComponentes();
			
			
		setLocationRelativeTo(null);
		
			
		}

	private void inicializarComponentes() {
		 
	    panel1 = new Panel1();
		panel1.setBounds(25, 25, 535, 350);
		getContentPane().add(panel1);
		
		
	}
	public File guardarArchivo() {
		
		JFileChooser seleccionar = new JFileChooser();
		int numero = seleccionar.showSaveDialog(null);
		File archivo = seleccionar.getSelectedFile();
		
		return archivo;
		
	}

}
