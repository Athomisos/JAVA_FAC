
public class ExoUn {

	public static void main(String[] args) {
		reverseArgs(args);
		System.out.print(System.lineSeparator() +"Done");

	}
	
	public static void reverseWord(String inputString) {
		int strLenght = inputString.length();
		for (int i = 1; i < strLenght +1; i++) {
		     System.out.print(inputString.charAt(strLenght - i));
		}
	}
		
	public static void reverseArgs(String[] inputArray) {
		for (int i = 1; i < inputArray.length +1; i++) {
			reverseWord(inputArray[inputArray.length - i]);
			System.out.print(" ");
		}
	}
}
