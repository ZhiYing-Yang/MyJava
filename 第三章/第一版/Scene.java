package 第三章.第一版;

public class Scene {// 把已有的类组织 起来 一起完成任务

	private Elephant aElephant;
	private IceBox aIceBox;
	private Person aPerson; // = new Person();
	/*
	 * =new Person(); 不可以，因为这是服务器端，不随客户端变化，
	 * 因此，必须要有一个客户端类区别服务器端类。对象的初始化必须到客户端去。但是，这里的对象型变量是private的
	 * 不能再另一个类（客户端类）中可见。反过来，在客户端类中出现的同名的对象变量， 跟类中的同名变量不是同一个。如何让两个类中的同名变量成为同一个变量
	 */

	public Elephant getaElephant() {
		return aElephant;
	}

	/*
	 * get方法没有方法参数，因为他的作用不是传参数，而是获得方法返回值的
	 */
	public void setaElephant(Elephant aElephant) {
		this.aElephant = aElephant;
	}

	public IceBox getaIceBox() {
		return aIceBox;
	}

	public void setaIceBox(IceBox aIceBox) {
		this.aIceBox = aIceBox;
	}

	public Person getaPerson() {
		return aPerson;
	}

	public void setaPerson(Person person) {
		this.aPerson = person;
	}

	public void action() {

		aPerson.pull();
		aIceBox.open();
		aElephant.enter();
		aPerson.push();
		aIceBox.close();
	}
}
