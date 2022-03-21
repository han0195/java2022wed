package Day14;

import java.awt.Toolkit;

public class BteepThread extends Thread{
		@Override
	public void run() {// Thread에 있는 run메소드 재정의
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		Thread thread2 = new Thread();
		thread2.start();
			
	}
}
