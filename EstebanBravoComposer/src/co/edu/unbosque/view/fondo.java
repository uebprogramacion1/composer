package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class fondo extends JPanel {

	
	private static final long serialVersionUID = 1L;
	private Image imagen;
	
	public void paint(Graphics g) {
		
		
		imagen = new ImageIcon(getClass().getResource("/Imagenes/a2b4c281150a057481b7a237a3880884.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	

}
