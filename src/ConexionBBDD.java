import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.table.DefaultTableModel;



public class ConexionBBDD {

	private String bd;
	private String url;
	private String usr ;
	private String pwd ;
	private String esquema; 
	private Connection conexion;
	

	public ConexionBBDD()  {
		Ficheroini();
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
		String query = "SELECT * FROM "+esquema+".CATEGORIA ORDER BY ID_CATEGORIA ASC ";
		 
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
		String query = "SELECT * FROM "+esquema+".PRODUCTO  ";
		 
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
		String UPDATE = "INSERT INTO  "+esquema+".CATEGORIA VALUES("+Pantalla1_1_1.Id+" , '"+Pantalla1_1_1.Nombre+"')";
		 
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
		String UPDATE = "UPDATE  "+esquema+".CATEGORIA SET  Id_Categoria="+Pantalla1_1_1.Id+" , NOMBRE='"+Pantalla1_1_1.Nombre+"' WHERE Id_Categoria="+Pantalla1_1_1.Id+"";
		 
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

public int BorrarCategoria() {
	
	
	int resultado = 0;
	String UPDATE = "DELETE FROM  "+esquema+".CATEGORIA WHERE  Id_Categoria="+Pantalla1_1_1.Id+" AND NOMBRE='"+Pantalla1_1_1.Nombre+"'";
	 
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


public int BorrarProducto() {
	
	
	int resultado = 0;
	String UPDATE = "DELETE FROM  "+esquema+".PRODUCTO WHERE  Id_producto="+Pantalla1_1_2.Id+" and Id_Categoria="+Pantalla1_1_2.Id_Categoria+"  AND NOMBRE='"+Pantalla1_1_2.NOMBRE+"'  AND PRECIO="+Pantalla1_1_2.Precio+"";
	 
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
		String UPDATE = "INSERT INTO  "+esquema+".PRODUCTO VALUES("+Pantalla1_1_2.Id+" , "+Pantalla1_1_2.Id_Categoria+" , '"+Pantalla1_1_2.NOMBRE+"',"+Pantalla1_1_2.Precio+")";
		 
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
public int ModificarProducto() {
	
	
	int resultado = 0;
	String UPDATE = "UPDATE "+esquema+".PRODUCTO SET   Id_producto="+Pantalla1_1_2.Id+" , Id_Categoria="+Pantalla1_1_2.Id_Categoria+"  , NOMBRE='"+Pantalla1_1_2.NOMBRE+"'  , PRECIO="+Pantalla1_1_2.Precio+" WHERE Id_producto="+Pantalla1_1_2.Id+"";
	 
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
public void Ficheroini() {
	Properties propiedades = new Properties();
	InputStream entrada = null;
	try {
		File miFichero= new File("src/archivo.ini");
		if(miFichero.exists()) {
			entrada =new FileInputStream(miFichero);
			propiedades.load(entrada);
			url=propiedades.getProperty("Basededatos");
			usr= propiedades.getProperty("usuario");
			pwd=propiedades.getProperty("contraseña");
			esquema=propiedades.getProperty("esquema");
		}
		else {
			System.err.println("Fichero no encontrado");
		}
	}catch(IOException ex) {
		ex.printStackTrace();
	}finally {
		if(entrada!=null) {
			try {
				entrada.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	

}