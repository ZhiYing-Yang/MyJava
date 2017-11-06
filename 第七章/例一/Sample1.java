package 第七章.例一;

public class Sample1 {
	public static void error() {
		int[] a = new int[5];
		for (int i = 0; i <= a.length; i++) {
			try { // 将要出异常的语句放在try的{}后
				a[i] = 10 / i;
			} catch (ArithmeticException e) { // 将要捕获的异常
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException ae) {
				ae.printStackTrace();
				System.out.println("下标越界处i=" + i);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("循环次数i=" + i);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1.error();
	}

}
