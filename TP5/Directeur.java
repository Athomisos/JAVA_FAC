
public class Directeur extends Commercial {

	private static float COEF_PART_VAR = (float) 0.004;

	
	public Directeur(String name, float partFixe, float coefPartVar) {
		super(name, partFixe, coefPartVar);
	}
	
	public float getSalaire() {
		return this.partFixe + (super.getSUM_CHIFFRE_AFFAIRE() * COEF_PART_VAR);
	}
	
}