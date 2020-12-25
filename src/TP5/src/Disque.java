
public class Disque extends Forme2D {
	
	private double rayon;
	
	
	public Disque(String couleur, double rayon){
		super(couleur);
		this.rayon=rayon;
	}


	public double getRayon() {
		return rayon;
	}


	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double diametre() {
		return 2*this.rayon;
	}
	@Override
	public double perimetre(Forme2D forme) {
		
		return this.diametre()*Math.PI;
	}
	public double air(Forme2D forme) {
		return Math.pow(this.rayon, 2)*Math.PI;
		
	}

}
