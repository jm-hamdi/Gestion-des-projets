package metier;

public class Projet {
	private String idProjet;
	private String idProf;
	private  String titre ;
	private String datefin ;
	private String datedabut;
	private String EtapeProjet;
	private String type;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projet(String idProjet, String idProf, String titre, String durée, String date, String etapeProjet,
			String type) {
		super();
		this.idProjet = idProjet;
		this.idProf = idProf;
		this.titre = titre;
		this.datefin = durée;
		this.datedabut = date;
		EtapeProjet = etapeProjet;
		this.type = type;
	}

	public String getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(String idProjet) {
		this.idProjet = idProjet;
	}
	public String getIdProf() {
		return idProf;
	}

	public void setIdProf(String idProf) {
		this.idProf = idProf;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getdatefin() {
		return datefin;
	}
	public void setdatefin(String durée) {
		this.datefin = durée;
	}
	public String getdatedabut() {
		return datedabut;
	}
	public void setdatedabut(String date) {
		this.datedabut = date;
	}
	public String getEtapeProjet() {
		return EtapeProjet;
	}
	public void setEtapeProjet(String etapeProjet) {
		EtapeProjet = etapeProjet;
	}
	
	
}
