import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla1_1_2 {

	static JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1_1_2 window = new Pantalla1_1_2();
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
	public Pantalla1_1_2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.getContentPane().setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		frame.setBounds(100, 100, 531, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAadirProducto = new JLabel("A\u00F1adir Producto ");
		lblAadirProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadirProducto.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblAadirProducto.setBounds(58, 0, 107, 24);
		frame.getContentPane().add(lblAadirProducto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(105, 43, 86, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblIdProducto = new JLabel("Id Producto:");
		lblIdProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdProducto.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblIdProducto.setBounds(10, 43, 70, 14);
		frame.getContentPane().add(lblIdProducto);
		
		JLabel lblProducto = new JLabel("Categoria");
		lblProducto.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblProducto.setBounds(20, 74, 67, 17);
		frame.getContentPane().add(lblProducto);
		
		JButton button = new JButton("A\u00F1adir");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		button.setBackground(Color.GRAY);
		button.setBounds(34, 202, 157, 38);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Editar");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(34, 251, 157, 38);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Eliminar");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(34, 299, 157, 38);
		frame.getContentPane().add(button_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(220, 29, 285, 226);
		frame.getContentPane().add(table);
		
		JLabel label_3 = new JLabel("Id");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		label_3.setBounds(225, 7, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("NOMBRE");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setBounds(371, 7, 60, 14);
		frame.getContentPane().add(label_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hamburguesas", "Pizzas", "Helados", "Bebidas", "Cervezas", "Copas", "Cafe"}));
		comboBox.setBounds(105, 74, 105, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblIdCategoria = new JLabel("Id Categoria");
		lblIdCategoria.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblIdCategoria.setBounds(295, 7, 86, 14);
		frame.getContentPane().add(lblIdCategoria);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblPrecio.setBounds(441, 7, 46, 14);
		frame.getContentPane().add(lblPrecio);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblNombre.setBounds(22, 111, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblPrecio_1 = new JLabel("Precio");
		lblPrecio_1.setFont(new Font("Lucida Bright", Font.ITALIC, 12));
		lblPrecio_1.setBounds(22, 148, 46, 14);
		frame.getContentPane().add(lblPrecio_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(105, 110, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(105, 145, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAtras = new JButton("ATRAS");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pantalla1_1 atraspantalla1_1  = new  Pantalla1_1();
				atraspantalla1_1.frame.setVisible(true);
				Pantalla1_1_2.frame.setVisible(false);
			}
		});
		btnAtras.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		btnAtras.setBackground(Color.GRAY);
		btnAtras.setBounds(256, 308, 125, 29);
		frame.getContentPane().add(btnAtras);
	}
}
