package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada;
	private PanelResultados panelResultados;
	private Color colorAzul = new Color(22, 103, 179);

	public View() {

		setTitle("COMPOSER");
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.BLACK);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {

		panelEntrada = new PanelEntrada();
		panelEntrada.setBounds(16, 16, 662, 160);
		getContentPane().add(panelEntrada);
		panelEntrada.setBackground(colorAzul);

		panelResultados = new PanelResultados();
		panelResultados.setBounds(16, 196, 662, 452);
		getContentPane().add(panelResultados);
		panelResultados.setBackground(colorAzul);

	}

	public File FileChooser() {
		JFileChooser algo = new JFileChooser();
		algo.showSaveDialog(null);
		File archivo = algo.getSelectedFile();
		// System.out.println(archivo.getAbsolutePath());
		return archivo;
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

	public Color getColorAzul() {
		return colorAzul;
	}

	public void setColorAzul(Color colorAzul) {
		this.colorAzul = colorAzul;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
