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
		// TODO Auto-generated method stub

	}


	public Index(int maxSubscriber) {
		this.NUMBER_OF_SUB = 0;
		this.arraySubscriber = new Subscriber[maxSubscriber];
	}
	
	public Boolean addSubscriber(Subscriber inputSub) {
		if(inputSub != null && NUMBER_OF_SUB < this.arraySubscriber.length ) {
			this.NUMBER_OF_SUB++;
			this.arraySubscriber[NUMBER_OF_SUB] = inputSub;
			return true;
		} else {
			return false;
		}
	}
	
	public int getNumber(String inputName) {
		for(int i = 0; i < this.NUMBER_OF_SUB; i++) {
			if(this.arraySubscriber[i].getName() == inputName ) {
				return this.arraySubscriber[i].getNumber();
			}
		}
		return -1;
	}


	public int getNbSubscribers() {
		return NUMBER_OF_SUB;
	}


	public Subscriber getSubscriber(int i) {
		return this.arraySubscriber[i];
	}


	
}
