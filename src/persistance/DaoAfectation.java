package persistance;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

public class DaoAfectation {
	public static void affectation(String a,String b) {
		connexion cnx=new connexion();
		Connection cn = cnx.getConnexion();
		String req="insert into etudient_projet values(?,?)";
		try {
			 
			   PreparedStatement aj = (PreparedStatement) cn.prepareStatement(req);
			   System.out.println("hello");
			   aj.setString(1, a);
			   aj.setString(2, b);
			   
			   aj.execute();
			   
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
			
		}
	}
}
