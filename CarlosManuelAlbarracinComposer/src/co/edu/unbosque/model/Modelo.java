package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Frases;
import co.edu.unbosque.model.persistence.Propiedades;

public class Modelo {

	private int a, b, c, d, e, f;
	private String estrofa1, estrofa2, estrofa3, estrofa4, composicion, composicionProp;
	Frases fra;
	Propiedades file;

	public Modelo() {

		file = new Propiedades();
		fra = new Frases();

		estrofa1 = "";
		composicion = "";
		for (int i = 0; i < 4; i++) {

			a = (int) (Math.random() * 4);
			b = (int) (Math.random() * 4);
			c = (int) (Math.random() * 4);
			d = (int) (Math.random() * 4);
			e = (int) (Math.random() * 4);
			f = (int) (Math.random() * 4);

			estrofa1 = estrofa1 + fra.getFrase1(a) + " " + fra.getFrase2(b) + " " + fra.getFrase3(c) + " "
					+ fra.getFrase4(d) + " " + fra.getFrase5(e) + " " + fra.getFrase6(f) + " " + "\n";
		}
		estrofa2 = "";
		for (int i = 0; i < 4; i++) {

			a = (int) (Math.random() * 4);
			b = (int) (Math.random() * 4);
			c = (int) (Math.random() * 4);
			d = (int) (Math.random() * 4);
			e = (int) (Math.random() * 4);
			f = (int) (Math.random() * 4);

			estrofa2 = estrofa2 + fra.getFrase1(a) + " " + fra.getFrase2(b) + " " + fra.getFrase3(c) + " "
					+ fra.getFrase4(d) + " " + fra.getFrase5(e) + " " + fra.getFrase6(f) + " " + "\n";
		}
		estrofa3 = "";
		for (int i = 0; i < 4; i++) {

			a = (int) (Math.random() * 4);
			b = (int) (Math.random() * 4);
			c = (int) (Math.random() * 4);
			d = (int) (Math.random() * 4);
			e = (int) (Math.random() * 4);
			f = (int) (Math.random() * 4);

			estrofa3 = estrofa3 + fra.getFrase1(a) + " " + fra.getFrase2(b) + " " + fra.getFrase3(c) + " "
					+ fra.getFrase4(d) + " " + fra.getFrase5(e) + " " + fra.getFrase6(f) + " " + "\n";
		}
		estrofa4 = "";
		for (int i = 0; i < 4; i++) {

			a = (int) (Math.random() * 4);
			b = (int) (Math.random() * 4);
			c = (int) (Math.random() * 4);
			d = (int) (Math.random() * 4);
			e = (int) (Math.random() * 4);
			f = (int) (Math.random() * 4);

			estrofa4 = estrofa4 + fra.getFrase1(a) + " " + fra.getFrase2(b) + " " + fra.getFrase3(c) + " "
					+ fra.getFrase4(d) + " " + fra.getFrase5(e) + " " + fra.getFrase6(f) + " " + "\n";
		}
		composicion += estrofa1 + "\n" + estrofa2 + "\n" + estrofa3 + "\n" + estrofa4;
		file.setCancion(composicion);
		file.escribirPropiedades();
		composicionProp = file.leerPropiedades();

	}

	public String getComposicion() {
		return composicion;
	}

	public void setComposicion(String composicion) {
		this.composicion = composicion;
	}

	public String getComposicionProp() {
		return composicionProp;
	}

}
