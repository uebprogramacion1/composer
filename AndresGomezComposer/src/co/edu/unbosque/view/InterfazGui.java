package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;




public class InterfazGui extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	Fondo1 fondo;
	
	private JButton butcrear;
	
	public InterfazGui() {
		setSize(800,512);
		setResizable(false);
		setTitle(" ;)");
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		fondo=new Fondo1();
		this.setContentPane(fondo);
		
		
		setLayout(null);
		
		butcrear=new JButton("...");
		butcrear.setBounds(250, 400, 350, 50);
		butcrear.setBackground(Color.RED);
		butcrear.setOpaque(false);
		butcrear.setBorder(null);
		add(butcrear);
		
		
		
	}
	
	public File gestionarArchivo() {
		JFileChooser arc=new JFileChooser();
		int numero=arc.showSaveDialog(null);
		File archivo=arc.getSelectedFile();
		
		return archivo;
	}

	public JButton getButcrear() {
		return butcrear;
	}

	public void setButcrear(JButton butcrear) {
		this.butcrear = butcrear;
	}
	
	
	
	
	
	

}
