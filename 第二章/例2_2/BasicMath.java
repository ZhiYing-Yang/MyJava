package 第二章.例2_2;

public class BasicMath {
	public static void basic() {
		byte b1 = 1;
		byte b2 = 2;
		// byte b3 = b1 + b2;// 错误，至少为int型
		byte b4 = 3 + 2;
		// byte b5 = 2 + b1;
		long m2 = 2L;
		// int i1 = m2 + b1;// m2为long型，运算后结果应为long型
		// int i2 = 2L + 3;// 2为long型，运算后结果为long型
		long m3 = m2 + b1;
		// float z3 = 2.0f + 3.0;// 3.0默认为double型，运算后结果为double型
		double z4 = 2.0f + 3.0;

		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		// System.out.println("b3="+b3);
		System.out.println("b4=" + b4);
		System.out.println("m2=" + m2);
		System.out.println("m3=" + m3);
		System.out.println("z4=" + z4);

	}
}
