package 第十章.例一;

import java.io.IOException;

public class StdIO {
	int count = 0;
	byte buffer[];

	public StdIO() throws IOException {
		do {
			System.out.print("请输入：");
			buffer = new byte[512];
			/*
			 * System类中拥有InputStream类的in对象，static类型,in是标准输入对象，即键盘输入。
			 * read(buffer[])是InputStream类的方法, 将读取的内容放到buffer[]中，返回读取的byte类型数据个数count
			 */
			count = System.in.read(buffer);
			// 书上是“字节”，应该为“字节型数据”
			System.out.print("输入的字节型数据是：");
			for (int i = 0; i < count; i++) {
				System.out.print(buffer[i]);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println("输入" + count + "个字节");
		} while (count != 2);
	}

	public static void main(String args[]) throws IOException {
		new StdIO();
	}
}
