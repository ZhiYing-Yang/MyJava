package 王八吃吃睡睡;

public class Client {
	public static void main(String args[]) {
		Eat e = new Eat();
		Sleep s = new Sleep();
		e.start();
		s.start();
	}
}
