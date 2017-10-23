package LastYearTest.Date12_21_T2;

public class suanfa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []zimu = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'k'};
		for(int i=0; i<zimu.length; i++) {
			for(int m=0; m<((zimu.length+1)*3-(i+2))/2; m++) {
				System.out.print(" ");
			}
			
			String str="";
			for(int j=0; j<i+1; j++) {
				str +=zimu[j];
			}
			System.out.print(str+"A");
			System.out.println();
			
			str =str+","+str+","+str+"A";
			for(int m=0; m<((zimu.length+1)-(i+2))*3/2; m++) {
				System.out.print(" ");
			}
			System.out.println(str);
			System.out.println("\n");
			
		}
	}

}
