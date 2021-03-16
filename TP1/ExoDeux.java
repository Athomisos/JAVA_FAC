import java.lang.Math;
import java.util.Arrays; 

public class ExoDeux {
	
	public static void main(String[] args) throws Exception {
		int[] coef = getCoef(args);
		float delta = getDelta(coef);
		float[] result = getSolution(coef, delta);
		System.out.println("Les solutions sont :");
		System.out.println(Arrays.toString(result));
	}

	private static int[] getCoef(String[] inputArr) {
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
			return null;
		}
	}
	
	private static int getDelta(int[] inputCoef) throws Exception
	{
		if(inputCoef != null)
		{
		return ((inputCoef[1] * inputCoef[1]) - ( 4 * inputCoef[0] * inputCoef[2]));
		}
		else
		{
			throw new Exception("Coefffient Can not be null.");
		}
	}
	
	private static float[] getSolution(int[] inputCoef, float delta) throws Exception 
	{
		if(delta == 0) {
			float[] returnArr = new float [1];
			returnArr[0] = (-inputCoef[1] / (2 * inputCoef[0]));
			return returnArr;
		} else if(delta > 0) {
			float[] returnArr = new float [2];
			returnArr[0] = (float) ((-inputCoef[1] + Math.sqrt(delta)) / (2 * inputCoef[0]));
			returnArr[1] = (float) ((-inputCoef[1] - Math.sqrt(delta)) / (2 * inputCoef[0]));
			return returnArr;
		} else {
			throw new Exception("Delta < 0 no real soluition !");
		}
	}
	
}