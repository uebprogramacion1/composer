package co.edu.unbosque.view;

import java.awt.Color;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class View extends JFrame{
		
		
		
		private Panel_1 panel_1;
		
		
		public View() {
		
			
			
			 getContentPane().setLayout(null);
			 setTitle("Creador de musica");
			 
			 setBounds(0,0,500,500);
			 setResizable(false);
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 getContentPane().setBackground(Color.white);
			 
			
			 inicializar();
			 
		

			
			 
			 setLocationRelativeTo(null);
			 setVisible(true);
		}


		private void inicializar() {
			
			
			 
			 panel_1 = new Panel_1();
			 panel_1.setBounds(20,20,460,430);
			 getContentPane().add(panel_1);
			 panel_1.setBackground(Color.darkGray);
		
			
		}
		
		
		public File fileChooser() {
			
			JFileChooser algo=new JFileChooser();
			int numero = algo.showSaveDialog(null);
			File archivo = algo.getSelectedFile();
			
			
			return archivo;
			
		}


		public Panel_1 getPanel_1() {
			return panel_1;
		}


		public void setPanel_1(Panel_1 panel_1) {
			this.panel_1 = panel_1;
		}
		
		
		

}
