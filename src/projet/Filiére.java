package projet;

public class Filiére {
	private Integer idfiliére ;
	private String nom ;
	private String departement;
	private String email;
	private String coordonateur ;
	public Filiére() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiére(Integer idfiliére, String nom, String departement, String email, String coordonateur) {
		super();
		this.idfiliére = idfiliére;
		this.nom = nom;
		this.departement = departement;
		this.email = email;
		this.coordonateur = coordonateur;
	}
	public Integer getIdfiliére() {
		return idfiliére;
	}
	public void setIdfiliére(Integer idfiliére) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCoordonateur() {
		return coordonateur;
	}
	public void setCoordonateur(String coordonateur) {
		this.coordonateur = coordonateur;
	}
	
	

}
