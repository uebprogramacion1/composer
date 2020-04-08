package co.edu.unbosque.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Archivo {
	public static String escribirCancion(String dato){
		JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
		fc.showSaveDialog(fc);
		File f = fc.getSelectedFile();
		
		try
		{
			FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
			PrintWriter pw = new PrintWriter(fw);

			pw.write(dato);

			JOptionPane.showMessageDialog(null, "Canción escrita");
			fw.close();
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "Cancion ya existe");
		}
		return "";


	}
}
