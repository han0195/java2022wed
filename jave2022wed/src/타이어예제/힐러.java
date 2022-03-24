package 타이어예제;

public class 힐러 extends 캐릭터{
	
	public 힐러(int i, int j) {
		super(i, j);
	}
	
	public boolean 사냥() {
		HP--;
		if(HP == 0) {
			System.out.println("힐러님 게임오버");
			return false;
		}else {
			System.out.println("남은 HP :" + HP + " 힐러");
			return true;
		}
	}
}
