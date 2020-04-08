package co.edu.unbosque.view;

import javax.swing.JFrame;

public class View2 extends JFrame{
	
	public PanelPropiedades panelPropiedades;
	
	public View2() {
		setTitle("Music Componer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(false);
	}
	
	public void inicializar() {
		
		panelPropiedades = new PanelPropiedades();
		panelPropiedades.setBounds(10, 10, 475, 450);
		getContentPane().add(panelPropiedades);
	}

	public PanelPropiedades getPanelPropiedades() {
		return panelPropiedades;
	}

	public void setPanelPropiedades(PanelPropiedades panelPropiedades) {
		this.panelPropiedades = panelPropiedades;
	}
	
	

}
