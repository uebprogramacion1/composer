package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InterfazGUI extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JButton buttgenerarC;
	Fondo fondo;
	public InterfazGUI() {
		
		
		setSize(1000,600);
		setResizable(false);
		setTitle("Cancion");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		fondo = new Fondo();
		this.setContentPane(fondo);
		
		
		setLayout(null);
		
		buttgenerarC = new JButton("Generar Cancion");
		buttgenerarC.setBounds(600, 120, 200, 300);
		buttgenerarC.setBackground(Color.green);
		buttgenerarC.setForeground(Color.white);
		buttgenerarC.setOpaque(false);
		buttgenerarC.setBorder(null);
		
		
		
		add(buttgenerarC);
		
	}

	
	public JButton getButtgenerarC() {
		return buttgenerarC;
	}
	public void setButtgenerarC(JButton buttgenerarC) {
		this.buttgenerarC = buttgenerarC;
	}

}
