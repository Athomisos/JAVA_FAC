
public class PairVect extends Vector{
	private Vector firstVector;
	private Vector secondVector;
	
	public PairVect(Vector fristInput, Vector secondInput) {
		firstVector = fristInput;
		secondVector = secondInput;
	}
	
	public PairVect(int inputFirstX, int inputFirstY, int inputFirstZ, int inputSecondX, int inputSecondY, int inputSecondZ) {
		firstVector = new Vector(inputFirstX, inputFirstY, inputFirstZ);
		secondVector = new Vector(inputSecondX, inputSecondY, inputSecondZ);
	}
	
	public Vector getFirstVector() {
		return this.firstVector;
	}
	
	public Vector getSecondVector() {
		return this.secondVector;
	}
}
