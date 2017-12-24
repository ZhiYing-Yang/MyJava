package 第十章.例八;

import java.io.*;

public class FileSort {
	private RandomAccessFile rafile;

	public FileSort(String filename) throws IOException {
		File file = new File(filename);
		if (file.exists()) {
			file.delete();
		}
		this.rafile = new RandomAccessFile(filename, "rw");
	}

	public void sort(int k, long pos) throws IOException {// 从pos位置开始排序数字k
		this.rafile.seek(pos); // 设置文件读指针
		boolean insert = false;
		while (true) {
			try {
				int temp = this.rafile.readInt(); // 读取一个整数 当位置达到末尾时抛出异常
				if (temp > k) {
					long currPos = this.rafile.getFilePointer(); // 获取当前位置
					this.rafile.seek(currPos - 4); // 后退四个字节，对int类型
					this.rafile.writeInt(k); // k插入当前位置
					this.sort(temp, currPos); // 从当前位置开始，对temp排序
					insert = true;
				}
			} catch (EOFException ioe) {
				//ioe.printStackTrace();
				if (insert == false) {
					this.rafile.writeInt(k); // 写入k
				}
				break;
			}
		}
	}

	public void append(int[] table) throws IOException {
		for (int i = 0; i < table.length; i++) {
			this.sort(table[i], 0);
		}
		System.out.println();
	}

	public void readFromFile() throws IOException {
		this.rafile.seek(0);
		while (true) {
			try {
				System.out.print(this.rafile.readInt() + " ");
			} catch (EOFException ioe) {
				System.out.println();
				this.rafile.close();
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] table = { 5, 3, 1, 2, 5, 6, 10, 8 };
		FileSort fileSort = new FileSort("Random.dat");
		fileSort.append(table);
		fileSort.readFromFile();
	}

}
