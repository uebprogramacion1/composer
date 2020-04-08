package co.edu.unbosque.Model;

import co.edu.unbosque.View.View;
import co.edu.unbsoque.Model.persistence.EjemploFile;
import co.edu.unbsoque.Model.persistence.Palabras;

public class Mundo {
	
	public Palabras frase;
	public EjemploFile file;
	public EjercicioArchivo archivo;
	public View view;
	
	public Mundo() {
		
	frase = new Palabras();
	file = new EjemploFile();
	archivo = new EjercicioArchivo();
	view = new View();
		
	
	}

	public Palabras getFrase() {
		return frase;
	}

	public void setFrase(Palabras frase) {
		this.frase = frase;
	}

	public EjemploFile getFile() {
		return file;
	}

	public void setFile(EjemploFile file) {
		this.file = file;
	}

	public EjercicioArchivo getArchivo() {
		return archivo;
	}

	public void setArchivo(EjercicioArchivo archivo) {
		this.archivo = archivo;
	}
	
	
}


