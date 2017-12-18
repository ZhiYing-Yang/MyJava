package 第十章.例七;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class DirFilterList {
	public DirFilterList(InnerFilter filter) {
		File dir = new File(".");
		int count_dirs = 0, count_files = 0;
		long byte_files = 0;
		
		System.out.println(dir.getAbsolutePath()+"目录\r\n");
		File[] files = dir.listFiles(filter);//与例六的区别
		for(int i=0; i<files.length; i++) {
			System.out.print(files[i].getName()+"\t");
			
			if(files[i].isFile()) {
				System.out.print(files[i].length()+"B\t");
				count_files++;
				byte_files +=files[i].length();
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
	static class InnerFilter implements FilenameFilter{
		private String prefix;
		private String extend;
		
		public InnerFilter(String filterStr) {
			this.prefix = "";//文件名前缀
			this.extend = "";//文件扩展名
			filterStr = filterStr.toLowerCase();
			int i = filterStr.indexOf('*');
			if(i>0) {
				this.prefix = filterStr.substring(0, i);//获得从0到i-1结束的子字符串
			}
			int j = filterStr.indexOf('.');
			if(j>0) {
				this.extend = filterStr.substring(j+1);//获得之后的文件扩展名字符串
				if(this.extend.equals("*")) {//识别"*.*"
					this.extend = "";
				}
			}
		}
		
		public InnerFilter() {
			this("*.*");
		}
		@Override
		public boolean accept(File dir, String filename) {
			// TODO Auto-generated method stub
			filename = filename.toLowerCase();
			return (filename.startsWith(this.prefix)) & (filename.endsWith(this.extend));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerFilter filter = new InnerFilter("B*File.dat");
		new DirFilterList(filter);
	}

}
