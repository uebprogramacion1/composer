package co.edu.unbosque.view;



import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton boton = new JButton("Crear Cancion de BadBunny");
	public final String CREAR = "Crear";
	public PanelBoton() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargar() throws Exception {
		setLayout(new GridLayout (1,1));
		boton.setBackground(Color.blue);
		boton.setForeground(Color.white);
		boton.setActionCommand(CREAR);
	}
	
	public void addComponentes() {
		add(boton);
	}

	public JButton getBoton() {
		return boton;
	}

}
