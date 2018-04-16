package eg.edu.alexu.csd.oop.jdbc.cs53;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {
	public static Connection getConnection(String path) {
		try {
	//	Connection	x = DriverManager.getConnection(path);
		MyConnection now = (MyConnection) DriverManager.getConnection(path);
		return now;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw null;
			
		}		
	}

}
