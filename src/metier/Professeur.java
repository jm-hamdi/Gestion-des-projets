package metier;

public class Professeur {
	private String idprof ;
	private String iddepar ;
	private String idlabo ;
	private String nom ;
	private String prenom ;
	private String email;
	private String departement ;
	private String grade ;
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIddepar() {
		return iddepar;
	}

	public void setIddepar(String iddepar) {
		this.iddepar = iddepar;
	}

	public String getIdlabo() {
		return idlabo;
	}

	public void setIdlabo(String idlabo) {
		this.idlabo = idlabo;
	}

	public Professeur(String idprof, String iddepar, String idlabo, String nom, String prenom, String email,
			String departement, String grade) {
		super();
		this.idprof = idprof;
		this.iddepar = iddepar;
		this.idlabo = idlabo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.departement = departement;
		this.grade = grade;
	}

	public String getIdprof() {
		return idprof;
	}
	public void setIdprof(String idprof) {
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
