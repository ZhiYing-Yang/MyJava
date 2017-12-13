package test2017_11_30.T1;

public class PrintId extends Thread {
	private String id;
	private int time;

	public PrintId(String id, int time) {
		this.id = id;
		this.time = time;
	}

	public void run() {
		for (int i = 0; i < time; i++) {
			System.out.print(id);
		}
	}
}
