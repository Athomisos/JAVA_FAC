public class Vector {
	int x, y, z;
	private static int VECT_NUMBER;
	public static void main(String[] args) throws Exception {
		Vector objFirst = new Vector(3, 4, 5);
		

		objFirst.display();
		
		System.out.println("Test de multiply");
		objFirst.multipy(2);
		
		objFirst.display();
		
		Vector objSecond = new Vector(1, 2, 3);
		
		int resultOutput = objFirst.scalar(objSecond);
		System.out.println("Resultat du scalaire ==> " + resultOutput);
	
		System.out.println("Nombre de vecteur ==>" + getVectNumber());
	}

/* ------------------------ Constructeur : ------------------------ */
	/**
	 * @param xInput
	 * @param yInput
	 * @param zInput
	 */
	public Vector(int xInput, int yInput, int zInput) {
		VECT_NUMBER += 1;
		this.x = xInput;
		this.y = yInput;
		this.z = zInput;
	}
	
	/**
	 * 
	 */
	public Vector() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector(Vector inputVect) {
		this.x = inputVect.x;
		this.y = inputVect.y;
		this.z = inputVect.z;
	}
/*	------------ | Fonction initialize | ------------
	public Vector initialize(int xInput, int yInput, int zInput) {
		Vector ouputObj = new Vector();
		ouputObj.x = xInput;
		ouputObj.y = yInput;
		ouputObj.z = zInput;
		return ouputObj;
	}*/
	
 /* ------------------------ Methodes : ------------------------ */
	/**
	 * @param coef
	 * @throws Exception
	 */
	public void multipy(int coef) throws Exception {
		this.x *= coef;
		this.y *= coef;
		this.z *= coef;
	}
	
	/**
	 * @throws Exception
	 */
	public void display(){
			System.out.println("Coordonée du vecteur :");
			System.out.println("x ==> " + this.x + "\ny ==> " + this.y + "\nz ==> " + this.z);
	}
	
	/**
	 * @param vectInput
	 * @return
	 * @throws Exception
	 */
	public int scalar(Vector vectInput) throws Exception {
		if(vectInput != null) {
		return( (this.x * vectInput.x) + (this.y * vectInput.y) + (this.z * vectInput.z));
		} else {
			throw new Exception("The input Vector is null ! \nError on scalar");
		}
	}
	
	/**
	 * @param vectInput
	 * @return
	 */
	public Vector sum(Vector vectInput) {
		if(vectInput != null ) {
			return(new Vector(this.x+vectInput.x, this.y+vectInput.y, this.z+vectInput.z));
		}
		return null;
	}
	
	/**
	 * @return vectNumber
	 */
	public static int getVectNumber() {
		return(VECT_NUMBER);
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + "\n"
				+ "	/**\n"
				+ "	 * \n"
				+ "	 */\n"
				+ "	public Vector()\n"
				+ "	/**\n"
				+ "	 * \n"
				+ "	 */\n"
				+ "	public Vector() {\n"
				+ "		this.x = 0;\n"
				+ "		this.y = 0;\n"
				+ "		this.z = 0;\n"
				+ "	}\n"
				+ "	\n"
				+ "	public Vector(Vector inputVect) {\n"
				+ "		this.x = inputVect {\n"
				+ "		this.x = 0;\n"
				+ "		this.y = 0;\n"
				+ "		this.z = 0;\n"
				+ "	}\n"
				+ "	\n"
				+ "	public Vector(Vector inputVect) {\n"
				+ "		this.x = inputVect, y=" + y + ", z=" + z + "]";
	}
	
	public Vector invert(Vector inputVect) {
		Vector Output = new Vector(this);
		this.x = inputVect.x;
		this.y = inputVect.y;
		this.z = inputVect.z;
		return Output;
	}
	
}
