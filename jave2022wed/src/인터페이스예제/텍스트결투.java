package �������̽�����;

import java.util.Random;

public class �ؽ�Ʈ���� implements ���̽�ƽ{
	
	@Override
	public int A��ư(ĳ���� my, ĳ���� com) {
		System.out.println("����");
		com.set����(com.get����() - my.get���ݷ�());
		if(com.get����() <= 0) {
			return 1;
		}
		my.set����(my.get����() - com.get���ݷ�());
		if(my.get����() <= 0) {
			return 2;
		}
		return 0;
	}
	@Override
	public int B��ư(ĳ���� my, ĳ���� com) {
		System.out.println("��Ű����");
		Random random = new Random();
		int Ȯ�� = random.nextInt(5) + 1;
		if(Ȯ�� == 1) {
			System.out.println("��Ű");
			com.set����(com.get����() - (my.get���ݷ�() * 2));
			if(com.get����() <= 0) {
				return 1;
			}
			my.set����(my.get����() - com.get���ݷ�());
			my.set����(my.get����() - com.get���ݷ�());
			if(my.get����() <= 0) {
				return 2;
			}
		}else {
			System.out.println("miss");
			my.set����(my.get����() - com.get���ݷ�());
			if(my.get����() <= 0) {
				return 2;
			}
		}
		return 0;
	}
	@Override
	public void C��ư(ĳ���� my, ĳ���� com) {
		System.out.println("����");
	}
}
