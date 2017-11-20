package 第三章.第五版;

public class Elephant extends Animal {
	// static 表示类的。不是对象的，类名调用，不是由对象调用
	private static int num_elephant;

	public Elephant() {
		num_elephant++;
	}

	public static int getNum_elephant() {
		return num_elephant;
	}

	public static void setNum_elephant(int num_elephant) {
		Elephant.num_elephant = num_elephant;
	}

	public void enter() {// 实现父类中的抽象方法，只添加方法体即可
		System.out.println("大象进入");// 快捷键 sysout+alt+/
		// System.out.println("width="+width);
	}

	// @Override
	public void falseEnter() {
		// TODO Auto-generated method stub
		System.out.println("大象进不去");
	}

}
