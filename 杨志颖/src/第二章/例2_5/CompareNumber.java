package 第二章.例2_5;

public class CompareNumber {
	public static void compare() {
		int n=3;
		int m=4;	//++n是在n参加>运算之前加1
		System.out.println("n<m is "+(n<m));//3<4
		System.out.println("n=m is "+(n=m));//4==4
		System.out.println("n>m is "+(++n>m));
		System.out.println("n is "+n);
	}
	public static void main(String[] args) {
		CompareNumber.compare();
	}
}
