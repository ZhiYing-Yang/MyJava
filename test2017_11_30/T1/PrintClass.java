package test2017_11_30.T1;

public class PrintClass extends Thread {
	private String myClass;
	private int time;

	public PrintClass(String myClass, int time) {
		this.myClass = myClass;
		this.time = time;
	}

	public void run() {
		for (int i = 0; i < time; i++) {
			System.out.print(myClass);
		}
	}
}
