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

public class DaoProfesseur {
protected static Connection cn;
static String hh;
	
	public static void suprimer(String m) {
		connexion cnx = new connexion();
		cn=cnx.getConnexion();
		String sql = "DELETE FROM professeur WHERE cin_prof = "+m;
	
		try {
			
		Statement stmt = (Statement) cn.createStatement();
	    stmt.executeUpdate(sql);

		
		}
	  
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.print("error "+e);
			
		} 
		
	

	
	   
	}
	public static void ajouter(String a,String b,String c,String d,String f,String g
			,String h,String i) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String req="insert into professeur values(?,?,?,?,?,?,?,?)";
		try {
			 
			   PreparedStatement aj = (PreparedStatement) cn.prepareStatement(req);
			   
			   aj.setString(1, a);
			   aj.setString(2, b);
			   aj.setString(3, c);
			   aj.setString(4, d);
			   aj.setString(5, f);
			   aj.setString(6, g);
			   aj.setString(7, h);
			   aj.setString(8, i);
			   aj.execute();
			   JOptionPane.showMessageDialog(null, "professeur bien ajouté!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
			
		}
	}
	public void modifier(String a,String b,String c,String d,String f,String g,String h,String i) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String requpd="update professeur set nom_prof ='"+b+"',prenom_prof ='"+c+"',email_prof='"+d+"',departement_prof='"+f+"',garde ='"+g+"',Id_depa ='"+h+"',Id_labo  ='"+i+"' where cin_prof ='"+a+"'";
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
		String reqaff="select * from professeur";
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
