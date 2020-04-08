package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtLetraCancion;

	public PanelResultados() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Letra de cancion:");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		labResultado = new JLabel("Su cancion aleatoria es:", SwingConstants.CENTER);
		labResultado.setForeground(Color.BLACK);
		labResultado.setFont(new Font("Calibri", 3, 30));
		labResultado.setBounds(76, 16, 500, 28);
		add(labResultado);

		txtLetraCancion = new JTextArea();
		txtLetraCancion.setForeground(Color.black);
		txtLetraCancion.setFont(new Font("Calibri", 1, 15));
		txtLetraCancion.setBounds(16, 44, 630, 390);
		add(txtLetraCancion, BorderLayout.CENTER);

	}

	public void mostrarResultado(String texto) {
		txtLetraCancion.setText(texto);
	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextArea getTxtLetraCancion() {
		return txtLetraCancion;
	}

	public void setTxtLetraCancion(JTextArea txtLetraCancion) {
		this.txtLetraCancion = txtLetraCancion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
