package projet;

public class Fili�re {
	private Integer idfili�re ;
	private String nom ;
	private String departement;
	private String email;
	private String coordonateur ;
	public Fili�re() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fili�re(Integer idfili�re, String nom, String departement, String email, String coordonateur) {
		super();
		this.idfili�re = idfili�re;
		this.nom = nom;
		this.departement = departement;
		this.email = email;
		this.coordonateur = coordonateur;
	}
	public Integer getIdfili�re() {
		return idfili�re;
	}
	public void setIdfili�re(Integer idfili�re) {
		this.idfili�re = idfili�re;
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
