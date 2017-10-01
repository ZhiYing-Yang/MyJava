package 第二章.例2_6;

public class ShortCircuit {
	public static void shortC() {
		int n=3;
		int m=4;
		//(3>4) && (3)>4
		/*短路与，两个&，即&&，由于“与”运算需要两个操作数都要true时，整体才能为true，
		  短路与的 思想为第一个操作为false时，第二个操作数不再执行，因此下一行的n++没有运行
		*/
		System.out.println("compare result is "+ ((n>m) && (++n)>m ));
		System.out.println("n is "+n);
		//(3<4) && (4)>4
		/*
			下一行的n<m为true,需要判断第二个操作数是否为true，才能知道整体是否为true，
			因此，（++n）得到执行，n加1，变成4
		*/
		System.out.println("compare result is "+ ((n<m) && (++n)>m));
		System.out.println("n is " + n);
	}
	public static void main(String[] args) {
		ShortCircuit.shortC();

	}

}

