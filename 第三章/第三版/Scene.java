package 第三章.第三版;//作业：多媒体设备第三版

public class Scene implements Runnable{// 不同的动物，容器，控制器开关的一方，随时可能变化，但该类不能变

	// 面向抽象编程，面向接口编程
	private Animal aAnimal;
	private Box aBox;
	private Controller aController;

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

	public void run() {
		// 都是抽象类或接口类型的变量在调用方法，没有具体的变量
		// 因此，叫做面向抽象编程
		synchronized (aController) {
			synchronized (aBox) {
				synchronized(aAnimal) {
				aController.controllerOpen();
				aBox.boxOpen();
				aAnimal.animalEnter();
				aController.controllerClose();
				aBox.boxClose();
				}
			}
		}
	}
}
