package projet;

public class Projet {
	private Integer idProjet;
	private  String titre ;
	private Integer dur�e ;
	private String date;
	private String EtapeProjet;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(Integer idProjet, String titre, Integer dur�e, String date, String etapeProjet) {
		super();
		this.idProjet = idProjet;
		this.titre = titre;
		this.dur�e = dur�e;
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
	public Integer getDur�e() {
		return dur�e;
	}
	public void setDur�e(Integer dur�e) {
		this.dur�e = dur�e;
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
