package Test10_28.T1;

public class Client {
	public static void main(String args[]) {
		//场景一：
		Scene aScene = new Scene();
		
		Teacher aTeacher = new OldTeacher();
		aScene.setaTeacher(aTeacher);
		
		Student aStudent = new Undergraduate();
		aScene.setaStudent(aStudent);
		
		aScene.action();
		
		
	}
}
