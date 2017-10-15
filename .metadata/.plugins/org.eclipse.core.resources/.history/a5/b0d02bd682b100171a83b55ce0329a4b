package 第三章.第二版;


public class Scene {//把已有的类组织 起来 一起完成任务
	
	private Elephant aElephant;
	private IceBox aIceBox;
	private Person aPerson; //= new Person();
	/*
	 *=new Person(); 不可以，因为这是服务器端，不随客户端变化，
	 *因此，必须要有一个客户端类区别服务器端类。对象的初始化必须到客户端去。但是，这里的对象型变量是private的
	 *不能再另一个类（客户端类）中可见。反过来，在客户端类中出现的同名的对象变量，
	 *跟类中的同名变量不是同一个。如何让两个类中的同名变量成为同一个变量 
	 *
	 */
	
	/*
	 * get方法没有方法参数，因为他的作用不是传参数，而是获得方法返回值的
	 * 获取方法返回值，方法名之前就要有返回值的类型，此处为IceBox类型
	 * return语句必须有，没有会出错，因为该方法要求有返回值，没有返回语句类型都不对
	 * 传参用set 获得参数用get
	 */
	public Elephant getaElephant() {
		return aElephant;
	/*
	 * aElephant有值以后这个值有可能参加其他运算，如何获得该值，通过调用此方法获得该值
	 */
	}
	
	/*
	 * set方法是传参的，因此返回值类型必须为空，void 类型。两个aIceBox并不是一回事，左边的是本类的成员
	 * 右边的是方法的参数变量， set 方法和get 方法功能 
	 */
	/*
	 * 将来elephant在客户端类的main方法中new出来，然后再那里调用该方法就可以将elephant穿给奔类的eElephant
	 * ，因为本方法为public类型，所以可以调用，而且该方法的执行是在本类，因此，传给aElephant是在本类。
	 * 虽然其为private，但因在本类，所以没有问题
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
		this.aPerson= person;
	}
	
	public void action() {
		
		aPerson.pull();
		aIceBox.open();
		aElephant.enter();
		aPerson.push();
		aIceBox.close();
	/*
	 * java.lang.NullPointerException， 空指针，或对象，对象没有创建
	 * 如何找错误。最下边一行是main方法，不是错误源，而要一直往上找。距离错误类型描述最近或较劲的行，
	 * */
	}
}
