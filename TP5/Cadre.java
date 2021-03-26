
public class Cadre extends Person{
	protected float partFixe;
	protected float chiffreAffaire;
	private static float inputCoef_Var;
	
	
	public Cadre(String name, float partFixe, float coefPartVar) {
		super(name);
		this.partFixe = partFixe;
		this.chiffreAffaire = 0;
	}
	
	
	public float getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void addChiffreAffaire(float chiffreAffaire) {
		this.chiffreAffaire += chiffreAffaire;
	}

	public float getPartFixe() {
		return partFixe;
	}


	public float getSalaire(float inputCoef_Var) {
		return partFixe + (chiffreAffaire * inputCoef_Var);
	}
	
}
