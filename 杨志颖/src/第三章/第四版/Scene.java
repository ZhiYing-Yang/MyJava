package 第三章.第四版;//作业：多媒体设备第三版


public class Scene {//不同的动物，容器，控制器开关的一方，随时可能变化，但该类不能变
	
	//面向抽象编程，面向接口编程
	private Animal aAnimal;
	private Box aBox;
	private Controller aController;
	private Entering aEntering;
	private Opening aOpening;
	private Closing aClosing;
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
	public void action() {
		//都是抽象类或接口类型的变量在调用方法，没有具体的变量
		//因此，叫做面向抽象编程
		aController.controllerOpen();
		aBox.open();
		aOpening.openWay();
		if(aBox.getHeight()<aAnimal.getHeight()) {
			System.out.println("超高");
			aAnimal.falseEnter();
		}
		else if(aBox.getWidth()<aAnimal.getWidth()) {
			System.out.println("超宽");
			aAnimal.falseEnter();
		}else {
			aEntering.enterWay();
			aAnimal.enter();
			
		}
		aController.controllerClose();
		aClosing.closeWay();
		aBox.close();
		
	}
	
}
