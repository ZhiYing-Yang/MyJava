package 第八章.例六;

public class Consumer extends Thread{
	private Buffer br;//缓冲区
	public Consumer(Buffer br) {//为消费者线程指定
		this.br = br;
	}
	
	public void run() {
		for(int i=1; i<=5; i++) {
			synchronized(br) {
				char ch = br.get();//从缓冲区提取字符
				if(ch!='\0') {//空字符
					System.out.println("消费者"+i+"消费了产品："+ch);
				}
				else {
					System.out.println("消费者"+i+"没有产品可以消费");
				}
			}
			try {
				sleep(5);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer br = new Buffer();
		Procedure p = new Procedure(br);
		Consumer c = new Consumer(br);
		p.start();
		c.start();
	}

}
