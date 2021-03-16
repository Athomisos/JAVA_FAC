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
			this.NUMBER_OF_SUB++;
			this.arraySubscriber[NUMBER_OF_SUB] = inputSub;
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
		for(int i = 0; i < this.NUMBER_OF_SUB; i++) {
			if(this.arraySubscriber[i].getName() == inputName ) {
				return this.arraySubscriber[i].getNumber();
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
		return this.arraySubscriber[i];
	}

	/**
	 * @return
	 */
	public Subscriber[] getSortedSubscribers() {
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
	}
	
}
