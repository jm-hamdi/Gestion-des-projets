package metier.gestionaire;

import metier.Departement;
import persistance.DaoDepartement;

public class gestionairedepartement {
	private DaoDepartement ob;
	private Departement depar;
	public gestionairedepartement(DaoDepartement ob, Departement depar) {
		super();
		this.ob = ob;
		this.depar = depar;
	}
	public void sup(String code) {
		ob.suprimerDepar(code);
	}
	public void ajou(Departement depar) {
		ob.ajouterDepar(depar.getIddepartement(), depar.getNom(), depar.getEmail(), depar.getChefDepartement(), depar.getMembres());;
	}
	public void modif(Departement depar) {
		ob.modifierDepar(depar.getIddepartement(), depar.getNom(), depar.getEmail(), depar.getChefDepartement(), depar.getMembres());;
	}

}
