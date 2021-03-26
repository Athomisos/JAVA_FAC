
public class Commercial extends Cadre {

	private static float COEF_PART_VAR = (float) 0.01;
	protected static float SUM_CHIFFRE_AFFAIRE = 0;

	
	public Commercial(String name, float partFixe, float coefPartVar) {
		super(name, partFixe, coefPartVar);
	}
	
	public void addChiffreAffaire(float inputChiffreAffaire) {
		this.chiffreAffaire += inputChiffreAffaire;
		SUM_CHIFFRE_AFFAIRE += inputChiffreAffaire;
	}
	
	public static float getSUM_CHIFFRE_AFFAIRE() {
		return SUM_CHIFFRE_AFFAIRE;
	}

	public float getSalaire() {
		return this.partFixe + (this.chiffreAffaire * COEF_PART_VAR);
	}
}
