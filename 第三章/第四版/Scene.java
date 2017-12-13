package 第三章.第四版;
public class Scene extends Thread {
	private Animal aAnimal;
	private Box aBox;
	private Controller aController;
	private Entering aEntering;
	private Opening aOpening;
	private Closing aClosing;

	private boolean boxOpend = false;
	private boolean controllerDo = false;

	public Animal getaAnimal() {
		return aAnimal;
	}

	public void setaAnimal(Animal aAnimal) {
		this.aAnimal = aAnimal;
	}

	public Box getaBox() {
		return aBox;
	}

	public void setaBox(Box aBox) {
		this.aBox = aBox;
	}

	public Controller getaController() {
		return aController;
	}

	public void setaController(Controller aController) {
		this.aController = aController;
	}

	public Entering getaEntering() {
		return aEntering;
	}

	public void setaEntering(Entering aEntering) {
		this.aEntering = aEntering;
	}

	public Opening getaOpening() {
		return aOpening;
	}

	public void setaOpening(Opening aOpening) {
		this.aOpening = aOpening;
	}

	public Closing getaClosing() {
		return aClosing;
	}

	public void setaClosing(Closing aClosing) {
		this.aClosing = aClosing;
	}

	public void run() {
		synchronized (Controller.class) {
			aController.controllerOpen();
			synchronized (Box.class) {
				aBox.open();
				
				aOpening.openWay();
				aAnimal.enter();
				
				aEntering.enterWay();
				
				aController.controllerClose();
				aClosing.closeWay();
				aBox.close();
				
			}
			
		}
	}
}
