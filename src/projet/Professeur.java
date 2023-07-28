package projet;

public class Professeur {
	private Integer idprof ;
	private String nom ;
	private String prenom ;
	private String email;
	private String departement ;
	private String grade ;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professeur(Integer idprof, String nom, String prenom, String email, String departement, String grade) {
		super();
		this.idprof = idprof;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.departement = departement;
		this.grade = grade;
	}
	public Integer getIdprof() {
		return idprof;
	}
	public void setIdprof(Integer idprof) {
		this.idprof = idprof;
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
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
