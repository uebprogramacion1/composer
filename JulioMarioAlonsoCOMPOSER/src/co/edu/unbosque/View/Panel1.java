package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Panel1 extends JPanel{

	public JButton boton_validar;
	public JTextArea campo_texto;
	
	public Panel1() {
		setLayout(null);
		setBackground(Color.white);
		
		
		
       inicializarComponentes();
     
      
		setBorder(new CompoundBorder(new EmptyBorder(0, 0, 5, 0),
		        new TitledBorder("")));
	}
	private void inicializarComponentes() {
		
	boton_validar = new JButton("Generar Cancion");
	boton_validar.setBounds(210, 320, 120, 25);
	add(boton_validar);
		
	campo_texto = new JTextArea();
	campo_texto.setBounds(10, 10, 530, 320);
    campo_texto.setBackground(Color.white);
    campo_texto.setEditable(false);
    add(campo_texto);
	}
}