package 第二章.例2_0;

public class Area {
	private double r=2.0; //变量同名不合法
	final double PI=3.14;
	
	private double 2r=2.0; //数字不能打头
	private double _2r=2.0;//下划线可以打头
	
	private double R=2.0;//大小写为不同的命名
	
	private double r#;//首字符只能为字母，下划线， 美元符，之后的增加数字可以，但其他不行
	
	private double getArea() {//两个以上单词，首单词的首字母小写，其他单词的首字母大写
		
	}
}
