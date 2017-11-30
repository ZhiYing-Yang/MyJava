package test2017_11_30.T1;

public class PrintName extends Thread{
	private String name;
	private int time;
	public PrintName(String name, int time) {
		this.name=name;
		this.time = time;
	}
	public void run() {
		for(int i=0; i<time; i++) {
			System.out.print(name);
		}
	}
	
}
