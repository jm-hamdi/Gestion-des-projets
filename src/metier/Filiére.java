package metier;

public class Fili�re {
	private String idfili�re ;
	private String nom ;
	private String departement;
	private String id_depar;
	private String coordonateur ;
	public Fili�re() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fili�re(String idfili�re, String depa, String nom, String departement, String coordonateur) {
		super();
		this.idfili�re = idfili�re;
		this.nom = nom;
		this.departement = departement;
		this.id_depar = depa;
		this.coordonateur = coordonateur;
	}
	public String getIdfili�re() {
		return idfili�re;
	}
	public void setIdfili�re(String idfili�re) {
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
