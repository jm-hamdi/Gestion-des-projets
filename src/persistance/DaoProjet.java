package persistance;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
public class DaoProjet {
	protected static Connection cn;
	
	public static void suprimer(String m) {
		connexion cnx = new connexion();
		cn=cnx.getConnexion();
		String sql = "DELETE FROM projet WHERE id_projet = "+m;
	    try {
		Statement stmt = (Statement) cn.createStatement();
	    stmt.executeUpdate(sql);
	    JOptionPane.showMessageDialog(null, "projet bien suprimer!!!");
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("error "+e);
			
		} 
	   
	}
	public static void ajouter(String a,String b,String c,String d,String f,String k,String T) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
	
		String req="insert into projet values(?,?,?,?,?,?,?)";
		try {
			 
			   PreparedStatement aj = (PreparedStatement) cn.prepareStatement(req);
			
			   aj.setString(1, a);
			   aj.setString(2, b);
			   aj.setString(3, c);
			   aj.setString(4, d);
			   aj.setString(5, f);
			   aj.setString(6, k);
			   aj.setString(7, T);
			   aj.execute();
			   JOptionPane.showMessageDialog(null, "projet bien ajouté!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
			
		}
		
	}
	public void modifier(String a,String b,String c,String d,String f,String k,String T) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String requpd="update projet set cin_prof ='"+b+"',titre_projet  ='"+c+"',date_fin   ='"+d+"',date_depart_projet  \r\n"
				+ "  ='"+f+"',etape_projet ='"+k+"',type ='"+T+"' where id_projet  ='"+a+"'";
		try {
			
			
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(requpd);
			ps.execute();
			   JOptionPane.showMessageDialog(null, "update!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
		}
	}
	public ResultSet afficher() {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		ResultSet resulta = null ;
		String reqaff="select * from projet";
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(reqaff);
			resulta = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return resulta;
	}
	
		
	

}
