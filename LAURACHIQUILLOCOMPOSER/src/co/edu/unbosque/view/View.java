package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class View extends JFrame{

	private JTextArea leer;
	private JButton mostrar;
	private JButton dar;
	private JButton guardar;
	private JFileChooser fc;

	public View() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);
		
		leer= new JTextArea();
		leer.setBounds(20,10,450,400);
		add(leer);
		
		mostrar = new JButton("Mostrar");
		mostrar.setBounds(100,420,100,30);
		add(mostrar);
				
		guardar = new JButton("Guardar");
		guardar.setBounds(200,420,100,30);
		add(guardar);
		
		dar = new JButton("Dar");
		dar.setBounds(300,420,100,30);
		add(dar);
		
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public void salvar() {
		fc= new JFileChooser("user.dir");
		fc.showSaveDialog(fc);
	}
	
	public JFileChooser getFc() {
		return fc;
	}
	public JTextArea getLeer() {
		return leer;
	}
	public void setLeer(JTextArea leer) {
		this.leer = leer;
	}
	public JButton getMostrar() {
		return mostrar;
	}
	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
	}
	public JButton getGuardar() {
		return guardar;
	}
	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}
	public JButton getDar() {
		return dar;
	}
	public void setDar(JButton dar) {
		this.dar = dar;
	}
}
