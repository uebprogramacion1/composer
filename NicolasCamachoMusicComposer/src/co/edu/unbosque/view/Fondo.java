package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private Image imagen;
	
	public void paint(Graphics g) {
		
		
		imagen = new ImageIcon(getClass().getResource("/Imagenes/Callaita.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	

}
