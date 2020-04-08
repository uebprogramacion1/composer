package co.edu.unbosque.view;


import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;




public class View extends JFrame {
	private static final long serialVersionUID = 1L;
	private PanelCancion panelCancion;

	public View() {
		
		setTitle("Music Componer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 750);
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		
		panelCancion = new PanelCancion();
		panelCancion.setBounds(100, 10, 550, 700);
		getContentPane().add(panelCancion);
		
	}
	public PanelCancion getPanelCancion() {
		return panelCancion;
	}
	public void setPanelCancion(PanelCancion panelCancion) {
		this.panelCancion = panelCancion;
	}
	public File guardarArchivo() {
		JFileChooser chooser = new JFileChooser();
		int numero= chooser.showSaveDialog(null);
		File f = chooser.getSelectedFile();
		return f;
	}
}
