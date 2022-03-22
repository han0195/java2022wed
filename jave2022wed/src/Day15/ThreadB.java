package Day15;

public class ThreadB extends Thread{

	// 필드
	public boolean stop = false;
	public boolean work = true;
	
	//병렬처리
	@Override
	public void run() {
		while(!stop) { // stop이 false이면 무한루프
			if(work) {	// work가 ture이면 
				System.out.println("THreadB 작업 내용");
			}else { // work가 false이면
				Thread.yield(); // 다른스레드에게 양보
			}
			
		}//
		System.out.println("ThreadB 종료");
	}
	
}
