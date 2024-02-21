package paquete;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Grid_Absolute {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java Layout");
		JPanel panel = new JPanel(new FlowLayout());
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Opciones");
		
		JMenuItem item1 = new JMenuItem("Absolute - Grid");
		JMenuItem item2 = new JMenuItem("Flow - Box");
		JMenuItem item3 = new JMenuItem("Border - GridBag");
		
		
		item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
		
		item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
		
		item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menuBar.add(menu);
		
		frame.setJMenuBar(menuBar);
		frame.setContentPane(panel);
		frame.setBounds(150, 150, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
