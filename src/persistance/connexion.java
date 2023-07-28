package persistance;

import java.sql.*;

public class connexion {
	
	public static Connection getConnexion() {
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3307/projet",
					"root", "");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("pas de connection "+e);
		}
		return null;
	}
}
