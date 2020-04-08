package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JPanel;
import javax.swing.JTextArea;




public class PanelTexto extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextArea textfield = new JTextArea("");
	public PanelTexto() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargar() throws Exception {
		setLayout( new GridLayout(1,1));
		textfield.setBackground(new Color(0, 0, 0));
		textfield.setForeground(new Color(255,255,255));
		textfield.setLineWrap(true); 
		Font fuente = textfield.getFont();
		textfield.setFont(new Font(fuente.getName(),Font.BOLD,20));
		
		
	}
	
	public void addComponentes() {
		add(textfield);
	}

	public JTextArea getTextfield() {
		return textfield;
	}

	public void setTextfield(JTextArea textfield) {
		this.textfield = textfield;
	}

	
	

	
}
