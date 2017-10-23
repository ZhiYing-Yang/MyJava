package LastYearTest.T2;

public class Circle extends Geometry{
	double PI = 3.14;
	public double getSurfaceArea(double r, double PI, double h) {
		// TODO Auto-generated method stub
		this.PI = PI;
		double surfaceArea = PI*r*r*2+2*PI*r*h;
		return surfaceArea;
	}

	//@Override
	public double getVolume(double r, double PI, double h) {
		// TODO Auto-generated method stub
		this.PI = PI;
		double volume = PI*r*r*h;
		return volume;
	}
}
