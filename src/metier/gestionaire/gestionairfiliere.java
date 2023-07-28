package metier.gestionaire;


import metier.Fili�re;
import persistance.DaoFiliere;

public class gestionairfiliere {
	private DaoFiliere ob;
	private Fili�re FL;
	public gestionairfiliere(DaoFiliere ob, Fili�re depar) {
		super();
		this.ob = ob;
		this.FL = depar;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public void ajou(Fili�re fil) {
		ob.ajouter(fil.getIdfili�re(), fil.getid_depar(), fil.getNom(),fil.getDepartement(),fil.getCoordonateur());
	}
	public void modif(Fili�re fil) {
		ob.modifier(fil.getIdfili�re(), fil.getid_depar(), fil.getNom(),fil.getDepartement(),fil.getCoordonateur());
	}

}
