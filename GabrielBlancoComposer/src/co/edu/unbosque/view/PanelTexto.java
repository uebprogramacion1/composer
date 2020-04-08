package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelTexto extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JTextArea area = new JTextArea();
	
	public PanelTexto() {
		try {
			cargar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		addComponentes();
	}
	
	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		area.setBackground(Color.BLACK);
		area.setForeground(Color.WHITE);
		Font comicSans = Font.createFont(Font.TRUETYPE_FONT, new File("./docs/lib/comic.ttf")).deriveFont(25f);
		area.setFont(comicSans);
	}
	
	public void addComponentes() {
		add(area, BorderLayout.CENTER);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextArea getArea() {
		return area;
	}
	
	
}
