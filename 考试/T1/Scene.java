package T1;

public class Scene {
	private Person aPerson;
	private Car aCar;
	public void setaPerson(Person aPerson) {
		this.aPerson = aPerson;
	}
	public void setaCar(Car aCar) {
		this.aCar = aCar;
	}
	
	public void action(){
		aPerson.drive();
		aCar.run();
	}
}
