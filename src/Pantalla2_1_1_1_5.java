import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_5 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_5 window = new Pantalla2_1_1_1_5();
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
	public Pantalla2_1_1_1_5() {
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
		
		JLabel lblCarvezas = new JLabel("Cervezas");
		lblCarvezas.setFont(new Font("Lucida Bright", Font.ITALIC, 23));
		lblCarvezas.setBounds(145, 11, 144, 36);
		frame.getContentPane().add(lblCarvezas);
		
		JButton btnConAlcohol = new JButton("Con alcohol");
		btnConAlcohol.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\cerveza.jpg"));
		btnConAlcohol.setBounds(39, 84, 117, 91);
		frame.getContentPane().add(btnConAlcohol);
		
		JButton btnSinAlcohol = new JButton("Sin alcohol");
		btnSinAlcohol.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\cervezasin.jpg"));
		btnSinAlcohol.setBounds(247, 84, 117, 104);
		frame.getContentPane().add(btnSinAlcohol);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(247, 211, 117, 23);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_1_5  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_1_5.frame.setVisible(true);
				Pantalla2_1_1_1_5.frame.setVisible(false);
			}
		});
		
	}

}
