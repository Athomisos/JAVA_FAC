import java.util.Arrays;

/**
 * 
 */

/**
 * @author Emmanuel Aubertin
 *
 */
public class Index {
	private Subscriber[] arraySubscriber;
	private int NUMBER_OF_SUB;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Index testIndex = new Index(10);
		
		if(testIndex.addSubscriber(80, "manu")) { System.out.println("manu added");}

		testIndex.addSubscriber(48, "test");
		testIndex.addSubscriber(30, "a");
		testIndex.addSubscriber(78, "b");
		
		System.out.println("the number of manu is : " + testIndex.getNumber("manu"));
		
		System.out.println("We have curently  " + testIndex.getNbSubscribers() + " Sub");
		
		System.out.println("the sub number 3 is : " + testIndex.getSubscriber(3));
		
		System.out.println("the sub number 0 is : " + testIndex.getSubscriber(0));
		
	
		Subscriber[] sortedTest = testIndex.getSortedSubscribers();
		System.out.print("| ");
		for(int i = 0; i < testIndex.NUMBER_OF_SUB; i++) {
			System.out.print(sortedTest[i].getName() + " | ");
		}
	}


	/**
	 * @param maxSubscriber
	 */
	public Index(int maxSubscriber) {
		this.NUMBER_OF_SUB = 0;
		this.arraySubscriber = new Subscriber[maxSubscriber];
	}
	
	/**
	 * @param inputSub
	 * @return
	 */
	public Boolean addSubscriber(Subscriber inputSub) {
		if(inputSub != null && NUMBER_OF_SUB < this.arraySubscriber.length && this.getNumber(inputSub.getName()) == -1 ) {
			this.arraySubscriber[NUMBER_OF_SUB] = inputSub;
			this.NUMBER_OF_SUB++;
			return true;
		} else {
			return false;
		}
	}
	
	public Boolean addSubscriber(int inputNumber, String inputName) {
		if(inputName != null && inputNumber != 0 && NUMBER_OF_SUB < this.arraySubscriber.length && this.getNumber(inputName) == -1 ) {
			this.arraySubscriber[NUMBER_OF_SUB] = new Subscriber(inputNumber, inputName);
			this.NUMBER_OF_SUB++;
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @param inputName
	 * @return
	 */
	public int getNumber(String inputName) {
		if(this.NUMBER_OF_SUB != 0 && this.arraySubscriber != null) {
			for(int i = 0; i < this.NUMBER_OF_SUB; i++) {
				if(this.arraySubscriber[i] != null && this.arraySubscriber[i].getName() == inputName ) {
					return this.arraySubscriber[i].getNumber();
				}
			}
		}
		return -1;

	}


	/**
	 * @return
	 */
	public int getNbSubscribers() {
		return NUMBER_OF_SUB;
	}


	/**
	 * @param i
	 * @return
	 */
	public Subscriber getSubscriber(int i) {
		if(i <= this.NUMBER_OF_SUB) {
		return this.arraySubscriber[i];
		} else {
			return null;
		}
	}

	/**
	 * @return
	 */
	public Subscriber[] getSortedSubscribers() {
		if(this.arraySubscriber != null && this.NUMBER_OF_SUB > 1) {
			Subscriber[] output = Arrays.copyOf(this.arraySubscriber, this.NUMBER_OF_SUB);
			for (int i = 0; i < this.NUMBER_OF_SUB-1; i++) {
	            for (int j = 0; j < this.NUMBER_OF_SUB-i-1; j++) {
	            	if (output[j].getName().compareTo(output[j+1].getName()) >= 0){
	            		Subscriber tempSub = output[j];
	            		output[j] = output[j+1];
	            		output[j+1] = tempSub;
	            	}
	            }
			}
			return output;
		} else {
			return this.arraySubscriber;
		}
	}
	
}
