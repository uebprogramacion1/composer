package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_1 extends JPanel {
		
		
		private JTextArea cancion;
		private JButton crear;
		private JButton buscar;
		
		
		
		
		
		public Panel_1() {
			
			setLayout(null);
	        inicializar();
			
			setVisible(true);
		}

		public void inicializar() {
			
			
			
			crear=new JButton("Crear cancion y guardarla");
			crear.setBounds(40, 400, 200, 20);
			add(crear);
			
			buscar=new JButton("Buscar cancion");
			buscar.setBounds(250, 400, 150, 20);
			add(buscar);
			
			
			
			cancion= new JTextArea();
			cancion.setEnabled(false);
			cancion.setBackground(Color.black);
			cancion.setBounds(20, 20, 420, 380);
			add(cancion);
			
			
			
			
			
			
			
		}

		
		
		
		public JButton getCrear() {
			return crear;
		}

		public void setCrear(JButton crear) {
			this.crear = crear;
		}

		public JButton getBuscar() {
			return buscar;
		}

		public void setBuscar(JButton buscar) {
			this.buscar = buscar;
		}

		public JTextArea getCancion() {
			return cancion;
		}

		public void setCancion(JTextArea cancion) {
			this.cancion = cancion;
		}
		
		

}
