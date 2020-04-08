package co.edu.unbosque.persistence;
import java.io.*;


public class ArchivoFile {
  
  private File carpetaDocs = new File("./docs");
  private File carpetaOutput = new File("./docs/Output");

	public ArchivoFile() {
		if (!carpetaDocs.exists())
			carpetaDocs.mkdir();
		if (!carpetaOutput.exists())
			carpetaOutput.mkdir();
	}
	public String leerArchivo(String ubicacion) throws IOException {
		String pastLine = "";
		File archivoAyuda = new File(ubicacion);
		FileReader reader = new FileReader(archivoAyuda);
		BufferedReader buffer = new BufferedReader(reader);
		String ayuda = buffer.readLine();
		while (ayuda != null) {
			pastLine += ayuda + "\n";
			ayuda = buffer.readLine();
		}
		reader.close();
		return pastLine;
	}
	public void escribirArchivo(String linea, String ubicacion) throws IOException {
		File file = new File(ubicacion);
		FileWriter writer = new FileWriter(file);
		PrintWriter printer = new PrintWriter(writer);
		printer.println(linea);
		writer.close();
	}

	
	public void sobreescribirArchivo(String linea, String ubicacion) throws IOException {
		File file = new File(ubicacion);
		FileWriter writer = new FileWriter(file, true);
		PrintWriter printer = new PrintWriter(writer);
		printer.println(linea);
		writer.close();
	}
	
	
}
	


