import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Pantalla1_1_1 {

	static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private ConexionBBDD conexion;
	static String Nombre;
	static String Id;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1_1_1 window = new Pantalla1_1_1();
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
	public Pantalla1_1_1() {
		conexion = new ConexionBBDD();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 576, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAadirCategoria = new JLabel("A\u00F1adir Categoria");
		lblAadirCategoria.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		lblAadirCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadirCategoria.setBounds(73, 4, 133, 32);
		frame.getContentPane().add(lblAadirCategoria);
		
		textField = new JTextField();
		textField.setBounds(120, 78, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		lblCategoria.setBounds(27, 78, 83, 17);
		frame.getContentPane().add(lblCategoria);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Nombre = textField.getText();
				 Id = textField_1.getText();
				if(Nombre!="" && Id!="") {
					DefaultTableModel data =(DefaultTableModel)table.getModel();
					String [] fila = {Id,Nombre};
					data.addRow(fila);
					conexion.InsertarCategoria();
					
					
					
				}
				
				
				
			}
		});
		btnAadir.setBackground(new Color(128, 128, 128));
		btnAadir.setForeground(Color.BLACK);
		btnAadir.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		btnAadir.setBounds(49, 109, 157, 38);
		frame.getContentPane().add(btnAadir);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(240, 11, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBackground(Color.LIGHT_GRAY);
		lblNombre.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(311, 11, 89, 14);
		frame.getContentPane().add(lblNombre);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				int filaelegida = table.getSelectedRow();
				
				if(filaelegida >=0) {
					int fila;
					fila=(Integer)table.getSelectedRow();
					Object id=table.getValueAt(fila, 0);
					((DefaultTableModel)table.getModel()).removeRow(fila);
					DefaultTableModel data= new DefaultTableModel();
					conexion.BorrarCategoria();
					
				}else {
					JOptionPane.showMessageDialog(btnEliminar,"no esta seleccionada la fila");
				}
			}
	
		});
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setBackground(new Color(128, 128, 128));
		btnEliminar.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		btnEliminar.setBounds(49, 206, 157, 38);
		frame.getContentPane().add(btnEliminar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 47, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblId_1 = new JLabel("Id:");
		lblId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblId_1.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		lblId_1.setBounds(49, 47, 46, 14);
		frame.getContentPane().add(lblId_1);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nombre = textField.getText();
			 	Id = textField_1.getText();
				 conexion.ModificarCategoria();
					table.setModel(conexion.ConsultaTablaCategoria());
			}
		});
		btnEditar.setForeground(Color.BLACK);
		btnEditar.setBackground(new Color(128, 128, 128));
		btnEditar.setFont(new Font("Lucida Bright", Font.ITALIC, 16));
		btnEditar.setBounds(49, 158, 157, 38);
		frame.getContentPane().add(btnEditar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 36, 150, 223);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int seleccion =table.rowAtPoint(arg0.getPoint());
				textField_1.setText((String)table.getValueAt(seleccion, 0));
				textField.setText((String)table.getValueAt(seleccion, 1));
				
				Nombre = textField.getText();
				 Id = textField_1.getText();
				
	            
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"3", "Bebidas"},
				{"1", "pescado"},
				{"2", "carne"},
			},
			new String[] {
				"ID", "NOMBRE"
			}
		));
		scrollPane.setViewportView(table);
		ConexionBBDD Prueba = new ConexionBBDD();
		table.setModel(Prueba.ConsultaTablaCategoria());
		
		JButton btnNewButton = new JButton("ATRAS");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Lucida Bright", Font.ITALIC, 11));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla1_1 atraspantalla1_1  = new  Pantalla1_1();
				atraspantalla1_1.frame.setVisible(true);
				Pantalla1_1_1.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(49, 263, 157, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnListar = new JButton("LISTAR");
		btnListar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				table.setModel(conexion.ConsultaTablaCategoria());
			}
		});
		btnListar.setBounds(249, 272, 89, 23);
		frame.getContentPane().add(btnListar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pantalla1_1_1.class.getResource("/img/escritorio.jpg")));
		lblNewLabel.setBounds(0, 0, 560, 324);
		frame.getContentPane().add(lblNewLabel);
		
		
		}
	}

