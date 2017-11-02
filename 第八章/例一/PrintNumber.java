package 第八章.例一;

public class PrintNumber {
	private int num;

	public PrintNumber(int num) {
		this.num = num;
	}

	public void num2() {
		for (int i = 0; i < num; i++) {
			// 数字从0开始，一直到num-1
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 将a输出50次
		PrintLetter t1 = new PrintLetter('a', 50);

		// 输出0-49
		PrintNumber t2 = new PrintNumber(50);

		t1.run1();

		t2.num2();
	}
}