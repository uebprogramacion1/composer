package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.persistence.*;

public class Cancion {

	private Propiedades prop;

	public Cancion(Propiedades pr) {

		prop = pr;
	}

	public String darCancion(String frases1[], String frases2[], String frases3[], String frases4[], String frases5[],
			String frases6[]) 
	{
		String letra = "";
		int aleatorio = (int) Math.floor(Math.random()*(frases1.length));
		letra = frases1[aleatorio] + " ";
		int aleatorio2 = (int) Math.floor(Math.random()*(frases2.length));
		letra += frases2[aleatorio2] + " ";
		int aleatorio3 = (int) Math.floor(Math.random()*(frases3.length));
		letra += frases3[aleatorio3] + " ";
		int aleatorio4 = (int) Math.floor(Math.random()*(frases4.length));
		letra += frases4[aleatorio4] + " ";
		int aleatorio5 = (int) Math.floor(Math.random()*(frases5.length));
		letra += frases5[aleatorio5] + " ";
		int aleatorio6 = (int) Math.floor(Math.random()*(frases6.length));
		letra += frases6[aleatorio6];

		return letra;
	}

	public String darEstrofa(String frases1[], String frases2[], String frases3[], String frases4[], String frases5[],
			String frases6[]) {
		

		String propiedades = prop.leerPropiedades();
		String[] spliir = propiedades.split(",");

		String Estrofas[] = new String[Integer.parseInt(spliir[0])];
		String rts="";
		

		for (int i = 0; i < Integer.parseInt(spliir[1]) ; i++) {

			Estrofas[i]= darCancion(frases1, frases2, frases3, frases4, frases5, frases6);

		}

		for (int i = 0; i < Estrofas.length; i++) {

			rts+=Estrofas[i];
		}
		return rts;
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	
}
