package co.edu.unbosque.view;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class View extends JFrame{
	
	public PanelCrear panelCrear;
	public JFileChooser fc;
	
	public View() {
		setTitle("Music Componer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		
		panelCrear = new PanelCrear();
		panelCrear.setBounds(10, 10, 475, 450);
		getContentPane().add(panelCrear);
		
	}
	
	public void ventanaSlavar() {
		fc  =new JFileChooser(System.getProperty("user.dir"));
		fc.showSaveDialog(fc);
	}
	
	public JFileChooser getFc() {
		return fc;
	}
	public void setFc(JFileChooser fc) {
		this.fc = fc;
	}
	
	public PanelCrear getPanelCrear() {
		return panelCrear;
	}
	public void setPanelCrear(PanelCrear panelIngreso) {
		this.panelCrear = panelIngreso;
	}

}
