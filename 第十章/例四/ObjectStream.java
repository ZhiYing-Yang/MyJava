package 第十章.例四;

import java.io.*;

public class ObjectStream {
	private String fileName;
	
	public ObjectStream(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	private void writeFile(Object[] obj) throws IOException {
		// 内存中的数据要和内存外的文件打交道，必须用到FileOutputStream文件字节输出流
		FileOutputStream fout = new FileOutputStream(this.fileName);
		ObjectOutputStream dout = new ObjectOutputStream(fout);
		for (int i = 0; i < obj.length; i++) {
			dout.writeObject(obj[i]);
		}
		dout.close();
		fout.close();
		System.out.println("成功写入文件：" + this.fileName);
	}

	private void readFileContent() throws IOException {
		FileInputStream fin = new FileInputStream(this.fileName);
		ObjectInputStream din = new ObjectInputStream(fin);
		System.out.println("从文件读取：" + this.fileName);
		int count = 0;
		while (true) {
			try {
				//readObject()返回Object，通过(MyInt)强制转换
				MyInt myInt = (MyInt)din.readObject();
				System.out.println(myInt + " ");
				count++;
				
			}catch(IOException ioe) {
				//字节输入流结束用-1，这里为什么用异常，而且break中断
				break;
			}
			catch (Exception e) {//与基本数据类型输入流的区别
				System.out.println(e);
				break;
			}
		}
		System.out.println();
		System.out.println("本次读入" + count + "个双精度浮点数");
		din.close();
		fin.close();
	}

	public static void main(String args[]) throws IOException {
		ObjectStream fileStream = new ObjectStream("ObjFile.dat");
		MyInt[] myInt  = new MyInt[10];
		// 生成100个随机数，然后*100转换成int类型，再强制转换成byte类型
		for (int i = 0; i < 10; i++) {
			// Math.random()生成0.0-1.0之间的double型
			int v = (int)(Math.random() * 100);
			myInt[i] = new MyInt(v);//对象数组通过new生成 对象生成，但是构造方法带参数
		}
		fileStream.writeFile(myInt);
		fileStream.readFileContent();
	}

}
