package Day15;

public class User2 extends Thread{
	//필드
	private Calculator calculator;
	// 생성자
	public void setCalculator(Calculator calculator) {
		this.setName("user2");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
