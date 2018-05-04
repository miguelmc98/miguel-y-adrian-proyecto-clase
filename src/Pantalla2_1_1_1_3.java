import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Pantalla2_1_1_1_3 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_3 window = new Pantalla2_1_1_1_3();
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
	public Pantalla2_1_1_1_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelados = new JLabel("Helados");
		lblHelados.setBounds(177, 11, 46, 14);
		frame.getContentPane().add(lblHelados);
		
		JButton btnChocolate = new JButton("Chocolate");
		btnChocolate.setBounds(41, 85, 104, 74);
		frame.getContentPane().add(btnChocolate);
		
		JButton btnVainilla = new JButton("Vainilla");
		btnVainilla.setBounds(263, 85, 104, 68);
		frame.getContentPane().add(btnVainilla);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(263, 197, 104, 23);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_3  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_3.frame.setVisible(true);
			}
		});
	}

}
