package 第三章.第二版;

public class Client {
	public static void main(String[] args) {

		Scene aScene = new Scene();

		Person aPerson = new Person();
		aScene.setaPerson(aPerson);

		Elephant aElephant = new Elephant();
		aScene.setaElephant(aElephant);

		IceBox aIceBox = new IceBox();
		aScene.setaIceBox(aIceBox);

		aScene.action();
	}
}
