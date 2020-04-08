package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
	
	public Panel_cancion panel_cancion;
	
	
	public View() {
		
		 getContentPane().setLayout(null);
		 setTitle("Mi cancion de regueton");
		 setBounds(0, 0, 800, 800);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 getContentPane().setBackground(Color.black);
		 
		 panel_cancion = new Panel_cancion();
		 panel_cancion.setBounds(25, 25, 750, 600);
		 getContentPane().add(panel_cancion);
		 
		
		 
		 
		 setLocationRelativeTo(null);
		 setVisible(true);
		 
		
		
	}
	public File fileChooserGurdar(){
		JFileChooser direccion = new JFileChooser();
		int numero = direccion.showSaveDialog(null);
		File direccionArchivo =direccion.getSelectedFile();
		return direccionArchivo;
	}
	
	
	
	
	
	
	

}
