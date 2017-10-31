package 第三章.第四版;

public abstract class Animal {
	// 父类有，子类没有，子类继承。继承就是无偿使用。你的是我的，我的不一定是你的
	// 父类没有，子类有，属于子类特有，变异。
	protected double width;
	protected double height;
	// static表示，是类的。不是累的对象的，有类名调用，不是由对象调用
	// protected 专门为继承设计，子女不管在天涯海角都能看到父母，听到父母的声音。子类不管在哪个包中都能看到
	// 在其他包中的父类的成员变量和方法。父类的变量和方法在不同包中的子类中可以应用。当然同包更没问题
	protected static int num_animal;

	public static int getNum_animal() {
		return num_animal;
	}

	public static void setNum_animal(int num_animal) {
		Animal.num_animal = num_animal;
	}

	/*
	 * 构造方法名与类名同，没有void，也没有其他返回类型。因为他默认返回是本类的对象。 new
	 * Elephant()时，默认执行Animal（），new出子类对象时,先逐级执行父类构造方法。
	 * 不是new父类构造方法，因为父类有可能是抽象的，不允许new，但可以执行父类的构造方法
	 * 逐级执行到祖宗类object（），因此，因为这种默认执行，如果各级父类的构造方法中有业务逻辑，
	 * 会默认被执行，有时会出现意想不到的结果。因此，轻易不要在构造方法中添加业务代码，但计算对象个数例外
	 * 
	 * 让构造方法执行有两种：1.让虚拟机自动调用，执行子类的构造方法默认执行父类构造方法时，虚拟机就是默认 执行的父类构造方法。
	 * 2.用new.成员方法的执行用对象调用，用'.'操作符。
	 * 
	 * Animal是抽象类，不能new Animal（）， 为什么还要有Animal（）呢？因为规定：执行子类的构造方法时，
	 * 默认执行父类的构造方法。由虚拟机默认调用。为什么默认执行呢？没有父亲，哪来的儿子呀。没有父类，哪来的子类
	 * 
	 */
	public Animal() {
		num_animal++;
	}

	// 抽象方法没有方法体。抽象类可以有抽象方法和非抽象方法
	// 抽象方法必须在其非抽象子类中实现。实现是指添加方法体。
	// 非抽象类中，不能有抽象方法。
	public abstract void enter();

	public abstract void falseEnter();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
