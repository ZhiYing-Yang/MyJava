package 练习.大象进冰箱线程2017_11_13;

public class Client{
	public static void main(String[] args) {

		AnimalThread a = new AnimalThread();
		BoxThread b = new BoxThread();
		a.start();
		b.start();

	}
}
