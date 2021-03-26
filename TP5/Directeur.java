
public class Directeur extends Commercial {

	private static float COEF_PART_VAR = (float) 0.004;
	private static boolean CAN_CONSTRUCT = true;

	
	private Directeur(String name, float partFixe) {
		super(name, partFixe);
	}
	public static Directeur makeNewDir(String name, float partFixe) {
		if(CAN_CONSTRUCT) {
			CAN_CONSTRUCT = false;
			return new Directeur(name, partFixe);
		} else {
			return null;
		}
	}
		
	public float getSalaire() {
		return this.partFixe + (super.getSUM_CHIFFRE_AFFAIRE() * COEF_PART_VAR);
	}
	
}