package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panel extends JPanel{

	private JTextArea leer;
	
	public Panel() {
		setLayout(null);
		leer= new JTextArea();
		leer.setBounds(5,10,120,50);
		add(leer);
	}

	public JTextArea getLeer() {
		return leer;
	}

	public void setLeer(JTextArea leer) {
		this.leer = leer;
	}
}
