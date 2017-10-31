package 第八章.例一;

public class PrintLetter {
	private char letter;
	private int num;
	
	//用构造方法传参代替set方法传参
	public PrintLetter(char ch, int num) {
		this.letter = ch;
		this.num = num;
	}
	
	public void run1() {
		//输出letter共num次
		for(int i=0; i<num; i++) {
			System.out.print(letter+",");
		}
		System.out.println();
	}
}
