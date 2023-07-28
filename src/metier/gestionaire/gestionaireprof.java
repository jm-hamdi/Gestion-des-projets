package metier.gestionaire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import metier.Professeur;
import persistance.DaoProfesseur;
import persistance.connexion;

public class gestionaireprof {
	private DaoProfesseur ob;
	private Professeur prof;
	public gestionaireprof(DaoProfesseur ob, Professeur depar) {
		super();
		this.ob = ob;
		this.prof = depar;
	}
	public void sup(String code) {
		connexion cnx = new connexion();
		Connection cn = cnx.getConnexion();
		String q="SELECT *From projet WHERE cin_prof = "+code;
		Statement st;
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(q);
			ResultSet resulta = ps.executeQuery();
			
			
	    if (!resulta.next())	{
	    	ob.suprimer(code);
	   
	    JOptionPane.showMessageDialog(null, "professeur bien suprimer!!!");
			cn.close();
		}
	    else {JOptionPane.showMessageDialog(null, "professeur ne peux pas etre suprimer!!!");}}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.print("error "+e);
			
		} 
	
	}
	public void ajou(Professeur p) {
		ob.ajouter(p.getIdprof(),p.getIddepar(),p.getIdlabo(), p.getNom(),p.getPrenom(), p.getEmail(), p.getDepartement(), p.getGrade());;
	
	}
	public void modif(Professeur p) {
		ob.modifier(p.getIdprof(),p.getIddepar(),p.getIdlabo(), p.getNom(),p.getPrenom(), p.getEmail(), p.getDepartement(), p.getGrade());;
		
	
	}

}
