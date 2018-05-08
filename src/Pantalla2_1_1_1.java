import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla2_1_1_1 {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2_1_1_1 window = new Pantalla2_1_1_1();
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
	public Pantalla2_1_1_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 1215, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton BotonBebida = new JButton("refrescos");
		BotonBebida.setBackground(Color.BLACK);
		BotonBebida.setForeground(Color.BLACK);
		BotonBebida.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\drink_20623.png"));
		BotonBebida.setBounds(47, 283, 161, 137);
		frame.getContentPane().add(BotonBebida);
		
		BotonBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_4 refrescos  = new  Pantalla2_1_1_1_4();
				refrescos.frame.setVisible(true);
			
			}
			});
		
		
		
		
		JButton BotonCafe = new JButton("cafes");
		BotonCafe.setForeground(Color.BLACK);
		BotonCafe.setBackground(Color.BLACK);
		BotonCafe.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\coffee-bean-icon.png"));
		BotonCafe.setBounds(991, 283, 161, 137);
		frame.getContentPane().add(BotonCafe);
		
		
		BotonCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_7 coffe  = new  Pantalla2_1_1_1_7();
				coffe.frame.setVisible(true);
			
			}
			});
		
		
		
		
		
		JButton BotonHamburguesa = new JButton("hamburguesa");
		BotonHamburguesa.setBackground(Color.BLACK);
		BotonHamburguesa.setForeground(Color.BLACK);
		BotonHamburguesa.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\burger-icon.png"));
		BotonHamburguesa.setBounds(167, 72, 161, 137);
		frame.getContentPane().add(BotonHamburguesa);
		
		
		
		BotonHamburguesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_1 hamburguesas = new  Pantalla2_1_1_1_1();
				hamburguesas.frame.setVisible(true);
			
			}
			});
		
		
		
		
		JButton BotonCervezas = new JButton("cerveza");
		BotonCervezas.setForeground(Color.BLACK);
		BotonCervezas.setBackground(Color.BLACK);
		BotonCervezas.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\beer-icon.png"));
		BotonCervezas.setBounds(368, 283, 161, 137);
		frame.getContentPane().add(BotonCervezas);
		
		
		BotonCervezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_5 cervezas  = new  Pantalla2_1_1_1_5();
			cervezas.frame.setVisible(true);
			
			}
			});
		
		
		
		
		JButton BotonCopas = new JButton("copas");
		BotonCopas.setForeground(Color.BLACK);
		BotonCopas.setBackground(Color.BLACK);
		BotonCopas.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\drink-2-icon.png"));
		BotonCopas.setBounds(679, 283, 161, 137);
		frame.getContentPane().add(BotonCopas);
		
		
		BotonCopas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_6 copas  = new  Pantalla2_1_1_1_6();
				copas.frame.setVisible(true);
			
			}
			});
		
		
		
		
		JButton BotonPizza = new JButton("pizza");
		BotonPizza.setBackground(Color.BLACK);
		BotonPizza.setForeground(Color.BLACK);
		BotonPizza.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\pizzaaaaaaaaaaa.png"));
		BotonPizza.setBounds(525, 72, 161, 137);
		frame.getContentPane().add(BotonPizza);
		
		
		BotonPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_2 pizzas  = new  Pantalla2_1_1_1_2();
			pizzas.frame.setVisible(true);
			
			}
			});
		
		
		JButton BotonPostres = new JButton("helados");
		BotonPostres.setBackground(Color.BLACK);
		BotonPostres.setForeground(Color.BLACK);
		BotonPostres.setIcon(new ImageIcon("C:\\Users\\DAW1\\Desktop\\icecream-2-icon.png"));
		BotonPostres.setBounds(897, 72, 161, 137);
		frame.getContentPane().add(BotonPostres);
		
		
		
		
		BotonPostres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla2_1_1_1_3 helados  = new  Pantalla2_1_1_1_3();
				helados.frame.setVisible(true);
				Pantalla2_1_1_1.frame.setVisible(false);
			
			}
			});
		
		
		
		
		
		
		
		
		
		JLabel lblHamburguesas = new JLabel("Hamburguesas");
		lblHamburguesas.setHorizontalAlignment(SwingConstants.CENTER);
		lblHamburguesas.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblHamburguesas.setBounds(167, 220, 161, 28);
		frame.getContentPane().add(lblHamburguesas);
		
		JLabel lblPizzas = new JLabel("Pizzas");
		lblPizzas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPizzas.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblPizzas.setBounds(525, 220, 161, 28);
		frame.getContentPane().add(lblPizzas);
		
		JLabel lblHelados = new JLabel("Helados");
		lblHelados.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelados.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblHelados.setBounds(897, 220, 161, 28);
		frame.getContentPane().add(lblHelados);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBebidas.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblBebidas.setBounds(47, 431, 161, 28);
		frame.getContentPane().add(lblBebidas);
		
		JLabel lblCervezas = new JLabel("Cervezas");
		lblCervezas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCervezas.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblCervezas.setBounds(368, 431, 161, 28);
		frame.getContentPane().add(lblCervezas);
		
		JLabel lblCopas = new JLabel("Copas");
		lblCopas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCopas.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblCopas.setBounds(679, 431, 161, 28);
		frame.getContentPane().add(lblCopas);
		
		JLabel lblCafe = new JLabel("Cafe");
		lblCafe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafe.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblCafe.setBounds(991, 431, 161, 28);
		frame.getContentPane().add(lblCafe);
		
		JLabel lblCategorias = new JLabel("CATEGORIAS");
		lblCategorias.setFont(new Font("Haettenschweiler", Font.PLAIN, 26));
		lblCategorias.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategorias.setBounds(525, 11, 161, 28);
		frame.getContentPane().add(lblCategorias);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(502, 36, 199, 449);
		frame.getContentPane().add(separator);
	}
}
