
public class Forme2D {
	
	private String couleur;
	
	
	 public Forme2D() {
		 this.couleur="noir";
	 }


	public Forme2D(String couleur) {
		super();
		this.couleur = couleur;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	 
	
	public double air(Forme2D forme) {
		
		return 0;
	}
	public double perimetre(Forme2D forme) {
		return 0;
	}
}
