package co.edu.unbosque.view;

import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMostrarCancion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton guardarCancion;
	private JButton mostrarCancion;
	private TextArea campoMostrar;

	public PanelMostrarCancion() {

		setLayout(null);
		inicializarComponentes();

		setVisible(true);
	}

	private void inicializarComponentes() {
		mostrarCancion = new JButton("Mostrar Cancion");
		mostrarCancion.setBounds(300, 10, 250, 40);
		add(mostrarCancion);
		guardarCancion = new JButton("Guardar Cancion");
		guardarCancion.setBounds(0, 10,250, 40);
		add(guardarCancion);
		campoMostrar = new TextArea();
		campoMostrar.setBounds(10, 65, 560, 490);
		add(campoMostrar);
	}


	public void mostrarResultado(String resultado) {
		campoMostrar.setText(resultado);
	}

	public JButton getGuardarCancion() {
		return guardarCancion;
	}

	public void setGuardarCancion(JButton guardarCancion) {
		this.guardarCancion = guardarCancion;
	}

	public JButton getMostrarCancion() {
		return mostrarCancion;
	}

	public void setMostrarCancion(JButton mostrarCancion) {
		this.mostrarCancion = mostrarCancion;
	}

	public TextArea getCampoMostrar() {
		return campoMostrar;
	}

	public void setCampoMostrar(TextArea campoMostrar) {
		this.campoMostrar = campoMostrar;
	}


}
