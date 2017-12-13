package 第三章.第四版;

public class Client {
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
		
		Scene bScene = new Scene();
		Animal bAnimal = new Cat();
		bScene.setaAnimal(bAnimal);
		
		Box aCage = new Cage();
		bScene.setaBox(aCage);

		Controller aElectricity = new Electricity();
		bScene.setaController(aElectricity);

		Entering bEntering = new EnterWay2();
		bScene.setaEntering(bEntering);

		Opening bOpening = new OpenWay2();
		bScene.setaOpening(bOpening);

		Closing bClosing = new CloseWay2();
		bScene.setaClosing(bClosing);

		aScene.start();
		bScene.start();
		
	}
}
