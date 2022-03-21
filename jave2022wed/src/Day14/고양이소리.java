package Day14;

public class 绊剧捞家府 extends Thread {

	public void run() {	
		for(int i =0; i < 5; i++) {
			System.out.println("克克克");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}	
		}
	}
}
