package projet;

public class Projet {
	private Integer idProjet;
	private  String titre ;
	private Integer durée ;
	private String date;
	private String EtapeProjet;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(Integer idProjet, String titre, Integer durée, String date, String etapeProjet) {
		super();
		this.idProjet = idProjet;
		this.titre = titre;
		this.durée = durée;
		this.date = date;
		EtapeProjet = etapeProjet;
	}
	public Integer getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Integer getDurée() {
		return durée;
	}
	public void setDurée(Integer durée) {
		this.durée = durée;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEtapeProjet() {
		return EtapeProjet;
	}
	public void setEtapeProjet(String etapeProjet) {
		EtapeProjet = etapeProjet;
	}
	
	
}
