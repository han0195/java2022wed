package Day15;

public class Day15_06 {
	
	// p.597
		// 스케줄링 : 운영체제가 메모리를 프로세스에게 할당하는 방법
	// p.598~600
	public static void main(String[] args) {
		StartPrintThread startPrintThread = new StartPrintThread(new TargetThread());
		
		startPrintThread.start();
	}
	
	
}
