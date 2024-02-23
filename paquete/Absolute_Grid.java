package paquete;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class Absolute_Grid {
	public static void main(String[] args) {
		// Definimos el frame
		JFrame frame = new JFrame("Java Layout");
		// Panel GridLayout
		JPanel GridPanel = new JPanel(new GridLayout(3, 3));
		// Un bucle for para insertar 9 botones en el GridPanel
		for (int i = 1; i <= 9; i++) {
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
		// Los agregamos al panel
		AbsolutePanel.add(absolute1);
		AbsolutePanel.add(absolute2);
		// Creamos un objeto JTabbedPane
		JTabbedPane tabPane = new JTabbedPane();
		/*
		 * Creamos un panel que hara de contenedor (este panel guardara 2 paneles
		 * dentro), haremos que cada panel ocupe una mitad del panel contenedor
		 */
		JPanel tabContainer1 = new JPanel(new GridLayout(2, 1));
		JPanel tabContainer2 = new JPanel(new GridLayout(2, 1));
		JPanel tabContainer3 = new JPanel(new GridLayout(2, 1));

		// GridBagLayout es lo mismo que GridLayout, pero este tiene mas opciones de personalizacion
		// es por eso que tabien es un layout complicado de manejar
		JPanel Gridbagpanel = new JPanel(new GridBagLayout());
		
		// Definimos dos GridBagConstraints, uno para cada boton
		GridBagConstraints container1 = new GridBagConstraints();
		GridBagConstraints container2 = new GridBagConstraints();
		// Creamos los botones
		JButton Gridbag1 = new JButton("Gridbag 1");
		JButton Gridbag2 = new JButton("Gridbag 2");
		// Especificamos las coordenadas de posicionamiento que va a tener el boton
		// (gridx/gridy)
		container1.gridx = 2;
		container1.gridy = 2;
		// Especificamos la anchura y la altura (gridwidth/gridheight)
		container1.gridwidth = 100;
		container1.gridheight = 100;
		// Insertamos el boton al JPanel junto con las propiedades del boton
		Gridbagpanel.add(Gridbag1, container1);

		container1.gridx = 1;
		container1.gridy = 0;

		Gridbagpanel.add(Gridbag2, container2);

		// Panel de BorderLayout
		JPanel Borderpanel = new JPanel(new BorderLayout());
		// Creamos los botones
		JButton border1 = new JButton("border north");
		JButton border2 = new JButton("border east");
		JButton border3 = new JButton("border center");
		JButton border4 = new JButton("border west");
		JButton border5 = new JButton("border south");
		// Insertamos los botones al JPanel, en el segundo parametro especificamos hacia
		// que direccion queremos enviar el elemento
		Borderpanel.add(border1, BorderLayout.NORTH);
		Borderpanel.add(border2, BorderLayout.EAST);
		Borderpanel.add(border3, BorderLayout.CENTER);
		Borderpanel.add(border4, BorderLayout.WEST);
		Borderpanel.add(border5, BorderLayout.SOUTH);

		// Crear un nuevo panel Flow, establece el layout como FlowLayout
		JPanel FlowPanel = new JPanel(new FlowLayout()); // Se crea el objeto frame (ventana)
		// Crea los botones que se añadirán al panel
		FlowPanel.add(new JButton("Flow 1"));
		FlowPanel.add(new JButton("Flow 2"));
		FlowPanel.add(new JButton("Flow 3"));
		FlowPanel.add(new JButton("Flow 4"));
		FlowPanel.add(new JButton("Flow 5"));
		FlowPanel.add(new JButton("Flow 6"));
		FlowPanel.add(new JButton("Flow 7"));
		FlowPanel.add(new JButton("Flow 8"));
		FlowPanel.add(new JButton("Flow 9"));
		FlowPanel.add(new JButton("Flow 10"));
		FlowPanel.add(new JButton("Flow 11"));
		FlowPanel.add(new JButton("Flow 12"));
		// Muestra el marco
		FlowPanel.setVisible(true);

		// Crear un nuevo panel Box
		JPanel BoxPanel = new JPanel(); // Se crea el objeto frame (ventana)
		JButton jbtn1, jbtn2, jbtn3, jbtn4; // Se usa para crear los botones.
		// Define el modo layput del panel y crea el "boxlayout.X_AXIS" para alinear el
		// contenido de izquierdad a derecha
		BoxPanel.setLayout(new BoxLayout(BoxPanel, BoxLayout.X_AXIS));
		// Definimos los border del "panel"
		BoxPanel.setBorder(new EmptyBorder(new Insets(50, 150, 100, 150)));
		// Se inicializan los botones
		jbtn1 = new JButton("Box 1");
		jbtn2 = new JButton("Box 2");
		jbtn3 = new JButton("Box 3");
		jbtn4 = new JButton("Box 4");
		// Se añaden los botones al panel
		BoxPanel.add(jbtn1);
		BoxPanel.add(jbtn2);
		BoxPanel.add(jbtn3);
		BoxPanel.add(jbtn4);

		// Agregamos los dos paneles dentro del panel contenedor
		tabContainer1.add(FlowPanel);
		tabContainer1.add(BoxPanel);
		tabContainer2.add(AbsolutePanel);
		tabContainer2.add(GridPanel);
		tabContainer3.add(Borderpanel);
		tabContainer3.add(Gridbagpanel);
		// Creamos un tab, agregando el contenedor como segundo parametro
		tabPane.addTab("Flow - Box", tabContainer1);
		tabPane.addTab("Absolute - Grid", tabContainer2);
		tabPane.addTab("Border - Gridbag", tabContainer3);
		// Agregamos el Tabpane al frame
		frame.setContentPane(tabPane);
		// Definimps el ancho y el alto de JFrame
		frame.setSize(600, 600);
		// Hacemos que por defecto se posicione en el centro
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
