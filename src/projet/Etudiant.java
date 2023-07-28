package projet;

public class Etudiant {
	private Integer idetudiant ;
	private String nom ;
	private String prenom;
	private String email;
	private String filiere ;
	private String niveau ;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(Integer idetudiant, String nom, String prenom, String email, String filiere, String niveau) {
		super();
		this.idetudiant = idetudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.filiere = filiere;
		this.niveau = niveau;
	}
	public Integer getIdetudiant() {
		return idetudiant;
	}
	public void setIdetudiant(Integer idetudiant) {
		this.idetudiant = idetudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	

}
