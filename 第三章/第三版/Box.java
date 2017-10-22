package 第三章.第三版;

public abstract class Box {
	private double width;//成员变量，与局部变量不同，在方法之外，而且有默认值，double类型默认0.0。
	private double height;//使用场合：1、对象的属性，2、变量在几个方法中都要用到。
	
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract void boxOpen();
	
	public abstract void boxClose();
}
