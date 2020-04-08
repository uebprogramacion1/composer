package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Dialogos {
	public void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(null,mensaje);
	}
	
	public String leerDatoString(String mensaje){
		String aux = JOptionPane.showInputDialog(mensaje);
		return aux;
	}
	
	public int leerEntero(String mensaje){
		int e = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return e;
	}
	public double leerDouble(String mensaje) {
		double e = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return e;
	}
	public void mostrarMensajeArreglo(String mensaje[]){
		JOptionPane.showMessageDialog(null,mensaje);
	}

}
