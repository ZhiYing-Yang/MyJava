package 第四章.例一;

public class Client {
	public static void main(String args[]) {
		ElseIf ei=new ElseIf();
		
		ei.setMonth(4);
		ei.judgeSeason();
		
		ei.setMonth(13);
		ei.judgeSeason();
	}
	
}
