package Day15;

public class Uesr1 extends Thread{
	
	//�ʵ�
	private Calculator calculator;
	// ������
	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);		
	}
}
