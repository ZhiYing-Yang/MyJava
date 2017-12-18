package 作业.work2017_12_9;

import java.io.*;

public class File {
	private String rFileName;
	private String wFileName;
	public File(String rFileName, String wFileName) {
		this.rFileName = rFileName;
		this.wFileName = wFileName;
	}
	
	public void rwFile() throws IOException{
		FileReader fin  = new FileReader(this.rFileName);
		BufferedReader din = new BufferedReader(fin);
		String aline = null;
		aline = din.readLine();
		if(aline != null) {
			System.out.println("从"+this.rFileName+"中读取成功，读取的数据为："+aline);
			din.close();
			fin.close();
		}
		else {
			System.out.println("读取失败");
			return;
		}
		FileWriter fout = new FileWriter(this.wFileName);
		BufferedWriter dout = new BufferedWriter(fout);
		dout.write(aline);
		dout.close();
		fout.close();
	}
	
	public static void main(String args[]) throws IOException {
		File f = new File("File1.txt", "File2.txt");
		f.rwFile();
	}
}
