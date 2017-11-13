package 练习.大象进冰箱线程2017_11_13;

public class Elephant extends Animal { // 继承是把父类的东西拿下来，无偿使用
	// 增加很多类似大象的类，但是执行剧本的方法，或剧本不能变
	// 找过去代码的方法，file--switch workspace--browse
	// 成员变量一般设计成private类型的，即只允许在本类的方法中使用它
	// int类型默认值为0，char类型的默认值为空对象类型默认值为null，boolean默认false
	private double width;
	private double height;

	public void animalEnter() {// 实现父类中的抽象方法，只添加方法体即可
		System.out.print("大象进入，");// 快捷键 sysout+alt+/
		// System.out.println("width="+width);
	}

	// @Override
	public void animalFalseEnter() {
		// TODO Auto-generated method stub
		System.out.print("大象进不去，");
	}

}
