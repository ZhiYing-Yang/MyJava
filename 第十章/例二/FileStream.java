package 第十章.例二;

import java.io.*;

public class FileStream {
	private String fileName;

	public FileStream(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	private void writeFile(byte[] buffer) throws IOException {
		// 内存中的数据要和内存外的文件打交道，必须用到FileOutputStream文件字节输出流
		FileOutputStream fout = new FileOutputStream(this.fileName);
		// 将buffer中的数据写到fout中，fout就是ByteFile.dat
		fout.write(buffer);
		fout.close();
		System.out.println("成功写入文件：" + this.fileName);
	}

	private void readFileContent() throws IOException {
		FileInputStream fin = new FileInputStream(this.fileName);
		System.out.println("从文件读取：" + this.fileName);
		byte[] buffer = new byte[20];
		int count = 0;
		do {
			count = fin.read(buffer);
			System.out.println("本次读入=" + count + "个字节");
			for (int i = 0; i < count; i++) {
				System.out.print(buffer[i] + " ");
			}
			System.out.println();
		} while (count != -1);
		fin.close();
	}

	public static void main(String args[]) throws IOException {
		byte[] buffer = new byte[100];
		// 生成100个随机数，然后*100转换成int类型，再强制转换成byte类型
		for (int i = 0; i < 100; i++) {
			// Math.random()生成0.0-1.0之间的double型
			buffer[i] = (byte) (Math.random() * 100);
		}
		FileStream fileStream = new FileStream("ByteFile.dat");
		fileStream.writeFile(buffer);
		fileStream.readFileContent();
	}

}
