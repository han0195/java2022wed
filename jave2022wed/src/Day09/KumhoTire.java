package Day09;

public class KumhoTire extends Tire{
			//서브클래스 extends 슈퍼클래스
	
	//1. 필드
	
	//2. 생성자
	public KumhoTire (String location, int maxRotaion) {
		super(location, maxRotaion);
	}
	//3. 메소드
	@Override
	public boolean roll() {
		accumulatedRotaion++; // 누적 회전수 1 증가 // 타이어가 회전함
		if(accumulatedRotaion < maxRotaion) {
			// 만약에 누적회전수가 최대회전수보다 작으면 [수명 남음]
			System.out.println(location + "금호타이어 수명: " + (maxRotaion - accumulatedRotaion) + "회" );
			return true;
		}else { // 아니면 [ 수명 없다 ]
			System.out.println("****" + location + "금호타이어 펑크 ****");
			return false;
		}
	}
}
