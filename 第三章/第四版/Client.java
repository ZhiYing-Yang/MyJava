package 第三章.第四版;

public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scene aScene = new Scene();

		
		Animal aAnimal = new Elephant();
		aScene.setaAnimal(aAnimal);

		Box aBox = new IceBox();
		aScene.setaBox(aBox);
		
		Controller aController = new Person();
		aScene.setaController(aController);

		Entering aEntering = new EnterWay1();
		aScene.setaEntering(aEntering);

		Opening aOpening = new OpenWay1();
		aScene.setaOpening(aOpening);

		Closing aClosing = new CloseWay1();
		aScene.setaClosing(aClosing);
		/*System.out.println("共有" + Cat.getNum_cat() + "只猫");
		System.out.println("共有" + Elephant.getNum_elephant() + "个大象");
		System.out.println("共有" + Animal.getNum_animal() + "个动物");*/
		// 场景二：猫，笼子，电
		Scene bScene = new Scene();
		Animal bAnimal = new Cat();
		bScene.setaAnimal(bAnimal);
		

		Box aCage = new Cage();
		bScene.setaBox(aCage);

		Controller aElectricity = new Electricity();
		bScene.setaController(aElectricity);

		Entering bEntering = new EnterWay1();
		bScene.setaEntering(bEntering);

		Opening bOpening = new OpenWay1();
		bScene.setaOpening(bOpening);

		Closing bClosing = new CloseWay1();
		bScene.setaClosing(bClosing);
	
		/*System.out.println("共有" + Cat.getNum_cat() + "只猫");
		System.out.println("共有" + Elephant.getNum_elephant() + "个大象");
		System.out.println("共有" + Animal.getNum_animal() + "个动物");*/
		
		aScene.start();
		bScene.start();

	}
}
