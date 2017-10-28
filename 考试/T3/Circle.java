package T3;

public class Circle {
	private double r;
	private double pi;
	public Circle(){
		this.pi = 3.14;
	}
	public void setR(double r) {
		this.r = r;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double area(){
		return pi*r*r;
	}
}
