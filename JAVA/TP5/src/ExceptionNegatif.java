
public class ExceptionNegatif extends Exception{
	int valeur;

	public ExceptionNegatif(int valeur) {
		super();
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "ExceptionNegatif [valeur=" + valeur + "] est négatif";
	}
	
	

}
