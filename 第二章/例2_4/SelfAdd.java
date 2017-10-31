package 第二章.例2_4;

public class SelfAdd {
	public static void self() {
		int j = 2, i = 3;
		j *= i -= (i++);
		System.out.println("j=" + j + "i=" + i);
		j = 2;
		i = 3;
		j *= i -= (++i);
		System.out.println("j=" + j + "," + "i=" + i);
	}

	public static void main(String args[]) {
		SelfAdd.self();
	}
}
