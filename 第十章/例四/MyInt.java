package 第十章.例四;

public class MyInt implements java.io.Serializable{
	private int value;
	private String number;
	private static int count = 0;
	public MyInt(int v) {//把一个数转换成一个对象
		// TODO Auto-generated constructor stub
		this.number = ""+this.count;
		this.value = v;
		this.count++;
	}
	
	public String toString() {
		//int类型+字符类型自动转换为字符类型
		return "第"+this.number+"个数字的值是："+this.value;
	}

}
