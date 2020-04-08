package co.edu.unbosque.View;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	String Cancion;
	
	public String getCancion() {
		return Cancion;
	}
	
	public void setCancion(String cancion) {
		Cancion = cancion;
	}
	
	public Panel panel1 ;
	
	public View() {
		
		getContentPane().setLayout(null);
		setSize(600, 400);
		setTitle("Cancion");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.white);
			
		inicializarComponentes();
			
			
		setLocationRelativeTo(null);
		
			
		}

	private void inicializarComponentes() {
		 
	    panel1 = new Panel();
		panel1.setBounds(25, 25, 535, 350);
		getContentPane().add(panel1);
		
	}
	public File guardar() {
		
		JFileChooser seleccionar = new JFileChooser();
		int numero = seleccionar.showSaveDialog(null);
		File archivo = seleccionar.getSelectedFile();
		
		return archivo;
		
	}

}