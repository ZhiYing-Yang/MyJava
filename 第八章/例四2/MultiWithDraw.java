package 第八章.例四2;

public class MultiWithDraw extends Thread{
	private Account account;
	private int amount;
	public MultiWithDraw(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		String str = Thread.currentThread().getName()+"取款前余额："+account.getBalance();
		try {
			sleep(5);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(str+"取款："+account.withDraw(amount)+"取款后余额："+account.getBalance());
	}
	
	
	public static void main(String args[]) {
		Account account = new Account(500);
		for(int i = 0; i<=10; i++) {
			(new MultiWithDraw(account, 10+i)).start();
		}
	}
}
