import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Pantalla2_1_1_1_2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_2 window = new Pantalla2_1_1_1_2();
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
	public Pantalla2_1_1_1_2() {
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
		
		JLabel lblPizzas = new JLabel("Pizzas");
		lblPizzas.setBounds(192, 11, 46, 14);
		frame.getContentPane().add(lblPizzas);
		
		JButton btnJamonYQueso = new JButton("Jamon y queso");
		btnJamonYQueso.setBounds(36, 94, 127, 70);
		frame.getContentPane().add(btnJamonYQueso);
		
		JButton btnBarbacoa = new JButton("Barbacoa");
		btnBarbacoa.setBounds(258, 94, 127, 70);
		frame.getContentPane().add(btnBarbacoa);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(258, 201, 127, 29);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_2  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_2.frame.setVisible(true);
			}
		});
		
	}

}
