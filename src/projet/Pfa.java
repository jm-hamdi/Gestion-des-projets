package projet;

public class Pfa {
	private Integer idpfa ;
	private String titre;
	
    
	public Pfa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pfa(Integer idpfa, String titre) {
		super();
		this.idpfa = idpfa;
		this.titre = titre;
	}
	public Integer getIdpfa() {
		return idpfa;
	}
	public void setIdpfa(Integer idpfa) {
		this.idpfa = idpfa;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
}
