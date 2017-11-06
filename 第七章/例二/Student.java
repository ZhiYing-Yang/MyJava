package 第七章.例二;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {// throws Exception按提示自动生成
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			throw new Exception("非法年龄数据");
		}
	}

	public static void main(String args[]) throws Exception {// throws Exception按提示自动生成
		Student aStudent = new Student();
		aStudent.setAge(200);
	}
}
