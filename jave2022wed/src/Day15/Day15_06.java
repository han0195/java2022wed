package Day15;

public class Day15_06 {
	
	// p.597
		// �����ٸ� : �ü���� �޸𸮸� ���μ������� �Ҵ��ϴ� ���
	// p.598~600
	public static void main(String[] args) {
		StartPrintThread startPrintThread = new StartPrintThread(new TargetThread());
		
		startPrintThread.start();
	}
	
	
}
