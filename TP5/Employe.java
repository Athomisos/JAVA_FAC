
public class Employe extends Person{
	private int NbHeureContract;
	private int NbHeureSup;
	private float partFixe;
	private float tauxHoraireFixe;
	private float tauxHoraireVar;
	
	public Employe(String name, float tauxHoraireFixe, float tauxHoraireVar, int NbHeureContract) {
		super(name);
		this.NbHeureSup = 0;
		this.NbHeureContract = NbHeureContract;
		this.partFixe = (NbHeureContract *4) * tauxHoraireFixe;
		this.tauxHoraireFixe = tauxHoraireFixe;
		this.tauxHoraireVar = tauxHoraireVar;
	}

	
	
	public int getNbHeureContract() {
		return NbHeureContract;
	}



	public int getNbHeureSup() {
		return NbHeureSup;
	}

	
	public void addNbHeureSup(int nbHeure) {
		NbHeureSup += nbHeure;
	}


	public float getPartVariable() {
		return (NbHeureSup * tauxHoraireVar);
	}


	public float getPartFixe() {
		return partFixe;
	}


	public float getTauxHoraireFixe() {
		return tauxHoraireFixe;
	}
	
	public float getTauxHoraireVar() {
		return tauxHoraireVar;
	}
	
	public float getSalaire() {
		return this.partFixe + (NbHeureSup * tauxHoraireVar);
	}
	
}
