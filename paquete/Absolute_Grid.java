package paquete;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Absolute_Grid {
	public static void main(String[] args) {
		// Definimps el frame
		JFrame frame = new JFrame("Java Layout");
		// Panel para GridLayout
		JPanel GridPanel = new JPanel(new GridLayout(3, 3));
		// Un bucle for para insertar 9 botones en el GridPanel
		for(int i = 1; i <= 9; i++) {
			JButton button = new JButton("Grid " + i);
			GridPanel.add(button);
		}
		// Panel de AbsoluteLayout
		JPanel AbsolutePanel = new JPanel(null);
		// Creamos dos botones
		JButton absolute1 = new JButton("Absolute 1");
		JButton absolute2 = new JButton("Absolute 2");
		// Les ponemos una posicion absoluta (eje x, eje y, anchura, altura)
		absolute1.setBounds(50, 50, 100, 30);
		absolute2.setBounds(400, 100, 120, 60);
		
		AbsolutePanel.add(absolute1);
		AbsolutePanel.add(absolute2);
		// Creamos un objeto JTabbedPane
		JTabbedPane tabPane = new JTabbedPane();
		/* Creamos un panel que hara de contenedor (este panel guardara 2 paneles 
		 * dentro), haremos que cada panel ocupe una mitad del panel contenedor*/
		JPanel tabContainer1 = new JPanel(new GridLayout(2, 1));
		JPanel tabContainer2 = new JPanel(new GridLayout(2, 1));
		JPanel tabContainer3 = new JPanel(new GridLayout(2, 1));
		
		// Agregamos los dos paneles dentro del panel contenedor
		tabContainer2.add(AbsolutePanel);
		tabContainer2.add(GridPanel);
		// Creamos un tab, agregando el contenedor como segundo parametro
		tabPane.addTab("PABLO (1)", tabContainer1);
		tabPane.addTab("Absolute - Grid", tabContainer2);
		tabPane.addTab("AIMAR (3)", tabContainer3);
		// Agregamos el Taboane al frame
		frame.setContentPane(tabPane);
		frame.setSize( 600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
