package 타이어예제;

public class 전사 extends 캐릭터{
	
	public 전사(int i, int j) {
		super(i, j);
	}

	@Override
	public boolean 사냥() {
		HP--;
		if(HP == 0) {
			System.out.println("전사님 게임오버");
			return false;
		}else {
			System.out.println("남은 HP :" + HP + " 전사");
			return true;
		}
	}
}
