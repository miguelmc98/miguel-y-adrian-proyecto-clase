import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Pantalla1 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 window = new Pantalla1();
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
	public Pantalla1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 439, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAfter = new JLabel("AFTERNOM");
		lblAfter.setFont(new Font("Haettenschweiler", Font.PLAIN, 18));
		lblAfter.setHorizontalAlignment(SwingConstants.CENTER);
		lblAfter.setBounds(108, 11, 182, 31);
		frame.getContentPane().add(lblAfter);
		
		JButton btnAdministracin = new JButton("ADMINISTRACION");
		btnAdministracin.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		btnAdministracin.setBounds(44, 200, 293, 23);
		frame.getContentPane().add(btnAdministracin);{
			btnAdministracin.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Pantalla1_1 Administracion  = new  Pantalla1_1();
					Administracion.frame.setVisible(true);
					Pantalla1.frame.setVisible(false);

				}
				});
		
		
		}
		JButton btnBar = new JButton("BAR");
		btnBar.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		btnBar.setBounds(44, 53, 293, 133);
		frame.getContentPane().add(btnBar);
		btnBar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Pantalla2_1 Administracion  = new  Pantalla2_1();
			Administracion.frame.setVisible(true);
			Pantalla1.frame.setVisible(false);

		}
		});
	}}


