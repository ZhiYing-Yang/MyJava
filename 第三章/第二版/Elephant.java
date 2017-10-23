package 第三章.第二版;

public class Elephant {	//找过去代码的方法，file-->switch	workspace-->browse
	//成员变量一般设计成private类型的，即只允许在本类的方法中使用它
	//int类型默认值为0，char类型的默认值为空对象类型默认值为null，boolean默认false
	private double width;//成员变量，与局部变量不同，在方法之外，而且有默认值，double类型默认0.0。
	private double height;//使用场合：1、对象的属性，2、变量在几个方法中都要用到。
	//与static 变量属于类，由类名调用，成员方法属于对象，由对象来引用
	
	public void enter() {
		//对象行为设计为成员方法，成员方法属于对象，由对象调用，而static方法属于类
		//由类调用。成员方法一般设计成public类型的？因为成员变量已经是private类型的
		//如果成员方法再是private类型的，则该方法只能在本类使用，相应的，本类也不被其他类
		//使用，这样，这个类就不能与其他类合作，就没有用了。成员变量是private是隐藏其值
		//只能在本类的public方法中使用，不能被其他类的方法使用，做到安全封装。
		System.out.println("大象进入");//快捷键 sysout+alt+/
		System.out.println("width="+width);
	}
	
	

}
