package 第八章.例二;
/*
 * Runnable中有方法run（），Thread类implements Runnable。
 * 因此，继承Thread类的类才可以定义run（）方法。
 * 有时一个类
 * */
public class PrintNumber implements Runnable{
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
		
		/*
		 * 现在t1不是县城对象，不能调用start（）
		 * start（）和run（）是专门给线程对象定义的
		 * JDK中有Thread(Runnable r)的构造方法，构造方法参数中为了实现Runnable接口
		 * 的类的对象。与addActionLinistener(ActionListener a)一个道理，此处相当于
		 * Runnable r = new PrintLetter()或 Runnable r = new PrintNumber()
		 * 
		 * */
		new Thread(t1).start();
		new Thread(t2).start();
	}
}