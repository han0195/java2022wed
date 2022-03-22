package Day15;

public class StartPrintThread extends Thread {

	// 필드
	private Thread targetThread;
	// 생성자
	public StartPrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	//병렬처리
	@Override
	public void run() {
		while(true) {
			// 스레드 상태 호출
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			// 스레드 상태 제어
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			// 0.5초간 일시정지
			try {Thread.sleep(500);}catch(Exception e){}
		}
		
		
	}
}
