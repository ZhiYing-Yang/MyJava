package 第八章.例一2;

public class PrintNumber extends Thread{
	private int num;
	public PrintNumber(int num) {
		this.num = num;
	}
	
	public void run() { //线程体，其中代码为一个线程
		for(int i=0; i<num; i++) {
			//数字从0开始，一直到num-1
			System.out.print(i+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将a输出50次
		PrintLetter t1 = new PrintLetter('a', 50);
		
		//输出0-49
		PrintNumber t2 = new PrintNumber(50);
		
		t1.start();//线程对象.start(),虚拟机自动调用run,和actionPerformed(),main()相同
		t2.start();
	}
}