package LastYearTest.T_9_29;

public class Fruit {
	private String fruit_name, path;
	private int before;
	private int now;
	private int after;

	public Fruit() {
		before = 10;
	}

	public Fruit(int before) {
		this.before = before;
	}

	public Fruit(String fruit_name) {
		this(10);
		this.fruit_name = fruit_name;
	}

	public void setJinhuo(int now) {
		this.now = this.before + now;
	}

	public void setXiaoshou(int after) {
		this.after = this.now - after;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void echoInfo() {
		System.out.println(fruit_name + "进货前：" + before + "\t进货后：" + now + "\t销售后：" + after);
	}

	public static void main(String args[]) {
		Fruit apple = new Fruit("苹果");
		apple.setJinhuo(30);
		apple.setXiaoshou(20);
		apple.echoInfo();

		Fruit banner = new Fruit("香蕉");
		banner.setJinhuo(25);
		banner.setXiaoshou(10);
		banner.echoInfo();

		Fruit orange = new Fruit("橙子");
		orange.setJinhuo(45);
		orange.setXiaoshou(50);
		orange.echoInfo();
	}
}
