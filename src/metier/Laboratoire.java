package metier;

public class Laboratoire {
	private String idlaboratoire ;
	private  String nom ;
	private String email ;
	private String responsable;
	private String membre;
	public Laboratoire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laboratoire(String idlaboratoire, String nom, String email, String responsable, String membre) {
		super();
		this.idlaboratoire = idlaboratoire;
		this.nom = nom;
		this.email = email;
		this.responsable = responsable;
		this.membre = membre;
	}
	public String getIdlaboratoire() {
		return idlaboratoire;
	}
	public void setIdlaboratoire(String idlaboratoire) {
		this.idlaboratoire = idlaboratoire;
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
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getMembre() {
		return membre;
	}
	public void setMembre(String membre) {
		this.membre = membre;
	}
	
	
}
