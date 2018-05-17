import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Pantalla1_1 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Pantalla1_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 526, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administraci\u00F3n");
		lblNewLabel.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(164, 21, 110, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Productos");
		btnNewButton.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla1_1_2 añadirproducto  = new  Pantalla1_1_2();
				añadirproducto.frame.setVisible(true);
				Pantalla1_1.frame.setVisible(false);

			
			}
		});
		btnNewButton.setBounds(249, 65, 175, 91);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Categoria");
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla1_1_1 añadircategoria  = new  Pantalla1_1_1();
				añadircategoria.frame.setVisible(true);
				Pantalla1_1.frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 65, 175, 91);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla1 atraspantalla1  = new  Pantalla1();
				atraspantalla1.frame.setVisible(true);
				Pantalla1_1.frame.setVisible(false);
			}
			
				
			
		});
		btnAtras.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		btnAtras.setBounds(171, 189, 89, 23);
		frame.getContentPane().add(btnAtras);
		
	}
}
