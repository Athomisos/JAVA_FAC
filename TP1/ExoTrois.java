import java.util.Arrays;

public class ExoTrois {
	
	int day;
	int month;
	int year;
	
	public ExoTrois(int inDay, int inMonth, int inYear){
		day = inDay;
		month = inMonth;
		year = inYear;
	}
	
	public static void main(String[] args) throws Exception {
		int[] dateInt = dateToInt(args);
		ExoTrois testObj = new ExoTrois(dateInt[0], dateInt[1], dateInt[2]);
		if(testObj.checkFormat()) {
			System.out.println("Date : " + testObj.day + "/" + testObj.month  + "/" + testObj.year );
			testObj.addOneDay();
			System.out.println("One More Day : " + testObj.day + "/" + testObj.month  + "/" + testObj.year );
		}
	}
	
	private static int[] dateToInt(String[] inputArr) throws Exception{
		if( inputArr.length == 3 )
		{
			int[] outputArr = new int [3];
			for (int i = 0; i < 3 ; i++) 
			{
				outputArr[i] =  Integer.valueOf(inputArr[i]);
			}
			return outputArr;
		}
		else 
		{
			throw new Exception("Format is not valid !");
		}
	}
	
	private boolean checkFormat() throws Exception {
		int[] littleMonth = new int[]{4,6,9,11};
		if( this.month <= 12 && this.month > 0 ) { // verfication que le mois existe
			if(this.day <= 31 && this.day > 0) {
				if( this.month == 2 ) {
					if(this.day <= 29) {
						if( (this.year % 4) == 0 && this.day == 29) {
							throw new Exception("Day is not valide !");
						} else {
							return true;
						}
					} else {
						throw new Exception("Day is not valid !");
					}
				}
				if (Arrays.asList(littleMonth).contains(this.month) && this.day > 30) {
					throw new Exception("Day is not valid !");
				} else {
					return true;
				}
			} else {
				throw new Exception("Day is not valid !");
			}
		} else {
			throw new Exception("Month is not valid !");
		}
	}
	private void newMonth() {
		this.day = 1;
		if(this.month != 12) {
			this.month += 1;
		} else {
			this.newYear();
		}
	}
	
	private void newYear() {
		this.month = 1;
		this.year += 1;
	}
	
	private void addOneDay() {
		int[] littleMonth = new int[]{4,6,9,11};
		if( this.month == 2 ) {
			if( (this.year % 4) == 0 && this.day == 28) {
				this.newMonth();
			} else if(this.day == 29){
				this.newMonth();
			} else {
				this.day += 1;
			}
		} else if(Arrays.asList(littleMonth).contains(this.month) && this.day == 30) {
			this.newMonth();
		} else if(this.day == 31) {
			this.newMonth();
		}else {
			this.day += 1;
		}
	}
}
