package test2017_11_30.T1;

public class Stundet {
	public static void main(String args[]) {
		PrintId pId = new PrintId("1610121028", 28);
		PrintName pName = new PrintName("王八", 28);
		PrintClass pClass = new PrintClass("16-1", 28);
		pId.start();
		pName.start();
		pClass.start();
	}
}
