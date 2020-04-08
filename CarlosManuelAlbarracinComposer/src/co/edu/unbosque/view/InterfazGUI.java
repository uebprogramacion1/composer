package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import co.edu.unbosque.controller.Controlador;

public class InterfazGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;
	private String cancion;
	private String texto;

	public InterfazGUI(Controlador control) {

		setSize(550, 450);
		setResizable(false);
		setTitle("Music Composer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		panelEntrada = new PanelEntrada();
		add(panelEntrada, BorderLayout.NORTH);
		panelResultados = new PanelResultados();
		add(panelResultados, BorderLayout.CENTER);

		panelEntrada.getButConvertir().addActionListener(control);
		panelEntrada.getButabrirtxt().addActionListener(control);
		panelEntrada.getButabrirprop().addActionListener(control);

	}

	public void guardarArchivo() {

		try {
			String nombre = "";
			JFileChooser file = new JFileChooser();
			file.showSaveDialog(null);
			File guarda = file.getSelectedFile();

			if (guarda != null) {
				FileWriter save = new FileWriter(guarda + ".txt");
				save.write(cancion);
				save.close();
				JOptionPane.showMessageDialog(null, "El archivo se a guardado Exitosamente", "Información",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Su archivo no se ha guardado", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public String abrirArchivo() {
		String aux = "";

		JFileChooser file = new JFileChooser();
		file.showOpenDialog(this);

		try {

			String patch = file.getSelectedFile().getAbsolutePath();
			FileInputStream archivo = new FileInputStream(patch);
			DataInputStream entrada = new DataInputStream(archivo);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
			String linea;
			texto = "";
			while ((linea = buffer.readLine()) != null) {

				texto = texto + linea + "\n";

			}
			getPanelResultados().getTxtMonto().setText(texto);
			entrada.close();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex + "" + "\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",
					JOptionPane.WARNING_MESSAGE);
		}
		return texto;
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
