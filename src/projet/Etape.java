package projet;

public class Etape {
	private Integer idetape ;
	private Integer durée ;
	private String etadeDeDEpart ;
	private String documentation;
	private String livraison;
	public Etape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etape(Integer idetape, Integer durée, String etadeDeDEpart, String documentation, String livraison) {
		super();
		this.idetape = idetape;
		this.durée = durée;
		this.etadeDeDEpart = etadeDeDEpart;
		this.documentation = documentation;
		this.livraison = livraison;
	}
	public Integer getIdetape() {
		return idetape;
	}
	public void setIdetape(Integer idetape) {
		this.idetape = idetape;
	}
	public Integer getDurée() {
		return durée;
	}
	public void setDurée(Integer durée) {
		this.durée = durée;
	}
	public String getEtadeDeDEpart() {
		return etadeDeDEpart;
	}
	public void setEtadeDeDEpart(String etadeDeDEpart) {
		this.etadeDeDEpart = etadeDeDEpart;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	public String getLivraison() {
		return livraison;
	}
	public void setLivraison(String livraison) {
		this.livraison = livraison;
	}
	
 
}
