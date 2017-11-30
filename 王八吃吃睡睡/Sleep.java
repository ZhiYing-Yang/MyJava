package 王八吃吃睡睡;

public class Sleep extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.print("睡， ");
		}
		
	}
}
