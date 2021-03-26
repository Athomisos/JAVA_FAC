
public class Circle extends GeomFig{
	float rayon;
	float[] centre;
	
	Circle(float inRayon,float[] inCentre){
		if(inCentre.length == 2) {
			this.rayon = inRayon;
			this.centre = inCentre;
		}
	}
	public double perimeter() {
		double output = 2 * 3.14159165;
		return(output*this.rayon);
	}
}
