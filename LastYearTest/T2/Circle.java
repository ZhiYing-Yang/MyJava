package LastYearTest.T2;

public class Circle extends Geometry{
	private double PI=3.14;
	public double getSurfaceArea(double r, double h, double empty) {
		// TODO Auto-generated method stub
		
		double surfaceArea = PI*r*r*2+2*PI*r*h;
		return surfaceArea;
	}

	//@Override
	public double getVolume(double r, double h, double empty) {
		// TODO Auto-generated method stub
		double volume = PI*r*r*h;
		return volume;
	}
}
