package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
	
	public Panel_1 panel_1;


	
public View() {
		
		setTitle("Composer");
		getContentPane().setLayout(null);
		setSize(800,800);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		getContentPane().setBackground(Color.pink);
		
		inicializarComponentes();
		
		setResizable( true );
        setLocationRelativeTo( null );
        setVisible(true);
	}

private void inicializarComponentes() {
	

	panel_1 = new Panel_1();
	panel_1.setBounds(12,12,753,723);
	panel_1.setBackground(Color.WHITE);
	add(panel_1);


	
	
	
}
public void mostrarMensajeSalida (String mensaje) {
	
	panel_1.getSalida().setText(mensaje);
	
}
public File archivo(){
	
	JFileChooser f = new JFileChooser();
	int n = f.showSaveDialog(null);
	File archivo = f.getSelectedFile();
	return archivo;
	
}


}
