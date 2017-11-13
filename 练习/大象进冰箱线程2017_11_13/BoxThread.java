package 练习.大象进冰箱线程2017_11_13;

public class BoxThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				Box aBox = new IceBox();
				aBox.boxOpen();
			}
			else {
				Box aBox = new Cage();
				aBox.boxOpen();
			}
			try {
				sleep(5);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
