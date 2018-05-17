import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Pantalla2_1 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Pantalla2_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 248);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnIniciarNuevoPedido = new JButton("Iniciar Nuevo Pedido");
		btnIniciarNuevoPedido.setBounds(72, 57, 237, 47);
		frame.getContentPane().add(btnIniciarNuevoPedido);
		btnIniciarNuevoPedido.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Pantalla2_1_1 numerodemesa  = new  Pantalla2_1_1();
			numerodemesa.frame.setVisible(true);
			Pantalla2_1.frame.setVisible(false);

		
		}
		});
	
		
		JButton btnAadirComandasA = new JButton("A\u00F1adir Comandas a un pedido existente");
		btnAadirComandasA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla2_1_1_2 comanda  = new  Pantalla2_1_1_2();
				comanda.frame.setVisible(true);
				Pantalla2_1.frame.setVisible(false);
				
			}
		});
		btnAadirComandasA.setBounds(72, 126, 237, 47);
		frame.getContentPane().add(btnAadirComandasA);
		
		JLabel lblBar = new JLabel("BAR");
		lblBar.setFont(new Font("Haettenschweiler", Font.PLAIN, 20));
		lblBar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBar.setBounds(155, 11, 59, 23);
		frame.getContentPane().add(lblBar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pantalla2_1.class.getResource("/img/escritorio.jpg")));
		lblNewLabel.setBounds(0, 0, 391, 198);
		frame.getContentPane().add(lblNewLabel);
	}
}
