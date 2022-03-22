package Day15;

public class TargetThread extends Thread{
	
	//병렬처리
	@Override
	public void run() {
		
		for(long i = 0 ; i < 10000000 ; i++) {
			
		}
		//1.5초간 대기 [ 밀리초 = 1000/1 ]
		try {Thread.sleep(1500);}catch(Exception e) {}
		
		for(long i = 0 ; i < 10000000 ; i++) {
			// 10억 반복
		}//for end
		
			
	} // run메소드가 종료되면 스레드 상태 : TERMINATED : 멀티스레드 종료
}
