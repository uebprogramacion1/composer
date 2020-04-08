package co.edu.unbosque.view;

import java.awt.Font;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.ArchivoFile;

public class View extends JFrame {

	private PanelEntrada PE;
	private JButton btnGuardar;
	private JButton btnDar;
	private JButton btnProperties;

	private ArchivoFile AF;

	private static final long serialVersionUID = 1L;

	public View(Controller c) {
		setSize(500,600);
		setResizable(false);
		setTitle("COMPOSER");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setLayout(null);
		btnGuardar.setBounds(340,400,100,100);
		btnGuardar.setFont(new Font("Comic Sans M", Font.PLAIN, 15));
		btnGuardar.addActionListener(c); 
		add(btnGuardar);
		
		btnDar = new JButton("Dar");
		btnDar.setLayout(null);
		btnDar.setBounds(30,400,100,100);
		btnDar.setFont(new Font("Comic Sans M", Font.PLAIN, 15));
		btnDar.addActionListener(c);
		add(btnDar);
		
		btnProperties = new JButton("Properties");
		btnProperties.setLayout(null);
		btnProperties.setBounds(180,400,120,100);
		btnProperties.setFont(new Font("Comic Sans M", Font.PLAIN, 15));
		btnProperties.addActionListener(c);
		add(btnProperties);
		
		PE = new PanelEntrada(c);
		PE.setBounds(10,0,465,470);
		add(PE);
		
		setVisible(true);
	}
	
	public PanelEntrada getPE() {
		return PE;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public void setPE(PanelEntrada pE) {
		PE = pE;
	}
	public void guardarEstrofa(String es) {
		// aqui se hace lo de guardar el archivo
		try {
			JFileChooser file=new JFileChooser();
			file.showSaveDialog(null);
			
			AF = new ArchivoFile(es, file);
			
		} catch (Exception e) {
			
			
		}
		
	}

}
