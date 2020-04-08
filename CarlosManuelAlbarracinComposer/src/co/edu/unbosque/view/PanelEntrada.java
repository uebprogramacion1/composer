package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JButton butConvertir;
	private JButton butabrirtxt;
	private JButton butabrirprop;
	public static final String CONVERTIR = "Convertir";
	public static final String Abrirtxt = "abrir";
	public static final String Abrirprop = "abrirprop";

	public PanelEntrada() {
		setLayout(new GridLayout(1, 1));
		TitledBorder border = BorderFactory.createTitledBorder("Datos de Entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		butConvertir = new JButton("Componer");
		butConvertir.setActionCommand(CONVERTIR);

		butabrirtxt = new JButton("Abrir txt");
		butabrirtxt.setActionCommand(Abrirtxt);

		butabrirprop = new JButton("Abrir Properties");
		butabrirprop.setActionCommand(Abrirprop);

		add(new JLabel(""));
		add(butConvertir);
		add(butabrirtxt);
		add(butabrirprop);
	}

	public JButton getButConvertir() {
		return butConvertir;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}

	public static String getConvertir() {
		return CONVERTIR;
	}

	public static String getAbrirTxt() {
		return Abrirtxt;
	}

	public JButton getButabrirtxt() {
		return butabrirtxt;
	}

	public void setButabrirtxt(JButton butabrirtxt) {
		this.butabrirtxt = butabrirtxt;
	}

	public JButton getButabrirprop() {
		return butabrirprop;
	}

	public void setButabrirprop(JButton butabrirprop) {
		this.butabrirprop = butabrirprop;
	}

}
