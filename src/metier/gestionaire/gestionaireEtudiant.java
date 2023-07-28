package metier.gestionaire;


import metier.Etudiant;
import persistance.DaoEtudiant;

public class gestionaireEtudiant {
	private DaoEtudiant ob;
	private Etudiant ET;
	public gestionaireEtudiant(DaoEtudiant ob, Etudiant etud) {
		super();
		this.ob = ob;
		this.ET = etud;
	}
	public void sup(String code) {
		ob.suprimer(code);
	}
	public void ajou(Etudiant e) {
		ob.ajouter(e.getIdetudiant(), e.getNom(),e.getPrenom(),e.getEmail(),e.getFiliere(),e.getNiveau());
	}
	public void modif(Etudiant e) {
		ob.modifier(e.getIdetudiant(), e.getNom(),e.getPrenom(),e.getEmail(),e.getFiliere(),e.getNiveau());
	}
	public void exel(String path) {
		ob.ajouparexel(path);
	}

}
