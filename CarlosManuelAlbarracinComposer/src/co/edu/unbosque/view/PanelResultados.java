package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labResultado;
	private JTextArea txtMonto;

	public PanelResultados() {

		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labResultado = new JLabel("La composición es:");
		txtMonto = new JTextArea(30, 45);
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		txtMonto.setLineWrap(true);

		add(labResultado);
		add(txtMonto);

	}

	public JLabel getLabResultado() {
		return labResultado;
	}

	public void setLabResultado(JLabel labResultado) {
		this.labResultado = labResultado;
	}

	public JTextArea getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextArea txtMonto) {
		this.txtMonto = txtMonto;
	}

}
