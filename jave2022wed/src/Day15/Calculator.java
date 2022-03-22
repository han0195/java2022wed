package Day15;

public class Calculator {
	// 필드
	private int memory;
	// 메소드
	public int getMemory() {
		return memory;
	}
	// 메소드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		// 2초간 일시정지;
		try {Thread.sleep(2000);} catch (Exception e) { }
		// memory 출력
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	
}
