import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Pantalla2_1_1_1_7 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1_7 window = new Pantalla2_1_1_1_7();
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
	public Pantalla2_1_1_1_7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCafes = new JLabel("Cafes");
		lblCafes.setFont(new Font("Lucida Bright", Font.ITALIC, 23));
		lblCafes.setBounds(139, 11, 118, 34);
		frame.getContentPane().add(lblCafes);
		
		JButton btnNewButton = new JButton("Cafe con leche");
		btnNewButton.setIcon(new ImageIcon(Pantalla2_1_1_1_7.class.getResource("/img/cafeleche.png")));
		btnNewButton.setBounds(39, 56, 118, 119);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCafeSinLeche = new JButton("Cafe solo");
		btnCafeSinLeche.setIcon(new ImageIcon(Pantalla2_1_1_1_7.class.getResource("/img/cagesolo.jpg")));
		btnCafeSinLeche.setBounds(234, 56, 118, 119);
		frame.getContentPane().add(btnCafeSinLeche);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(234, 195, 118, 38);
		frame.getContentPane().add(btnAtras);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_1 atraspantalla2_1_1_1_7  = new  Pantalla2_1_1_1();
				atraspantalla2_1_1_1_7.frame.setVisible(true);
				Pantalla2_1_1_1_7.frame.setVisible(false);
			}
		});
		
		
	}

}
