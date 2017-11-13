package 练习.大象进冰箱线程2017_11_13;

public class AnimalThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				Animal aAnimal = new Elephant();
				aAnimal.animalEnter();
			}
			else {
				Animal aAnimal = new Cat();
				aAnimal.animalEnter();
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
