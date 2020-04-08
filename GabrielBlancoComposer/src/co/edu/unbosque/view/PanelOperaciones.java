package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelOperaciones extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton generar = new JButton("Generar Disco");
	public final String GENERARCANCION = "OperGenerarCancion";
	
	public PanelOperaciones() {
		try {
			cargar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		addComponentes();
	}
	
	public void cargar() throws Exception{
		setLayout(new BorderLayout());
		generar.setBackground(new Color(225, 209, 89));
		generar.setForeground(Color.BLACK);
		Font segoe = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/BAUHS93.TTF")).deriveFont(45f);
		generar.setFont(segoe);
		generar.setActionCommand(GENERARCANCION);
	}
	
	public void addComponentes() {
		add(generar);
	}

	public JButton getGenerar() {
		return generar;
	}

}
