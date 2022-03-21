package Day14;

public class Sound extends Thread{
	
	static boolean stop = true; // 실행 여부 [true 시작 false 종료] 
	
	public Sound() {
		// TODO Auto-generated constructor stub
	}
	
	public void Soundsw(boolean stop) {
		this.stop = stop;
		if( stop ) {
			System.out.println("소리재생시작");
		}else {
			System.out.println("소리 끄기");
		}
	}
	
	@Override
	public void run() {
		
		while(stop) {// stop변수가 true이면 무한루프
			System.out.println("소리재생중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
