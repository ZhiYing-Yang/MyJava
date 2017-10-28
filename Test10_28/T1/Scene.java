package Test10_28.T1;

public class Scene {
	private Teacher aTeacher;
	private Student aStudent;
	
	public void setaTeacher(Teacher aTeacher) {
		this.aTeacher = aTeacher;
	}
	public void setaStudent(Student aStudent) {
		this.aStudent = aStudent;
	}
	
	public void action() {
		aTeacher.teach();
		aStudent.learn();
	}
}
