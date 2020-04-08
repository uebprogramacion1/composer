package co.edu.unbosque.view;

import java.awt.Color;
import javax.swing.JFrame;

public class View2 extends JFrame{
	private Panel panel;
	
	public View2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200,200);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.GRAY);

		
		panel= new Panel();
		panel.setBounds(1,1,200,100);
		add(panel);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
