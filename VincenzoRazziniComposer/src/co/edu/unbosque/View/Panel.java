package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel{
	
	public JButton boton_validar;
	public JTextArea campo_texto;
	
	public Panel() {
		setLayout(null);
		setBackground(Color.red);
		
		
		
       inicializarComponentes();
		
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0),
		        new TitledBorder("Capturar datos")));
		
		
	}
		
	
	private void inicializarComponentes() {
		
		
		
		boton_validar = new JButton("Generar Cancion");
		boton_validar.setBounds(210, 300, 120, 25);
		add(boton_validar);
		
		campo_texto = new JTextArea();
		campo_texto.setBounds(15, 30, 500, 267);
        campo_texto.setBackground(Color.pink);
        campo_texto.setEditable(false);
		add(campo_texto);
		
	}

	
	}




