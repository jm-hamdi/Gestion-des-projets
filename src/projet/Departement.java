package projet;

public class Departement {
	private Integer iddepartement ;
	private  String nom ;
	private String email ;
	private String chefDepartement;
	private String membres;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(Integer iddepartement, String nom, String email, String chefDepartement, String membres) {
		super();
		this.iddepartement = iddepartement;
		this.nom = nom;
		this.email = email;
		this.chefDepartement = chefDepartement;
		this.membres = membres;
	}
	public Integer getIddepartement() {
		return iddepartement;
	}
	public void setIddepartement(Integer iddepartement) {
		this.iddepartement = iddepartement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChefDepartement() {
		return chefDepartement;
	}
	public void setChefDepartement(String chefDepartement) {
		this.chefDepartement = chefDepartement;
	}
	public String getMembres() {
		return membres;
	}
	public void setMembres(String membres) {
		this.membres = membres;
	}
	
	

}

