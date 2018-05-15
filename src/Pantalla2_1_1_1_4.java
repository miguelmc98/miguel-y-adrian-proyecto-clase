import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_4 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_4 window = new Pantalla2_1_1_1_4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla2_1_1_1_4() {
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
		
		JLabel lblNewLabel = new JLabel("Bebidas");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.ITALIC, 22));
		lblNewLabel.setBounds(170, 22, 130, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCocacola = new JButton("Coca-Cola");
		btnCocacola.setIcon(new ImageIcon(Pantalla2_1_1_1_4.class.getResource("/img/cocacola.jpg")));
		btnCocacola.setBounds(49, 71, 113, 124);
		frame.getContentPane().add(btnCocacola);
		
		JButton btnFanta = new JButton("Fanta");
		btnFanta.setIcon(new ImageIcon(Pantalla2_1_1_1_4.class.getResource("/img/fanta.jpg")));
		btnFanta.setBounds(254, 71, 113, 124);
		frame.getContentPane().add(btnFanta);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(264, 216, 89, 23);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_1_4  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_1_4.frame.setVisible(true);
				Pantalla2_1_1_1_4.frame.setVisible(false);
			}
		});
		
	}

}
