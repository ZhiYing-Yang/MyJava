package T2;

import java.util.Arrays;

public class T2 {
	public static void main(String args[]) {
		int[] a = { 2, 4, 1, 5, 6, 3 };
		int[] ji = new int[3];
		int[] ou = new int[3];
		int m = 0, n = 0;
		Arrays.sort(a);
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				ji[m] = a[i];
				m++;
			} else {
				ou[n] = a[i];
				n++;
			}
		}
		System.arraycopy(ou, 0, a, 0, 3);
		System.arraycopy(ji, 0, a, 3, 3);
		System.out.println(Arrays.toString(a));
	}
}
