package 第四章.例四;

public class BreakContinue {
	private int i;
	private int j;
	
	public void loop1() {
		for(i=1; i<3; i++) {
			for(j=1; j<3; j++) {
				System.out.println("i="+i+" j="+j);
			}
		}
		System.out.println("--------");
	}
	public void loop2() {
		for(i=1; i<3; i++) {
			for(j=1; j<3; j++) {
				if(j==2) {
					break;
				}else {
					System.out.println("i="+i+" j="+j);
				}
			}
		}
		System.out.println("--------");
	}
	public void loop3() {
		for(i=1; i<3; i++) {
			for(j=1; j<3; j++) {
				if(j==2) {
					continue;
				}else {
					System.out.println("i="+i+" j="+j);
				}
			}
		}
	}
}
