package metier.gestionaire;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import persistance.DaoAfectation;
import persistance.connexion;

public class gestionaireAfectaion {
	private DaoAfectation ob;
	
	
	public gestionaireAfectaion(DaoAfectation ob) {
		super();
		this.ob = ob;
	}
	public int isvalide(String p,String id,String e1) {
		
		connexion cnx = new connexion();
		Connection cn = cnx.getConnexion();
		String m="SELECT garde From professeur WHERE cin_prof = "+id;
		String n="SELECT type  From projet WHERE id_projet = "+p;
		Statement st;
		try {
			PreparedStatement ps2 = (PreparedStatement) cn.prepareStatement(m);
			ResultSet resulta2 = ps2.executeQuery();
			resulta2.next();
			PreparedStatement ps3 = (PreparedStatement) cn.prepareStatement(n);
			ResultSet resulta3 = ps3.executeQuery();
			resulta3.next();
			if(resulta3.getString(1).equals("PFE")||resulta3.getString(1).equals("PFA")&&!resulta2.getString(1).equals("C")) {
				JOptionPane.showMessageDialog(null, "error grade invalid");	
				return 0;
			}
			if(resulta3.getString(1).equals("DOCTORAT")&&!resulta2.getString(1).equals("D")) {
				System.out.print(id+resulta2.getString(1));
				JOptionPane.showMessageDialog(null, "error grade invalid1");
				return 0;
			}
			else{this.afecter(p, e1, id);}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	
	private void afecter(String p,String e1,String id) {
		connexion cnx = new connexion();
		Connection cn = cnx.getConnexion();
		
		
		String a="SELECT *From etudient_projet WHERE id_etudiant = "+e1;
		String b="SELECT *From etudient_projet WHERE Id_projet = "+p;
		Statement st;
		try {
			
			
		
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(a);
			ResultSet resulta = ps.executeQuery();
			PreparedStatement ps1 = (PreparedStatement) cn.prepareStatement(b);
			ResultSet resulta1 = ps1.executeQuery();
		
	    if (!resulta.next()&& !resulta1.next())	{
	    	ob.affectation(e1, p);
	    	
	    	
	 
	    JOptionPane.showMessageDialog(null, "projet affecter");
			cn.close();
		}
	    else {JOptionPane.showMessageDialog(null, "error");}
		
		}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.print("error "+e);
			
		} 

	}
}
