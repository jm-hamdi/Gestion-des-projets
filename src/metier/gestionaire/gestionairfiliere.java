package metier.gestionaire;


import metier.Filiére;
import persistance.DaoFiliere;

public class gestionairfiliere {
	private DaoFiliere ob;
	private Filiére FL;
	public gestionairfiliere(DaoFiliere ob, Filiére depar) {
		super();
		this.ob = ob;
		this.FL = depar;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public void ajou(Filiére fil) {
		ob.ajouter(fil.getIdfiliére(), fil.getid_depar(), fil.getNom(),fil.getDepartement(),fil.getCoordonateur());
	}
	public void modif(Filiére fil) {
		ob.modifier(fil.getIdfiliére(), fil.getid_depar(), fil.getNom(),fil.getDepartement(),fil.getCoordonateur());
	}

}
