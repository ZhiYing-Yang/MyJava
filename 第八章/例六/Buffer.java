package 第八章.例六;

public class Buffer {
	private char chBuffer;
	public synchronized void put(char ch) {
		chBuffer = ch;//将生产出的产品放到缓冲区
	}

	public synchronized char get() {//从缓冲区提取字符
		// TODO Auto-generated method stub
		char chr = chBuffer;//把缓冲区的chBuffer赋给临时变量chr
		chBuffer = '\0';//chBuffer提取后，赋空
		
		return chr;//把chr返回。
	}

}
