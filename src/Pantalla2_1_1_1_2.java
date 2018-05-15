import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_2 {

	static JFrame frame;

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
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPizzas = new JLabel("Pizzas");
		lblPizzas.setFont(new Font("Lucida Bright", Font.ITALIC, 25));
		lblPizzas.setBounds(170, 11, 166, 29);
		frame.getContentPane().add(lblPizzas);
		
		JButton btnJamonYQueso = new JButton("Jamon y queso");
		btnJamonYQueso.setIcon(new ImageIcon(Pantalla2_1_1_1_2.class.getResource("/img/jamonyqueso.png")));
		btnJamonYQueso.setBounds(34, 74, 140, 110);
		frame.getContentPane().add(btnJamonYQueso);
		
		JButton btnBarbacoa = new JButton("Barbacoa");
		btnBarbacoa.setIcon(new ImageIcon(Pantalla2_1_1_1_2.class.getResource("/img/barbacoa.jpg")));
		btnBarbacoa.setBounds(240, 74, 145, 110);
		frame.getContentPane().add(btnBarbacoa);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(250, 201, 127, 29);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_2  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_2.frame.setVisible(true);
				Pantalla2_1_1_1_2.frame.setVisible(false);
			}
		});
		
	}

}
