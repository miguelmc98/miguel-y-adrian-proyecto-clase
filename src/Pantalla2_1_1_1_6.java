import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_6 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_6 window = new Pantalla2_1_1_1_6();
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
	public Pantalla2_1_1_1_6() {
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
		
		JLabel lblCopas = new JLabel("Copas");
		lblCopas.setFont(new Font("Lucida Bright", Font.ITALIC, 23));
		lblCopas.setBounds(156, 11, 89, 38);
		frame.getContentPane().add(lblCopas);
		
		JButton btnRon = new JButton("Ron barcelo");
		btnRon.setIcon(new ImageIcon(Pantalla2_1_1_1_6.class.getResource("/img/barcelo.jpg")));
		btnRon.setBounds(31, 60, 112, 129);
		frame.getContentPane().add(btnRon);
		
		JButton btnBombay = new JButton("Bombay");
		btnBombay.setIcon(new ImageIcon(Pantalla2_1_1_1_6.class.getResource("/img/bombay.jpg")));
		btnBombay.setBounds(238, 60, 112, 121);
		frame.getContentPane().add(btnBombay);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(249, 211, 89, 23);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_1_6  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_1_6.frame.setVisible(true);
			}
		});
		
	}

}
