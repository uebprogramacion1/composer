package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class InterfazGUI extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JButton buttgenerarC;
	fondo Fondo;
	public InterfazGUI() {
		
		
		setSize(1000,600);
		setResizable(false);
		setTitle("Cancion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		Fondo = new fondo();
		this.setContentPane(Fondo);
		
		
		setLayout(null);
		
		buttgenerarC = new JButton("Generar Cancion");
		buttgenerarC.setBounds(600, 120, 200, 200);
		buttgenerarC.setBackground(Color.green);
		buttgenerarC.setForeground(Color.orange);
		buttgenerarC.setOpaque(false);
		buttgenerarC.setBorder(null);
		
		
		
		add(buttgenerarC);
		
	}
	
	public File generarArcivo() {
		
		
		JFileChooser archivo = new JFileChooser();
		int numero = archivo.showSaveDialog(null);
		File agen = archivo.getSelectedFile();
		
	
		return agen;
		
		
		
	}
	

	
	public JButton getButtgenerarC() {
		return buttgenerarC;
	}
	public void setButtgenerarC(JButton buttgenerarC) {
		this.buttgenerarC = buttgenerarC;
	}

}
