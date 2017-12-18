package 第十章.例六;

import java.io.File;
import java.util.Date;

public class DirList {
	public DirList() {
		//当前目录，目录文件都用FIle定义，为什么
		File dir = new File(".");
		int count_dirs = 0, count_files = 0;
		long byte_files = 0;
		
		// \r\n为什么放在""中  回车换行
		System.out.println(dir.getAbsolutePath()+"目录\r\n");
		
		//返回文件数组  返回当前目录中所有文件
		File [] files = dir.listFiles();
		for(int i=0; i<files.length; i++) {
			System.out.print(files[i].getName()+"\t");//显示文件名
			if(files[i].isFile()) {	//判断指定File对象是否是文件
				System.out.print(files[i].length()+"B\t");//显示文件长度
				count_files++;
				byte_files += files[i].length();
			}
			else {
				System.out.print("<DIR>\t");
				count_dirs++;
			}
			System.out.println(new Date(files[i].lastModified()));
		}
		System.out.println("\r\n共有"+count_files+"个文件，总字节数为"+byte_files);
		System.out.println("共有"+count_dirs+"个目录");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DirList();
	}

}
