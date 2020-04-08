package co.edu.unbosque.model;

public class Cancion {
	
	private String letra, titulo;
	
	public Cancion(String letra, String titulo) {
		this.letra = letra; this.titulo = titulo;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
