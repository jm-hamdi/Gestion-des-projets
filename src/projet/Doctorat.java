package projet;

public class Doctorat {
	private Integer idDoctorat ;
	private String titreProjet ;
	public Doctorat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctorat(Integer idDoctorat, String titreProjet) {
		super();
		this.idDoctorat = idDoctorat;
		this.titreProjet = titreProjet;
	}
	public Integer getIdDoctorat() {
		return idDoctorat;
	}
	public void setIdDoctorat(Integer idDoctorat) {
		this.idDoctorat = idDoctorat;
	}
	public String getTitreProjet() {
		return titreProjet;
	}
	public void setTitreProjet(String titreProjet) {
		this.titreProjet = titreProjet;
	}
	
	

}
