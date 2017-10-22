package 第二章.例2_7;

public class BitOperator {
	public static void bitOperator() {
		int x = 3;
		int y = 5;
		int z = 0;
		z = ~x;
		System.out.println("z = " + z);
		z = x & y;
		System.out.println("z = " + z);
		z=x^y;
		System.out.println("z="+z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitOperator.bitOperator();
	}

}
