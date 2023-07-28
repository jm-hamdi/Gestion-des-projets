package projet;

public class Entreprise {
	private Integer identreprise ;
	private String raisonSociale ;
	private String adresse ;
	private Integer tel;
	private String email ;
	private String responsable ;
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(Integer identreprise, String raisonSociale, String adresse, Integer tel, String email,
			String responsable) {
		super();
		this.identreprise = identreprise;
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.responsable = responsable;
	}
	public Integer getIdentreprise() {
		return identreprise;
	}
	public void setIdentreprise(Integer identreprise) {
		this.identreprise = identreprise;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
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
	
	
}
