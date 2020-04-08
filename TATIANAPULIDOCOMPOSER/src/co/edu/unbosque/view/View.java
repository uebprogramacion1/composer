package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private PanelMostrarCancion panelMostrarCancion; // Se declara un objeto de
														// tipo

	// PanelResultados

	public View(Controller control) {
		// Definición de los parámetros básicos de la ventana principal

		setSize(600, 600); // tamaño en ancho y alto en pixeles
		setResizable(false); // Se puede cambiar el tamaño de la ventana?
		setTitle("Cancion"); // tìtulo de la ventana

		setDefaultCloseOperation(EXIT_ON_CLOSE);// qué debe hacer si cierra la
		// Establece el layout (lienzo) que vamos a utilizar dentro de la
		// ventana principal.
		getContentPane().setLayout(null);

		inicializarComponentes(); // ventana

		panelMostrarCancion.getGuardarCancion().addActionListener(control);
		panelMostrarCancion.getMostrarCancion().addActionListener(control);
		setLocationRelativeTo(null); // coloca la ventana al centro de la
										// pantalla

		setVisible(true);

	}

	private void inicializarComponentes() {

		panelMostrarCancion = new PanelMostrarCancion();
		panelMostrarCancion.setBounds(5, 5, 590, 590);
		getContentPane().add(panelMostrarCancion);

	}

	public File fileChooserGuardar() {
		JFileChooser direccion = new JFileChooser();
		int numero = direccion.showSaveDialog(null);
		File direccionArchivo = direccion.getSelectedFile();
		return direccionArchivo;

	}

	public String fileChooserAbrir() {
		JFileChooser direccion = new JFileChooser();
		direccion.showOpenDialog(direccion);
		String ruta = direccion.getSelectedFile().getAbsolutePath();
		return ruta;

	}

	public PanelMostrarCancion getPanelMostrarCancion() {
		return panelMostrarCancion;
	}

	public void setPanelMostrarCancion(PanelMostrarCancion panelMostrarCancion) {
		this.panelMostrarCancion = panelMostrarCancion;
	}

}
