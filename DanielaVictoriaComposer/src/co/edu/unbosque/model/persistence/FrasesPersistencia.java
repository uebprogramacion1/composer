package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrasesPersistencia {

	public String escribirCancion(String dato, JFileChooser fc) {

		File f = fc.getSelectedFile();
		try {

			FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
			PrintWriter pw = new PrintWriter(fw);

			pw.write(dato);

			JOptionPane.showMessageDialog(null, "Archivo listo");
			fw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Archivo existente");
		}
		return "Guardado";

	}

}
