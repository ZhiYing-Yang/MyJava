package 第十章.例三;

import java.io.*;

public class DataStream {
	private String fileName;

	public DataStream(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	private void writeFile(double[] buffer) throws IOException {
		// 内存中的数据要和内存外的文件打交道，必须用到FileOutputStream文件字节输出流
		FileOutputStream fout = new FileOutputStream(this.fileName);
		DataOutputStream dout = new DataOutputStream(fout);
		// 将buffer中的数据写到数据输出流中，要一个一个的写
		for (int i = 0; i < buffer.length; i++) {
			dout.writeDouble(buffer[i]);
		}
		dout.close();
		fout.close();
		System.out.println("成功写入文件：" + this.fileName);
	}

	private void readFileContent() throws IOException {
		FileInputStream fin = new FileInputStream(this.fileName);
		DataInputStream din = new DataInputStream(fin);
		System.out.println("从文件读取：" + this.fileName);
		int count = 0;
		while (true) {
			try {
				double i = din.readDouble();
				System.out.print(i + " ");
				count++;
			} catch (EOFException ioe) {
				break;
			}
		}
		System.out.println();
		System.out.println("本次读入" + count + "个双精度浮点数");
		din.close();
		fin.close();
	}

	public static void main(String args[]) throws IOException {
		double[] buffer = new double[100];
		// 生成100个随机数，然后*100转换成int类型，再强制转换成byte类型
		for (int i = 0; i < 100; i++) {
			// Math.random()生成0.0-1.0之间的double型
			buffer[i] = Math.random() * 100;
		}
		DataStream fileStream = new DataStream("DoubleFile.dat");
		fileStream.writeFile(buffer);
		fileStream.readFileContent();
	}

}
