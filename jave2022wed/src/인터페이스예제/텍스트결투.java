package 인터페이스예제;

import java.util.Random;

public class 텍스트결투 implements 조이스틱{
	
	@Override
	public int A버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("공격");
		com.set방어력(com.get방어력() - my.get공격력());
		if(com.get방어력() <= 0) {
			return 1;
		}
		my.set방어력(my.get방어력() - com.get공격력());
		if(my.get방어력() <= 0) {
			return 2;
		}
		return 0;
	}
	@Override
	public int B버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("럭키공격");
		Random random = new Random();
		int 확률 = random.nextInt(5) + 1;
		if(확률 == 1) {
			System.out.println("럭키");
			com.set방어력(com.get방어력() - (my.get공격력() * 2));
			if(com.get방어력() <= 0) {
				return 1;
			}
			my.set방어력(my.get방어력() - com.get공격력());
			my.set방어력(my.get방어력() - com.get공격력());
			if(my.get방어력() <= 0) {
				return 2;
			}
		}else {
			System.out.println("miss");
			my.set방어력(my.get방어력() - com.get공격력());
			if(my.get방어력() <= 0) {
				return 2;
			}
		}
		return 0;
	}
	@Override
	public void C버튼(캐릭터 my, 캐릭터 com) {
		System.out.println("도망");
	}
}
