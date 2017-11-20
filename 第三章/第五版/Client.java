package 第三章.第五版;

public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scene aScene = new Scene();

		// 场景一：大象，冰箱，人

		// 赋值号左边的是抽象类或接口类型的变量，右边是具体的对象，
		// 这叫上转型，大象是一种动物，解释的通。
		// 右边是具体类必须继承左边的类或实现左边的接口
		Animal aAnimal = new Elephant();
		// 把刚生成的对象-大象，设置成Scene类中的成员变量aAnimal的值
		// 因此action()中的aAnimal就是大象，即大象进入，
		// 设置大象的高度，但Elephant中并没有setHeight方法，原因从父类中继承了父类的方法，
		// 子类若没有，就继承父类，父类中没有，子类中有的成员变量和成员方法是子类特有的，变异的
		// 父类中有，子类中方法名相同，但实现即方法体不同，叫覆盖
		aScene.setaAnimal(aAnimal);
		aAnimal.setHeight(1.8);

		Box aBox = new IceBox();
		aScene.setaBox(aBox);
		aBox.setHeight(1.9);

		Controller aController = new Person();
		aScene.setaController(aController);

		Entering aEntering = new EnterWay1();
		aScene.setaEntering(aEntering);

		Opening aOpening = new OpenWay1();
		aScene.setaOpening(aOpening);

		Closing aClosing = new CloseWay1();
		aScene.setaClosing(aClosing);
		aScene.action();
		System.out.println("共有" + Cat.getNum_cat() + "只猫");
		System.out.println("共有" + Elephant.getNum_elephant() + "个大象");
		System.out.println("共有" + Animal.getNum_animal() + "个动物");
		// 场景二：猫，笼子，电
		Animal bAnimal = new Cat();
		aScene.setaAnimal(bAnimal);
		bAnimal.setHeight(1.8);

		Box aCage = new Cage();
		aScene.setaBox(aCage);
		aCage.setHeight(1.9);

		Controller aElectricity = new Electricity();
		aScene.setaController(aElectricity);

		Entering bEntering = new EnterWay1();
		aScene.setaEntering(bEntering);

		Opening bOpening = new OpenWay1();
		aScene.setaOpening(bOpening);

		Closing bClosing = new CloseWay1();
		aScene.setaClosing(bClosing);
		aScene.action();
		System.out.println("共有" + Cat.getNum_cat() + "只猫");
		System.out.println("共有" + Elephant.getNum_elephant() + "个大象");
		System.out.println("共有" + Animal.getNum_animal() + "个动物");

	}
}
