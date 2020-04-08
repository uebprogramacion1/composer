package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.io.IOException;

import co.edu.unbosque.controller.Controller;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View extends JFrame{
	private static final long serialVersionUID = 1L;
	private Dialogos dialogos = new Dialogos();
	private PanelTexto paneltexto = new PanelTexto();
	private PanelBoton panelboton = new PanelBoton();
	
	public void iniciar(Controller control) {
		Cargar();
		addComponentes();
		escucharComponentes(control);
	}
	
	public void Cargar() {
		setLayout(new BorderLayout());
		setTitle("Creador de Canciones de Regueton");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public void addComponentes() {
		add(paneltexto, BorderLayout.CENTER);
		add(panelboton, BorderLayout.SOUTH);
	}
	
	public void escucharComponentes(Controller control) {
		panelboton.getBoton().addActionListener(control);
	}
	public String cargarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", ".txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
		    path = chooser.getSelectedFile().getAbsolutePath();
		    return path;
		} else {
			
			return null;
		}
	}
	public String guardarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", ".txt");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			path = chooser.getSelectedFile().getAbsolutePath();
		} 
		else {
			
		
			
		}
		return path;
	}

	public Dialogos getDialogos() {
		return dialogos;
	}

	public PanelTexto getPaneltexto() {
		return paneltexto;
	}

	public PanelBoton getPanelboton() {
		return panelboton;
	}
 
	
}
