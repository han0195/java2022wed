package 타이어예제;

public class 원정대 {
	캐릭터 선봉 = new 전사(20, 5);
	캐릭터 서포터 = new 힐러(10, 5);
	캐릭터 딜러 = new 궁수(10, 5);
	
	
	public int 사냥시작() {
		System.out.println("사냥시작");
		if(선봉.사냥() == false) {return 1;}
		if(서포터.사냥() == false) {return 2;}
		if(딜러.사냥() == false) {return 3;}
		if(선봉.사냥() == false && 서포터.사냥() == false && 딜러.사냥() == false) {return 3;}
		return 0;
	}
}
