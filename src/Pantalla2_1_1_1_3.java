import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_3 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Pantalla2_1_1_1_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelados = new JLabel("Helados");
		lblHelados.setFont(new Font("Lucida Bright", Font.ITALIC, 24));
		lblHelados.setBounds(147, 11, 133, 23);
		frame.getContentPane().add(lblHelados);
		
		JButton btnChocolate = new JButton("Chocolate");
		btnChocolate.setIcon(new ImageIcon(Pantalla2_1_1_1_3.class.getResource("/img/chocolate.JPG")));
		btnChocolate.setBounds(36, 54, 120, 101);
		frame.getContentPane().add(btnChocolate);
		
		JButton btnVainilla = new JButton("Vainilla");
		btnVainilla.setIcon(new ImageIcon(Pantalla2_1_1_1_3.class.getResource("/img/vainilla.jpg")));
		btnVainilla.setBounds(247, 62, 133, 93);
		frame.getContentPane().add(btnVainilla);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(263, 197, 104, 23);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_3  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_3.frame.setVisible(true);
				Pantalla2_1_1_1_3.frame.setVisible(false);
			}
		});
	}

}
