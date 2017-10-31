package 第三章.第一版;

public class IceBox {
	private double width;// 成员变量，与局部变量不同，在方法之外，而且有默认值，double类型默认0.0。
	private double height;// 使用场合：1、对象的属性，2、变量在几个方法中都要用到。

	public void open() {
		System.out.println("冰箱打开");
	}

	public void close() {
		System.out.println("冰箱关闭");
	}

}
