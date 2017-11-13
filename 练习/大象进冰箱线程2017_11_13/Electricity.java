package 练习.大象进冰箱线程2017_11_13;

public class Electricity implements Controller {
	// 电与人不可能共有一个类，因此，二者各自实现一个接口。
	// 接口是共同行为的拥有者,而抽象类是共同属性和共同行为的拥有者

	// @Override
	public void controllerOpen() {
		// TODO Auto-generated method stub
		System.out.print("电动开门，");
	}

	// @Override
	public void controllerClose() {
		// TODO Auto-generated method stub
		System.out.print("电动关门，");
	}

}
