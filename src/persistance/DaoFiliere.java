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

public class DaoFiliere {
	protected static Connection cn;
	
	public static void suprimer(String m) {
		connexion cnx = new connexion();
		cn=cnx.getConnexion();
		String sql = "DELETE FROM filiere  WHERE Id_filiere = "+m;
	    try {
		Statement stmt = (Statement) cn.createStatement();
	    stmt.executeUpdate(sql);
	    JOptionPane.showMessageDialog(null, "filiere  bien suprimer!!!");
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("error "+e);
			
		} 
	   
	}
	public static void ajouter(String a,String b,String c,String d,String f) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String req="insert into filiere  values(?,?,?,?,?)";
		try {
			 
			   PreparedStatement aj = (PreparedStatement) cn.prepareStatement(req);
			   aj.setString(1, a);
			   aj.setString(2, b);
			   aj.setString(3, c);
			   aj.setString(4, d);
			   aj.setString(5, d);
			   
			   aj.execute();
			   JOptionPane.showMessageDialog(null, "filiere  bien ajouté!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
			
		}
	}
	public void modifier(String a,String b,String c,String d,String f) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String requpd="update filiere  set Id_depa  ='"+b+"',nom_filiere ='"+c+"',"
				+ "departement_dattache   ='"+d+"',coordonateur ='"+f+"' where Id_filiere ='"+a+"'";
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
		String reqaff="select * from filiere ";
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(reqaff);
			resulta = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return resulta;
	}
	public void imprimer(JTable jTable1) {
		// Récupère un PrinterJob
		PrinterJob job = PrinterJob.getPrinterJob();
		
		// Définit son contenu à imprimer
		job.setPrintable(jTable1.getPrintable(PrintMode.NORMAL, null, null));
		// Affiche une boîte de choix d'imprimante
		if (job.printDialog()) {
		    try {
		        // Effectue l'impression
		        job.print();
		    } catch (PrinterException ex) {
		        ex.printStackTrace();
		    }
		}
	}

}
