package _JCG_Ex_Jakarta.Principal;
import java.sql.*;
import java.util.Enumeration;

public class Conexion {
	
	public Conexion(){
	// Paso 1 importar java
	
	// Paso 2 carga del driver
	
	// paso 2.1 registrar el driver

	try {
		
		Class.forName("org.postgresql.Driver");
		Enumeration ee = DriverManager.getDrivers();
		
		while(ee.hasMoreElements()){
			Driver d = (Driver) ee.nextElement();
		
		}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	
	// Paso 3 establecer conexion
	
	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Bd_examen", "postgres", "12345");
		
		Statement st = con.createStatement();
		
		// paso 5 ejecutar
		
		ResultSet rs = 	st.executeQuery("select * from public.productos p");
		
		
	}catch (SQLException e){
		e.printStackTrace();
	}
	

	

	
	}	
	
}

