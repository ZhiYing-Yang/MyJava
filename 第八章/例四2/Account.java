package 第八章.例四2;

public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		// 获取账户余额
		return balance;
	}

	public int withDraw(int amount) {
		// 取款，amount为取款数
		if(amount<0) {
			System.out.println("取款金额为负值，不能执行取款！");
			return 0;
		}
		else if(balance<amount){
			System.out.println("余额不足，不能执行取款操作！");
			return amount;
		}
		else {
			//当前余额=之前余额-取款数
			balance = balance - amount;
			return amount;
		}
	}

}
