package LastYearTest.T2;

public class Retangle extends Geometry {

	// @Override
	public double getSurfaceArea(double a, double b, double c) {
		// TODO Auto-generated method stub
		double surfaceArea = (a * b + b * c + a * c) * 2;
		return surfaceArea;
	}

	// @Override
	public double getVolume(double a, double b, double c) {
		// TODO Auto-generated method stub
		double volume = a * b * c;
		return volume;
	}

}
