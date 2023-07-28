package metier.gestionaire;

import metier.Laboratoire;
import persistance.DaoLaboratoire;

public class gestionairelab {
	private DaoLaboratoire ob;
	private Laboratoire lab;
	public gestionairelab(DaoLaboratoire ob, Laboratoire depar) {
		super();
		this.ob = ob;
		this.lab = depar;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public void ajou(Laboratoire labo) {
		ob.ajouter(labo.getIdlaboratoire(), labo.getNom(), labo.getEmail(), labo.getResponsable(), labo.getMembre());
	}
	public void modif(Laboratoire labo) {

		ob.modifier(labo.getIdlaboratoire(), labo.getNom(), labo.getEmail(), labo.getResponsable(), labo.getMembre());
	}

}
