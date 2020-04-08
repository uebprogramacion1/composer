package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class PanelEntrada extends JPanel {
	
	private JTextArea txtLetra; 
	private JTextField txtTitle;

	private static final long serialVersionUID = 1L;
	
	public PanelEntrada(Controller c) {
		
		txtTitle = new JTextField("COMPOSER");
		txtTitle.setFont(new Font("Comic Sans M", Font.PLAIN, 20));
		txtTitle.setBounds(0,0,400,400);
		txtTitle.setEditable(false);
		add(txtTitle);
		
		txtLetra= new JTextArea();
		txtLetra.setBounds(0,0,400,400);
		txtLetra.setEditable(false);
		add(txtLetra);
		
		
	}

	public JTextArea getTxtLetra() {
		return txtLetra;
	}

	public void setTxtLetra(JTextArea txtLetra) {
		this.txtLetra = txtLetra;
	}
	
	

}
