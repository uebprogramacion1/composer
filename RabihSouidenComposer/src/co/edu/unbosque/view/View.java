package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	public PanelCrear panelCrear;
	
	public View() {
		setTitle("Music Componer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		
		panelCrear = new PanelCrear();
		panelCrear.setBounds(100, 10, 475, 650);
		getContentPane().add(panelCrear);
		
	}
	public PanelCrear getPanelCrear() {
		return panelCrear;
	}
	public void setPanelCrear(PanelCrear panelIngreso) {
		this.panelCrear = panelIngreso;
	}
	
	public File guardarArchivo() {
		JFileChooser chooser = new JFileChooser();
		int numero= chooser.showSaveDialog(null);
		File file = chooser.getSelectedFile();
		return file;
	}
}
