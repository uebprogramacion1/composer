package co.edu.unbosque.view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Fondo1 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
 private Image imagen2;


	 
	 @Override
	 public void paint(Graphics g) {
		 imagen2=new ImageIcon(getClass().getResource("/co/edu/unbosque/view/best-trap-music-mix-2018-hip-ho.jpg")).getImage();
		 g.drawImage(imagen2, 0, 0, getWidth(), getHeight(), this);
		 setOpaque(false);
		 super.paint(g);
		 
	 }
	
	
	

}
