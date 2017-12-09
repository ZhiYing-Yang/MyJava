package 作业.work2017_12_9;

import java.io.*;

public class File {
	private String rFileName;
	public File(String rFileName) {
		this.rFileName = rFileName;
	}
	
	public void readFile() throws IOException{
		FileReader fin  = new FileReader(this.rFileName);
		BufferedReader din = new BufferedReader(fin);
	}
}
