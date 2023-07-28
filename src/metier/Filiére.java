package metier;

public class Filiére {
	private String idfiliére ;
	private String nom ;
	private String departement;
	private String id_depar;
	private String coordonateur ;
	public Filiére() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiére(String idfiliére, String depa, String nom, String departement, String coordonateur) {
		super();
		this.idfiliére = idfiliére;
		this.nom = nom;
		this.departement = departement;
		this.id_depar = depa;
		this.coordonateur = coordonateur;
	}
	public String getIdfiliére() {
		return idfiliére;
	}
	public void setIdfiliére(String idfiliére) {
		this.idfiliére = idfiliére;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getid_depar() {
		return id_depar;
	}
	public void setEmail(String email) {
		this.id_depar = email;
	}
	public String getCoordonateur() {
		return coordonateur;
	}
	public void setCoordonateur(String coordonateur) {
		this.coordonateur = coordonateur;
	}
	
	

}
