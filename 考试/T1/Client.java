package T1;

public class Client {
	public static void main(String args[]){
		Scene aScene = new Scene();
		Person aPerson = new Man();
		aScene.setaPerson(aPerson);
		
		Car aCar = new Volks();
		aScene.setaCar(aCar);
		
		aScene.action();
		
	}
}
