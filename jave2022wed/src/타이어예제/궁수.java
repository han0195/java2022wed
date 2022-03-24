package 타이어예제;

public class 궁수 extends 캐릭터{
	
	public 궁수(int i, int j) {
		super(i, j);
	}
	
	public boolean 사냥() {
		HP--;
		if(HP == 0) {
			System.out.println("궁수님 게임오버");
			return false;
		}else {
			System.out.println("남은 HP :" + HP + " 궁수");
			return true;
		}
	}
}
