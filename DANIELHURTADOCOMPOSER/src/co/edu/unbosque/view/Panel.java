package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.TextField;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel{
	
	private JLabel etiqueta;
	private JButton boton_mostrar;
	private static final String CREAR = "Crear";
	private TextField resultado;
	


	public Panel() {
	
	setLayout(null);
	inicializarComponentes();
	setVisible(true);//esta mierda es obligatoria
	}
	
	public void inicializarComponentes() {
		
		setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 5, 0 ), new TitledBorder( "Archivos:" ) ) );
		setBackground(Color.BLACK);//color del panel
		etiqueta = new JLabel("Escriba un texto: ");
		etiqueta.setBounds(50,25,400,25); // coordenadas, primero x luego y luego ancho y luego alto
		etiqueta.setForeground(Color.WHITE);// darle color a la etiqueta
		etiqueta.setFont(new java.awt.Font("Pacifico",1,15));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
		add(etiqueta);//esta mierda siempre va de ultimas
		
		boton_mostrar = new JButton("Crear");
		boton_mostrar.setBounds(50,100,150,20);
		boton_mostrar.setFont(new java.awt.Font("Pacifico",1,15));
	    boton_mostrar.setBackground(Color.red.darker());//color boton
		boton_mostrar.setForeground(Color.BLACK);//darle color a la letra del boton
		boton_mostrar.setActionCommand(CREAR);
	    add(boton_mostrar);

	    
	    resultado = new TextField();//se puede meter dos numeros (1: filas y 2:columnas) y si pongo un texto entre comillas es un texto predeterminado
	    resultado.setBounds(250,50,450,200);
	    resultado.setBackground(Color.white);
	    resultado.setForeground(Color.red.brighter());
		resultado.setFont(new java.awt.Font("Pacifico",1,10));//entre comillas tipo de letra y despues el aungulo de inclinacion y tercero tamaño
	    add(resultado);
	    
	}



	public JLabel getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	public JButton getBoton_mostrar() {
		return boton_mostrar;
	}

	public void setBoton_mostrar(JButton boton_mostrar) {
		this.boton_mostrar = boton_mostrar;
	}

	public TextField getResultado() {
		return resultado;
	}

	public void setResultado(TextField resultado) {
		this.resultado = resultado;
	}

	public static String getCrear() {
		return CREAR;
	}

	public String  mostrarResultado(String texto) {
		resultado.setText(texto);
		return texto;
	}
}
