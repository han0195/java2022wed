package Day15;

public class Uesr1 extends Thread{
	
	//필드
	private Calculator calculator;
	// 생성자
	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);		
	}
}
