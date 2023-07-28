package metier.gestionaire;

import metier.Entreprise;
import persistance.DaoEntrprise;

public class gestionaireentreprise {
	private DaoEntrprise ob;
	private Entreprise ob1;
	public gestionaireentreprise(DaoEntrprise ob, Entreprise ob1) {
		super();
		this.ob = ob;
		this.ob1 = ob1;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public void ajou(Entreprise obj) {
		ob.ajouter(obj.getIdentreprise(),obj.getRaisonSociale(),obj.getAdresse(),obj.getTel(),obj.getEmail(),obj.getResponsable());
	}
	public void modif(Entreprise obj) {
		ob.modifier(obj.getIdentreprise(),obj.getRaisonSociale(),obj.getAdresse(),obj.getTel(),obj.getEmail(),obj.getResponsable());
	}

}
