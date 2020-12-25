

public class Rectangle extends Forme2D {
	
	private double langueur, largeur;

	public Rectangle(String couleur,double langueur, double largeur) {
		super(couleur);
		this.langueur = langueur;
		this.largeur = largeur;
	}

	public double getLangueur() {
		return langueur;
	}

	public void setLangueur(double langueur) {
		this.langueur = langueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	@Override
	public double air(Forme2D forme) {
		return this.getLangueur() * this.getLargeur();
	}
	@Override
	public double perimetre(Forme2D forme) {
		return 2*(this.getLangueur() + this.getLargeur());
	}
	

}
