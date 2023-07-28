package metier.gestionaire;

import java.sql.Connection;

import javax.swing.JOptionPane;

import metier.Projet;
import persistance.DaoProjet;
import persistance.connexion;

public class gestionaireprojet {
	private DaoProjet ob;
	private Projet depar;
	public gestionaireprojet(DaoProjet ob, Projet depar) {
		super();
		this.ob = ob;
		this.depar = depar;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public int ajou(Projet r) {
		connexion cnx=new connexion();
		Connection cn = cnx.getConnexion();
		if(r.getType().equals("PFE")&& (r.getdatedabut().equals("janvier")||r.getdatedabut().equals("octobre")||r.getdatedabut().equals("novembre")||r.getdatedabut().equals("decembre"))&&!r.getdatedabut().equals("septembre")) 
			{JOptionPane.showMessageDialog(null, "date invalid!!!");
			return 0;}
		if(r.getType().equals("PFA")&& !r.getdatedabut().equals("Juin")&&!r.getdatefin().equals("Aout"))
		{JOptionPane.showMessageDialog(null, "date invalid!!!");return 0;}
		if(r.getType().equals("DOCTORAT")&& (!r.getdatedabut().equals("octobre"))) 
		{JOptionPane.showMessageDialog(null, "date invalid!!!");return 0;}
		else {
			ob.ajouter(r.getIdProjet(),r.getIdProf(),r.getTitre(),r.getdatefin(),r.getdatedabut(),
				r.getEtapeProjet(),r.getType());}
		return 0;
		
	}
	
	public void modif(Projet r) {
	ob.modifier(r.getIdProjet(),r.getIdProf(),r.getTitre(),r.getdatefin(),r.getdatedabut(),
			r.getEtapeProjet(),r.getType());
	}

}
