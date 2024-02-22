package paquete;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		
		JPanel Gridbagpanel = new JPanel();
	     Gridbagpanel.setLayout(new GridBagLayout());
	     GridBagConstraints container1 = new GridBagConstraints();
	     GridBagConstraints container2 = new GridBagConstraints();
	     JButton Gridbag1 = new JButton("Gridbag 1");
	     JButton Gridbag2 = new JButton("Gridbag 2");
		 // Especificamos las coordenadas de posicionamiento que va a tener el boton (gridx/gridy)
	     container1.gridx= 2;
	     container1.gridy= 2;
		 // Especificamos la anchura y la altura (gridwidth/gridheight)
	     container1.gridwidth=100;
	     container1.gridheight=100;
		 // Insertamos el boton al JPanel junto con las propiedades del boton
	     Gridbagpanel.add(Gridbag1, container1);
	     
	     container1.gridx= 1;
	     container1.gridy= 0;
	     
	     Gridbagpanel.add(Gridbag2, container2);
	   
	     // Panel de BorderLayout
	     JPanel Borderpanel = new JPanel(new BorderLayout());
		 // Creamos los botones
	     JButton border1 = new JButton("border north");
	     JButton border2 = new JButton("border east");
	     JButton border3= new JButton("border center");
	     JButton border4 = new JButton("border west");
	     JButton border5 = new JButton("border south");
		 // Insertamos los botones al JPanel, en el segundo parametro especificamos hacia que direccion queremos enviar el elemento
	     Borderpanel.add(border1, BorderLayout.NORTH);
	     Borderpanel.add(border2, BorderLayout.EAST);
	     Borderpanel.add(border3, BorderLayout.CENTER);
	     Borderpanel.add(border4, BorderLayout.WEST);
	     Borderpanel.add(border5, BorderLayout.SOUTH);
		
		// Agregamos los dos paneles dentro del panel contenedor
		tabContainer2.add(AbsolutePanel);
		tabContainer2.add(GridPanel);
		tabContainer3.add(Borderpanel);
		tabContainer3.add(Gridbagpanel);
		// Creamos un tab, agregando el contenedor como segundo parametro
		tabPane.addTab("PABLO (1)", tabContainer1);
		tabPane.addTab("Absolute - Grid", tabContainer2);
		tabPane.addTab("Border - Gridbag", tabContainer3);
		// Agregamos el Taboane al frame
		frame.setContentPane(tabPane);
		frame.setSize( 600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
