package Day15;

public class TargetThread extends Thread{
	
	//����ó��
	@Override
	public void run() {
		
		for(long i = 0 ; i < 10000000 ; i++) {
			
		}
		//1.5�ʰ� ��� [ �и��� = 1000/1 ]
		try {Thread.sleep(1500);}catch(Exception e) {}
		
		for(long i = 0 ; i < 10000000 ; i++) {
			// 10�� �ݺ�
		}//for end
		
			
	} // run�޼ҵ尡 ����Ǹ� ������ ���� : TERMINATED : ��Ƽ������ ����
}
