package 타이어예제;

public class 캐릭터 {
	int HP;
	int lv;
	
	public 캐릭터() {
		// TODO Auto-generated constructor stub
	}
	public 캐릭터(int hP, int lv) {
		super();
		HP = hP;
		this.lv = lv;
	}
	
	public boolean 사냥() {
		HP--;
		if(HP == 0) {
			System.out.println("게임오버");
			return false;
		}else {
			System.out.println("남은 HP :" + HP + " 비직업");
			return true;
		}
	}
	
	
	
}
