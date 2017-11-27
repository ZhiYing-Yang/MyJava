package 第八章.例六;

public class Buffer {
	private char chBuffer;	//共享缓冲区
	private boolean bufferEmpty = true;
	
	public synchronized void put(char ch) {
		while(!bufferEmpty) {
			try{
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		chBuffer = ch;//将生产出的产品放到缓冲区
		bufferEmpty = false;
		notify();
	}

	public synchronized char get() {//从缓冲区提取字符
		// TODO Auto-generated method stub
		while(bufferEmpty) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		char chr = chBuffer;//把缓冲区的chBuffer赋给临时变量chr
		chBuffer = '\0';//chBuffer提取后，赋空
		bufferEmpty = true;
		notify();
		return chr;//把chr返回。
	}

}
