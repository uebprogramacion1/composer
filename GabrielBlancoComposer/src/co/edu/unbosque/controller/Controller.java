package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mundo;
import co.edu.unbosque.view.View;

/**
 * @author Gabriel Blanco Clase Controlador
 *
 */
public class Controller implements ActionListener {

	private Mundo mundo = new Mundo();
	private View view = new View();
	private int cont = 0;

	/**
	 * Método Constructor del Controlador
	 * 
	 * @throws IOException
	 */
	public Controller() throws Exception {
		GUI();
	}

	/**
	 * Método para probar casos puntuales en consola
	 * 
	 * @throws IOException
	 */
	public void Consola() throws Exception {
		// Se inicializa gui aqui ya que es necesario para probar por via JOptionPane
		/*
		 * TODO: Buscar un método mas eficiente para mostrar TODOS los errores por
		 * JOptionPane
		 */
		boolean activo = true;
		while (activo) {
			try {
				int comando = Integer.parseInt(view.getDialogos().input(System.in, "Song Maker: Debugger",
						view.getDialogos().ayuda(), JOptionPane.PLAIN_MESSAGE));
				switch (comando) {
				default:
					view.getDialogos().output("Error", "Bad command!", JOptionPane.ERROR_MESSAGE);
					break;
				case 0:
					activo = false;
					break;
				case 1:
					activo = false;
					GUI();
					break;
				case 2:
					generarCancion();
					break;
				}
			} catch (Exception e) {
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				mundo.getArchivo().makeLog(errors.toString());
				view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
						+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Método para iniciar la GUI
	 */
	public void GUI() throws Exception {
		try {
			view.iniciar(this);
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			mundo.getArchivo().makeLog(errors.toString());
			view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
					+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public String generarCancion() throws Exception {
		// String titulo = view.getDialogos().input(System.in, "Generar una cancion",
		// "Ingresa el titulo de la cancion", JOptionPane.PLAIN_MESSAGE);
		String titulo = "Song " + cont;
		String letra = "";
		for (int i = 0; i < 10; i++) {
			letra += mundo.generarLetra() + "\n";
		}
		mundo.nuevaCancion(letra, titulo);
		String ans = mundo.getCancion()[cont].getLetra();
		mundo.getArchivo().escribirArchivo(letra, view.guardarArchivo());
		mundo.getPropiedad().escribirPropiedad("LineasPorEstrofa", String.valueOf(mundo.getCantLineas()),
				"./docs/composer.properties", null);
		mundo.getPropiedad().escribirPropiedad("EstrofasPorCancion", String.valueOf(mundo.getCantEstrofas()),
				"./docs/composer.properties", null);
		view.getDialogos()
				.output("Operacion Finalizada",
						"Lineas por estrofa leidas: "
								+ mundo.getPropiedad().leerPropiedad("./docs/composer.properties", "LineasPorEstrofa")
								+ "\n" + "Estrofas por cancion leidas: " + mundo.getPropiedad()
										.leerPropiedad("./docs/composer.properties", "EstrofasPorCancion"),
						JOptionPane.INFORMATION_MESSAGE);
		cont++;
		return ans;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// TODO: Ingresar aquí las interacciones con Mundo
			if (e.getActionCommand() == view.getOperaciones().GENERARCANCION) {
				view.getTexto().getArea().setText(generarCancion());
			}

		}
		/*
		 * Estas líneas son para controlar en caso de que por falta de memoria no genere
		 * el log. Esto es vital para el programa ya que me permite llevar una
		 * trazabilidad
		 */
		catch (Exception e2) {
			StringWriter errors = new StringWriter();
			e2.printStackTrace(new PrintWriter(errors));
			try {
				mundo.getArchivo().makeLog(errors.toString());
			} catch (IOException e1) {
				view.getDialogos().output("Error Fatal",
						"Ha ocurrido un error inesperado donde se debe salir del programa.\nMotivo: Error creando el log de archivos",
						JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			}
			view.getDialogos().output("Error", "Ha ocurrido un error inesperado\n"
					+ "Se ha creado en <proyecto>/docs/Output un archivo myLog.txt en donde aparece el detalle específico del error causado.",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
