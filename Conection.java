package sara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conection {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/hibernate";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	
	public static void conectar() {
		Connection con=null;
		try {
			Class.forName(CONTROLADOR);
			con=DriverManager.getConnection(URL,USER,PASSWORD);
			System.out.println("OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
