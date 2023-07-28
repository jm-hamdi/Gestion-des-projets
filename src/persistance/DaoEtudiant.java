package persistance;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;
import javax.swing.table.TableColumn;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class DaoEtudiant {
protected static Connection cn;
	
	public static void suprimer(String m) {
		connexion cnx = new connexion();
		cn=cnx.getConnexion();
		String sql = "DELETE FROM etudiant  WHERE cin_etud  = "+m;
	    try {
		Statement stmt = (Statement) cn.createStatement();
	    stmt.executeUpdate(sql);
	    JOptionPane.showMessageDialog(null, "etudiant suprimer!!!");
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("error "+e);
			
		} 
	   
	}
	public static void ajouter(String a,String b,String c,String d,String f,String g) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String req="insert into etudiant  values(?,?,?,?,?,?)";
		try {
			 
			   PreparedStatement aj = (PreparedStatement) cn.prepareStatement(req);
			   aj.setString(1, a);
			   aj.setString(2, b);
			   aj.setString(3, c);
			   aj.setString(4, d);
			   aj.setString(5, f);
			   aj.setString(6, g);
			 
			   aj.execute();
			   JOptionPane.showMessageDialog(null, "etudiant ajouté!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print("error "+e);
			
		}
	}
	public void modifier(String a,String c,String d,String f,String g,String N) {
		connexion cnx=new connexion();
		cn=cnx.getConnexion();
		String requpd="update etudiant  set nom_etud    ='"+c+"',prenom_etud   ='"+d+"',email_etud   ='"+f+"',filiere_etud  ='"+g+"',niveau  ='"+N+"' where cin_etud ='"+a+"'";
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
		String reqaff="select * from etudiant ";
	
		
		
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(reqaff);
			resulta = ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		return resulta;
	}
	public void ajouparexel(String path) {
		
		connexion cnx=new connexion();
	        int batchSize=20;
	        Connection connection=null;
	       

	        connexion cn=new connexion();
	      
	        try{
	        	connection=cn.getConnexion();
	        	connection.setAutoCommit(false);
	        	
	        	
	            String sql="insert into etudiant(cin_etud,nom_etud ,prenom_etud,email_etud ,filiere_etud ,niveau) values(?,?,?,?,?,?)";

	            PreparedStatement statement=(PreparedStatement) connection.prepareStatement(sql);

	            BufferedReader lineReader=new BufferedReader(new FileReader(path));

	            String lineText=null;
	            int count=0;

	            lineReader.readLine();
	            while ((lineText=lineReader.readLine())!=null){
	                String[] data=lineText.split(",");
	           System.out.print("hh "+data[0]);
	                String Cin=data[0];
	            
	                String Nom=data[1];
	                String Prenom=data[2];
	                String Email=data[3];
	                String Filier=data[4];
	                String Niveau=data[5];
	              
	                statement.setString(1,Cin);
	                
	    
	                statement.setString(2,Nom);
	                statement.setString(3,Prenom);
	                statement.setString(4,Email);
	                statement.setString(5,Filier);
	                statement.setString(6,Niveau);
	                statement.addBatch();
	                if(count%batchSize==0){
	                    statement.executeBatch();
	                }
	            }
	            lineReader.close();
	            statement.executeBatch();
	            connection.commit();
	            
	            connection.close();
	            System.out.println("Data has been inserted successfully.");

	        }
	        catch (Exception exception){
	            exception.printStackTrace();
	            System.out.print(exception);
	        }

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
