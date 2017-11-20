package 第三章.第五版;

public interface Controller {
	// 没有abstract修饰，他也要求你去掉方法体，是因为接口中的方法默认是public和abstract.
	// 因此public 和 abstract可以省略。抽象类中的方法可以是抽象的，也可以是非抽象的，
	// 抽象类中可以有成员变量。但接口中只能有成员常量。
	public void controllerOpen();

	public void controllerClose();
}
