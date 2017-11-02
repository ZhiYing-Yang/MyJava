package 第七章.例二;

public class Sample2 {
	// throws就是本方法不处理异常，而是让调用本方法的方法（main）处理.
	// 一般用于数据库连接不上，网络连接不上，文件打不开，文件找不到，等程序本身解决不了的问题
	public static void throwsEx() throws ArithmeticException {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = 10 / i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2.throwsEx();
	}

}
