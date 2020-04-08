package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private Panel panel;
	
	public View () {
		
		setTitle("Traductor De Modismos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);
		
	inicializarComponentes();
		
		setResizable( true );
        setLocationRelativeTo( null );
        setVisible(true);
	}
	private void inicializarComponentes() {
		panel = new Panel();
		panel.setBounds(25, 25, 750, 300);
		getContentPane().add(panel);
		


	}
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
