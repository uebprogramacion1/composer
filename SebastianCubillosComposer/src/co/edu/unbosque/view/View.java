package co.edu.unbosque.view;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame{
	
	private Panel panel;
	private JFileChooser fc;
	
	public View() {
		
		setTitle("Bienvenido");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 640);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		inicializar();
		
		setVisible(true);
	}
	public void inicializar() {
		 
		 panel = new Panel();
		 panel.setBounds(10, 10, 475, 590);
		 getContentPane().add(panel);
	}
	public void salvar() {
		fc = new JFileChooser(System.getProperty("user.dir"));
		fc.showSaveDialog(fc);
	}
	public JFileChooser getFc() {
		return fc;
	}
	public void setFc(JFileChooser fc) {
		this.fc = fc;
	}
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
}
