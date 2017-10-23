package LastYearTest.Date12_21_T2;

public class suanfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []zimu = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'k'};
		for(int i=0; i<zimu.length; i++) {
			for(int m=0; m<(zimu.length-i-2)/2; m++) {
				System.out.print(" ");
			}
			
			for(int j1=0; j1<i+1; j1++) {
				System.out.print(zimu[i]);
			}
			System.out.print("A");
			System.out.println();
			
		}
	}

}
