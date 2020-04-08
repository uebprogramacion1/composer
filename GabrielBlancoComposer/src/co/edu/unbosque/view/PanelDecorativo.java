package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelDecorativo extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextArea area = new JTextArea("aaaa");

	public PanelDecorativo() {
		try {
			cargar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		Font segoe = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/Segoe UI.ttf")).deriveFont(45f);
		area.setBackground(new Color(225, 209, 89));
		area.setEditable(false);
		area.setForeground(new Color(225, 209, 89));
		area.setFont(segoe);
		add(area, BorderLayout.CENTER);
		
	}

}
