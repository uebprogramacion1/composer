package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JPanel {

	
	private JLabel etiqueta;
	private JTextArea salida;
	
	public Panel_1() {
		setLayout(null);
		inicializarVariables();
		setVisible(true);
	}

	private void inicializarVariables() {

		etiqueta = new JLabel("Su letra de la cancion es: ");
		etiqueta.setBounds(10, 10, 250, 30);
		etiqueta.setBackground(Color.pink);
		etiqueta.setFont(new Font("perpetua", 3, 20));
		add(etiqueta);


		salida = new JTextArea();
		salida.setBounds(50, 40,650,670);
		salida.setBackground(Color.pink);
		salida.setFont(new Font("perpetua", 3, 20));
		add(salida);
	}

	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	public JTextArea getSalida() {
		return salida;
	}

	public void setSalida(JTextArea salida) {
		this.salida = salida;
	}

}
