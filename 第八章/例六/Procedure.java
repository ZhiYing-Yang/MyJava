package 第八章.例六;

import java.util.Random;

public class Procedure extends Thread{
	private Buffer br;
	Random r = new Random();
	
	public Procedure(Buffer br) {
		this.br = br;
	}
	
	public void run() {
		for(int i=0; i<=5; i++) {
			//int的65对应char字符为字母A，循环生成A-T
			char ch = (char)(65+r.nextInt(20));
			//把生成的字符放入缓冲区
			br.put(ch);
			System.out.println("生产者"+i+"生产了产品"+ch);
			try {
				sleep(5);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}