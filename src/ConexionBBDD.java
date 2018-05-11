import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ConexionBBDD {

	private String bd;
	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "system";
	private String pwd = "lorca";
	private Connection conexion;
	

	public ConexionBBDD()  {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
	public DefaultTableModel ConsultaTablaCategoria() {
		String [] columnas={"ID_CATEGORIA","NOMBRE"};
		String [] registro=new String[2];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM MIGUEL.CATEGORIA ORDER BY ID_CATEGORIA ASC ";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("ID_CATEGORIA");
		         registro[1]=rset.getString("NOMBRE");
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
		
		
	}
	public DefaultTableModel ConsultaTablaProductos() {
		String [] columnas={"ID","Id_Categoria","NOMBRE" ,"Precio"};
		String [] registro=new String[5];
		DefaultTableModel ModeloTabla = new DefaultTableModel(null,columnas);
		String query = "SELECT * FROM MIGUEL.PRODUCTO  ";
		 
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			while(rset.next()) {
				 registro[0]=rset.getString("ID_Producto");
		         registro[1]=rset.getString("Id_Categoria");
		         registro[2]=rset.getString("NOMBRE");
		         registro[3]=rset.getString("Precio");
		         
		         
		         ModeloTabla.addRow(registro);
			}
			rset.close();
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return ModeloTabla;
	}
	public int InsertarCategoria() {
	
		
		int resultado = 0;
		String UPDATE = "INSERT INTO  MIGUEL.CATEGORIA VALUES("+Pantalla1_1_1.Id+" , '"+Pantalla1_1_1.Nombre+"')";
		 
		System.out.println(UPDATE);
		try {
			Statement stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(UPDATE);
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return resultado;
		
	}
public int ModificarCategoria() {
	
		
		int resultado = 0;
		String UPDATE = "UPDATE  MIGUEL.CATEGORIA SET  Id_Categoria="+Pantalla1_1_1.Id+" , NOMBRE='"+Pantalla1_1_1.Nombre+"' WHERE Id_Categoria="+Pantalla1_1_1.Id+"";
		 
		System.out.println(UPDATE);
		try {
			Statement stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(UPDATE);
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return resultado;
		
	}
	
	
	
public int InsertarCategoriaPantalla1_1_2() {
	
		
		int resultado = 0;
		String UPDATE = "INSERT INTO  MIGUEL.PRODUCTO VALUES("+Pantalla1_1_2.Id+" , "+Pantalla1_1_2.Id_Categoria+" , '"+Pantalla1_1_2.NOMBRE+"',"+Pantalla1_1_2.Precio+")";
		 
		System.out.println(UPDATE);
		try {
			Statement stmt = conexion.createStatement();
			resultado = stmt.executeUpdate(UPDATE);
			stmt.close();
			
		}catch (SQLException s){
			s.printStackTrace();
		}
		
		return resultado;
		
	}
	
	

}