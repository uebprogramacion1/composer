package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labelTitulo;
	private JButton btonGenerar;
	Color colorRojo = new Color(125, 0, 0);

	public PanelEntrada() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Generar");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		labelTitulo = new JLabel("Presione el boton para generar su cancion aleatoria:", SwingConstants.CENTER);
		labelTitulo.setForeground(Color.black);
		labelTitulo.setFont(new Font("Calibri", 3, 25));
		labelTitulo.setBounds(53, 33, 562, 28);
		add(labelTitulo);

		btonGenerar = new JButton("Guardar");
		btonGenerar.setForeground(Color.WHITE);
		btonGenerar.setBackground(colorRojo);
		btonGenerar.setFont(new Font("Calibri", 1, 45));
		btonGenerar.setBounds(135, 77, 398, 61);
		add(btonGenerar);

	}

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JButton getBtonGenerar() {
		return btonGenerar;
	}

	public void setBtonGenerar(JButton btonGenerar) {
		this.btonGenerar = btonGenerar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
