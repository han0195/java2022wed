package Day15;

import java.awt.Toolkit;

public class Day15_07 {
	public static void main(String[] args) throws InterruptedException {
		
		//p601. 스레드 제어
			// 1. sleep() : 주어진 시간동안 일시 정지
				// 시간 단위 : 밀리초(1000/1초)
				// 일반 예외 발생 : 일시정지상태에서 주어진 시간이 되기전에 실행대기
			// 2. Thread.yield() : 다른 스레드에게 실행 양호
		
//		//p.602. sleep 예제
//		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리 관련 클래스
//		for(int i = 0; i < 10; i++) {
//			toolkit.beep();
//			Thread.sleep(3000); // 3초간 일시정지
//			
//		}
		
		// 1. 객체생성
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		//스레드 시작
		threadA.start();
		threadB.start();
		// 4. 스레드 3초간 일시정지
		try { Thread.sleep(3000);}catch(Exception e) {}
		// 5. 스레드A에 work 값 변경
		threadA.work = false; // -> Thread.yield();
		
		// 4. 스레드 3초간 일시정지
		try { Thread.sleep(3000);}catch(Exception e) {}
		// 5. 스레드A에 work 값 변경
		threadA.work = true; // -> Thread.yield();
		
		// 4. 스레드 3초간 일시정지
			try { Thread.sleep(3000);}catch(Exception e) {}
		//6. 스레드A, 스레드B 종료
			threadA.stop = true;
			threadB.stop = true;
			
		//7.
		threadA.stop(); // 권장하지않은 메소드 [ 스레드의 안정성x ]
		
		
		
		
	}
}
