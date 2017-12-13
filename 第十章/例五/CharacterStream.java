package 第十章.例五;
/*
 * 作业：在一个文件FIle1中有一个字符串abc,另一个文件File2是空的。将File1中的内容写到File2中。
 * 先把File1的内容读取到内存，然后写到File2中。注意两个文件放置的位置。
 * 文件名加绝对地址，上机考试
 * */
import java.io.*;

public class CharacterStream {
	private String fileName;

	public CharacterStream(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}
	private void writeFile(int[] buffer) throws IOException {
		// 内存中的数据要和内存外的文件打交道，必须用到FileOutputStream文件字节输出流
		FileWriter fout = new FileWriter(this.fileName);
		BufferedWriter dout = new BufferedWriter(fout);
		for(int i =0; i<buffer.length; i++) {
			/*
			 * write(int c),将单个字符c写到输出流中，不是Char，是int。
			 * 注意在字节流中是write(buffer[] b),没必要一个一个数组元素的写
			 * */
			dout.write(buffer[i]+" ");
			if((i+1)%10 == 0) {
				//每10个一行
				dout.newLine();
			}
		}
		dout.close();
		fout.close();
		System.out.println("成功写入文件：" + this.fileName);
	}

	private void readFileContent() throws IOException {
		FileReader fin = new FileReader(this.fileName);
		BufferedReader din = new BufferedReader(fin);
		System.out.println("从文件读取：" + this.fileName);
		String aline = null;
		int count = 0;
		do {
			aline = din.readLine();//一次取一行
			if(aline != null) {
				System.out.println(aline);
				count++;
			}
		} while (aline != null);
		
		System.out.println("本次读入"+count+"行数据");
		din.close();
		fin.close();
	}

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		int[] buffer = new int[100];
		// 生成100个随机数，然后*100转换成int类型，再强制转换成byte类型
		for (int i = 0; i < 100; i++) {
			// Math.random()生成0.0-1.0之间的double型
			buffer[i] = (int) (Math.random() * 100);
		}
		CharacterStream fileStream = new CharacterStream("CharFile.dat");
		fileStream.writeFile(buffer);
		fileStream.readFileContent();
	}

}
